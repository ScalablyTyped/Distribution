package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.tasksMod.Barcode
import typings.onfleetNodeOnfleet.tasksMod.CapturedBarcode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captured extends js.Object {
  
  /** Once a task is completed for which barcodes have been captured, the capture details can be found here */
  var captured: js.Array[CapturedBarcode] = js.native
  
  /** The requested barcodes */
  var required: js.Array[Barcode] = js.native
}
object Captured {
  
  @scala.inline
  def apply(captured: js.Array[CapturedBarcode], required: js.Array[Barcode]): Captured = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Captured]
  }
  
  @scala.inline
  implicit class CapturedOps[Self <: Captured] (val x: Self) extends AnyVal {
    
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
    def setCapturedVarargs(value: CapturedBarcode*): Self = this.set("captured", js.Array(value :_*))
    
    @scala.inline
    def setCaptured(value: js.Array[CapturedBarcode]): Self = this.set("captured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: Barcode*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[Barcode]): Self = this.set("required", value.asInstanceOf[js.Any])
  }
}
