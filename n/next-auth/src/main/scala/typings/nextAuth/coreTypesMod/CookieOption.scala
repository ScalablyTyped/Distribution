package typings.nextAuth.coreTypesMod

import typings.cookie.mod.CookieSerializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieOption extends StObject {
  
  var name: String
  
  var options: CookieSerializeOptions
}
object CookieOption {
  
  inline def apply(name: String, options: CookieSerializeOptions): CookieOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOption]
  }
  
  extension [Self <: CookieOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CookieSerializeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
