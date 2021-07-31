package typings.nextAuth.anon

import typings.nextAuth.nextAuthBooleans.`true`
import typings.nextAuth.utilsMod.NextApiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieName extends StObject {
  
  var cookieName: js.UndefOr[String] = js.undefined
  
  var raw: `true`
  
  var req: NextApiRequest
  
  var secureCookie: js.UndefOr[Boolean] = js.undefined
}
object CookieName {
  
  @scala.inline
  def apply(req: NextApiRequest): CookieName = {
    val __obj = js.Dynamic.literal(raw = true, req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieName]
  }
  
  @scala.inline
  implicit class CookieNameMutableBuilder[Self <: CookieName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    
    @scala.inline
    def setRaw(value: `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
  }
}
