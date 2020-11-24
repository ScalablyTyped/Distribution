package typings.nextAuth.adaptersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/client.SessionProvider & {sendVerificationRequest (params : next-auth.next-auth/adapters.SendVerificationRequestParams): std.Promise<void>,   maxAge :number | undefined} */
@js.native
trait EmailSessionProvider
  extends /* key */ StringDictionary[js.Any] {
  
  var callbackUrl: String = js.native
  
  var id: String = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  def sendVerificationRequest(params: SendVerificationRequestParams): js.Promise[Unit] = js.native
  
  var signinUrl: String = js.native
  
  var `type`: String = js.native
}
object EmailSessionProvider {
  
  @scala.inline
  def apply(
    callbackUrl: String,
    id: String,
    name: String,
    sendVerificationRequest: SendVerificationRequestParams => js.Promise[Unit],
    signinUrl: String,
    `type`: String
  ): EmailSessionProvider = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sendVerificationRequest = js.Any.fromFunction1(sendVerificationRequest), signinUrl = signinUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSessionProvider]
  }
  
  @scala.inline
  implicit class EmailSessionProviderOps[Self <: EmailSessionProvider] (val x: Self) extends AnyVal {
    
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
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendVerificationRequest(value: SendVerificationRequestParams => js.Promise[Unit]): Self = this.set("sendVerificationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSigninUrl(value: String): Self = this.set("signinUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
