package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  var cookies: js.Array[typings.nextAuth.coreLibCookieMod.Cookie]
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
}
object Cookies {
  
  inline def apply(
    cookies: js.Array[typings.nextAuth.coreLibCookieMod.Cookie],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
  ): Cookies = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setCookies(value: js.Array[typings.nextAuth.coreLibCookieMod.Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: typings.nextAuth.coreLibCookieMod.Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
