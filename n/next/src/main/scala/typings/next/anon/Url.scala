package typings.next.anon

import typings.next.distServerWebNextUrlMod.NextURL
import typings.next.distServerWebSpecExtensionCookiesMod.ResponseCookies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var cookies: ResponseCookies
  
  var url: js.UndefOr[NextURL] = js.undefined
}
object Url {
  
  inline def apply(cookies: ResponseCookies): Url = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setCookies(value: ResponseCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: NextURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
