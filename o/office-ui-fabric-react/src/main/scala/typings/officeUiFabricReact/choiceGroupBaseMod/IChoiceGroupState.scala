package typings.officeUiFabricReact.choiceGroupBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChoiceGroupState extends js.Object {
  
  /**
    * Current selected option, for **internal use only**.
    * External users should access `IChoiceGroup.checkedOption` instead.
    */
  var keyChecked: js.UndefOr[String | Double] = js.native
  
  /** Is set when the control has focus. */
  var keyFocused: js.UndefOr[String | Double] = js.native
}
object IChoiceGroupState {
  
  @scala.inline
  def apply(): IChoiceGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupState]
  }
  
  @scala.inline
  implicit class IChoiceGroupStateOps[Self <: IChoiceGroupState] (val x: Self) extends AnyVal {
    
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
    def setKeyChecked(value: String | Double): Self = this.set("keyChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyChecked: Self = this.set("keyChecked", js.undefined)
    
    @scala.inline
    def setKeyFocused(value: String | Double): Self = this.set("keyFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFocused: Self = this.set("keyFocused", js.undefined)
  }
}
