package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjson671` extends StObject {
  
  /** @description Response */
  var `202`: ContentApplicationjson671
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `202ContentApplicationjson671` {
  
  inline def apply(
    `202`: ContentApplicationjson671,
    `403`: Content41,
    `404`: Content41,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `202ContentApplicationjson671` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjson671`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202ContentApplicationjson671`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjson671): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
