package typings.officeUiFabricReact.inputMaskMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaskValue extends js.Object {
  
  /**
    * This index refers to the index in the displayMask rather than the inputMask.
    * This means that any escaped characters do not count toward this index.
    */
  var displayIndex: Double = js.native
  
  var format: RegExp = js.native
  
  var value: js.UndefOr[String] = js.native
}
object IMaskValue {
  
  @scala.inline
  def apply(displayIndex: Double, format: RegExp): IMaskValue = {
    val __obj = js.Dynamic.literal(displayIndex = displayIndex.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskValue]
  }
  
  @scala.inline
  implicit class IMaskValueOps[Self <: IMaskValue] (val x: Self) extends AnyVal {
    
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
    def setDisplayIndex(value: Double): Self = this.set("displayIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: RegExp): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
