package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonInreplytoidHeadersLocation404Content41` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonInreplytoidHeadersLocation
  
  var `404`: Content41
}
object `201ContentApplicationjsonInreplytoidHeadersLocation404Content41` {
  
  inline def apply(`201`: ContentApplicationjsonInreplytoidHeadersLocation, `404`: Content41): `201ContentApplicationjsonInreplytoidHeadersLocation404Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonInreplytoidHeadersLocation404Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonInreplytoidHeadersLocation404Content41`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonInreplytoidHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
