package typings.nextAuth.anon

import typings.nextAuth.nextAuthBooleans.`true`
import typings.nextAuth.utilsMod.NextApiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieName extends js.Object {
  
  var cookieName: js.UndefOr[String] = js.native
  
  var raw: `true` = js.native
  
  var req: NextApiRequest = js.native
  
  var secureCookie: js.UndefOr[Boolean] = js.native
}
object CookieName {
  
  @scala.inline
  def apply(raw: `true`, req: NextApiRequest): CookieName = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieName]
  }
  
  @scala.inline
  implicit class CookieNameOps[Self <: CookieName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRaw(value: `true`): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: NextApiRequest): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setSecureCookie(value: Boolean): Self = this.set("secureCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureCookie: Self = this.set("secureCookie", js.undefined)
  }
}
