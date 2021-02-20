package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiedProperty extends StObject {
  
  // Indicates the property name of the target attribute that was changed.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the updated value for the propery.
  var newValue: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the previous value (before the update) for the property.
  var oldValue: js.UndefOr[NullableOption[String]] = js.native
}
object ModifiedProperty {
  
  @scala.inline
  def apply(): ModifiedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiedProperty]
  }
  
  @scala.inline
  implicit class ModifiedPropertyMutableBuilder[Self <: ModifiedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNewValue(value: NullableOption[String]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: NullableOption[String]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
