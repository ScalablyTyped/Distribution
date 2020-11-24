package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticMetadataResult extends js.Object {
  
  def Clone(): IAutomaticMetadataResult = js.native
  
  val PropertyValueSuggestions: IPropertyValueSuggestions = js.native
}
object IAutomaticMetadataResult {
  
  @scala.inline
  def apply(Clone: () => IAutomaticMetadataResult, PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
  
  @scala.inline
  implicit class IAutomaticMetadataResultOps[Self <: IAutomaticMetadataResult] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IAutomaticMetadataResult): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyValueSuggestions(value: IPropertyValueSuggestions): Self = this.set("PropertyValueSuggestions", value.asInstanceOf[js.Any])
  }
}
