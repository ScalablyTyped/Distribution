package typings.next.anon

import typings.next.distServerApiUtilsMod.NextApiRequestCookies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesNextApiRequestCookies extends StObject {
  
  var cookies: NextApiRequestCookies
}
object CookiesNextApiRequestCookies {
  
  inline def apply(cookies: NextApiRequestCookies): CookiesNextApiRequestCookies = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesNextApiRequestCookies]
  }
  
  extension [Self <: CookiesNextApiRequestCookies](x: Self) {
    
    inline def setCookies(value: NextApiRequestCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
  }
}
