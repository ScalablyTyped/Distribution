package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyprefix extends StObject {
  
  /** @example 3 */
  var id: Double
  
  /**
    * @description Whether this autolink reference matches alphanumeric characters. If false, this autolink reference only matches numeric characters.
    * @example true
    */
  var is_alphanumeric: Boolean
  
  /**
    * @description The prefix of a key that is linkified.
    * @example TICKET-
    */
  var key_prefix: String
  
  /**
    * @description A template for the target URL that is generated if a key was found.
    * @example https://example.com/TICKET?query=<num>
    */
  var url_template: String
}
object Keyprefix {
  
  inline def apply(id: Double, is_alphanumeric: Boolean, key_prefix: String, url_template: String): Keyprefix = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_alphanumeric = is_alphanumeric.asInstanceOf[js.Any], key_prefix = key_prefix.asInstanceOf[js.Any], url_template = url_template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyprefix]
  }
  
  extension [Self <: Keyprefix](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_alphanumeric(value: Boolean): Self = StObject.set(x, "is_alphanumeric", value.asInstanceOf[js.Any])
    
    inline def setKey_prefix(value: String): Self = StObject.set(x, "key_prefix", value.asInstanceOf[js.Any])
    
    inline def setUrl_template(value: String): Self = StObject.set(x, "url_template", value.asInstanceOf[js.Any])
  }
}
