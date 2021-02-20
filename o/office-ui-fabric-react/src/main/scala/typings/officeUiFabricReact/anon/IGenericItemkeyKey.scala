package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker.IGenericItem & {  key :react.react.Key} */
@js.native
trait IGenericItemkeyKey extends StObject {
  
  var ValidationState: typings.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
  
  var imageInitials: String = js.native
  
  var key: typings.react.mod.Key = js.native
  
  var primaryText: String = js.native
}
object IGenericItemkeyKey {
  
  @scala.inline
  def apply(
    ValidationState: ValidationState,
    imageInitials: String,
    key: typings.react.mod.Key,
    primaryText: String
  ): IGenericItemkeyKey = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItemkeyKey]
  }
  
  @scala.inline
  implicit class IGenericItemkeyKeyMutableBuilder[Self <: IGenericItemkeyKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationState(value: ValidationState): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
  }
}
