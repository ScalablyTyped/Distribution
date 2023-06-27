package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201404422503` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonAuthorscountHeadersLocation
  
  var `404`: Content41
  
  var `422`: Content414
  
  var `503`: Content41
}
object `201404422503` {
  
  inline def apply(
    `201`: ContentApplicationjsonAuthorscountHeadersLocation,
    `404`: Content41,
    `422`: Content414,
    `503`: Content41
  ): `201404422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201404422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201404422503`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonAuthorscountHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: Content41): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
