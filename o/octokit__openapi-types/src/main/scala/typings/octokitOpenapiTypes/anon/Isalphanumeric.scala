package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isalphanumeric extends StObject {
  
  /**
    * @description Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink reference only matches numeric characters.
    * @default true
    */
  var is_alphanumeric: js.UndefOr[Boolean] = js.undefined
  
  /** @description This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or commit. */
  var key_prefix: String
  
  /** @description The URL must contain `<num>` for the reference number. `<num>` matches different characters depending on the value of `is_alphanumeric`. */
  var url_template: String
}
object Isalphanumeric {
  
  inline def apply(key_prefix: String, url_template: String): Isalphanumeric = {
    val __obj = js.Dynamic.literal(key_prefix = key_prefix.asInstanceOf[js.Any], url_template = url_template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isalphanumeric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Isalphanumeric] (val x: Self) extends AnyVal {
    
    inline def setIs_alphanumeric(value: Boolean): Self = StObject.set(x, "is_alphanumeric", value.asInstanceOf[js.Any])
    
    inline def setIs_alphanumericUndefined: Self = StObject.set(x, "is_alphanumeric", js.undefined)
    
    inline def setKey_prefix(value: String): Self = StObject.set(x, "key_prefix", value.asInstanceOf[js.Any])
    
    inline def setUrl_template(value: String): Self = StObject.set(x, "url_template", value.asInstanceOf[js.Any])
  }
}
