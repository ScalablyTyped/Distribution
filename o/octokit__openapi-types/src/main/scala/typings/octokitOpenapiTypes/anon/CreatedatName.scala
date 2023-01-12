package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatName extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  /**
    * @description The name of the secret.
    * @example SECRET_TOKEN
    */
  var name: String
  
  /** Format: date-time */
  var updated_at: String
}
object CreatedatName {
  
  inline def apply(created_at: String, name: String, updated_at: String): CreatedatName = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedatName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedatName] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
