package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatEnabled extends StObject {
  
  /** @example 2011-01-26T19:01:12Z */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @example true */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** @example 2 */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @example v1.* */
  var pattern: String
  
  /** @example 2011-01-26T19:01:12Z */
  var updated_at: js.UndefOr[String] = js.undefined
}
object CreatedatEnabled {
  
  inline def apply(pattern: String): CreatedatEnabled = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedatEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedatEnabled] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
  }
}
