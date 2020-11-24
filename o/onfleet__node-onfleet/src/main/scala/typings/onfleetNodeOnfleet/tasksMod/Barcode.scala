package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Barcode extends js.Object {
  
  /** Whether the worker must capture this data prior to task completion, defaults to false */
  var blockCompletion: js.UndefOr[Boolean] = js.native
  
  /** Base64 representation of the data encoded within the barcode to be captured, max length of 500 characters */
  var data: js.UndefOr[String] = js.native
}
object Barcode {
  
  @scala.inline
  def apply(): Barcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Barcode]
  }
  
  @scala.inline
  implicit class BarcodeOps[Self <: Barcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockCompletion(value: Boolean): Self = this.set("blockCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockCompletion: Self = this.set("blockCompletion", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
