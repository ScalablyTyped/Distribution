package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomField extends StObject {
  
  /**
    * Get the value of the given custom field.
    *
    * @param  key The name of the field to get.
    * @return      The field value, or undefined if it doesn't exist.
    */
  def get(key: String): CustomField
  
  /**
    * Set a custom field.
    *
    * @param   key   The key to set, or map of keys to values.
    * @param          value The value to set, if `key` is not an object.
    * @promise {Object|null}         The new set of custom fields, or null if none are present.
    */
  def set(key: String, value: Any): CustomField
  
  /**
    * Unset the custom field with the given name,
    *
    * @param        key The name of the custom field to remove.
    * @promise {Object|null}     The new set of custom fields, or null if none are present.
    */
  def unset(key: String): CustomField
}
object CustomField {
  
  inline def apply(get: String => CustomField, set: (String, Any) => CustomField, unset: String => CustomField): CustomField = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[CustomField]
  }
  
  extension [Self <: CustomField](x: Self) {
    
    inline def setGet(value: String => CustomField): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => CustomField): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setUnset(value: String => CustomField): Self = StObject.set(x, "unset", js.Any.fromFunction1(value))
  }
}
