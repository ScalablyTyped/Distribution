package typings.officeUiFabricReact.autofillAutofillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutofillState extends js.Object {
  
  var displayValue: js.UndefOr[String] = js.native
}
object IAutofillState {
  
  @scala.inline
  def apply(): IAutofillState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutofillState]
  }
  
  @scala.inline
  implicit class IAutofillStateOps[Self <: IAutofillState] (val x: Self) extends AnyVal {
    
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
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
  }
}
