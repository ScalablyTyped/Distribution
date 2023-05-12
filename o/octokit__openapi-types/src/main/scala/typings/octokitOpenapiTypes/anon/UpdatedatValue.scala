package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedatValue extends StObject {
  
  /**
    * Format: date-time
    * @description The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    * @example 2019-01-24T22:45:36.000Z
    */
  var created_at: String
  
  /**
    * @description The name of the variable.
    * @example USERNAME
    */
  var name: String
  
  /**
    * Format: date-time
    * @description The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    * @example 2019-01-24T22:45:36.000Z
    */
  var updated_at: String
  
  /**
    * @description The value of the variable.
    * @example octocat
    */
  var value: String
}
object UpdatedatValue {
  
  inline def apply(created_at: String, name: String, updated_at: String, value: String): UpdatedatValue = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedatValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatedatValue] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
