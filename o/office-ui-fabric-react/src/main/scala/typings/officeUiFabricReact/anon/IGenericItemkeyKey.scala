package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker.IGenericItem & {  key :react.react.Key} */
trait IGenericItemkeyKey extends StObject {
  
  var ValidationState: typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
  
  var imageInitials: String
  
  var key: typings.react.mod.Key
  
  var primaryText: String
}
object IGenericItemkeyKey {
  
  inline def apply(
    ValidationState: ValidationState,
    imageInitials: String,
    key: typings.react.mod.Key,
    primaryText: String
  ): IGenericItemkeyKey = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItemkeyKey]
  }
  
  extension [Self <: IGenericItemkeyKey](x: Self) {
    
    inline def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    inline def setValidationState(value: ValidationState): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
  }
}
