package typings.nextAuth.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderEmailOptions extends js.Object {
  
  var from: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var sendVerificationRequest: js.UndefOr[js.Function1[/* options */ VerificationRequestParams, js.Promise[Unit]]] = js.native
  
  var server: js.UndefOr[String | ProviderEmailServer] = js.native
}
object ProviderEmailOptions {
  
  @scala.inline
  def apply(): ProviderEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderEmailOptions]
  }
  
  @scala.inline
  implicit class ProviderEmailOptionsOps[Self <: ProviderEmailOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setSendVerificationRequest(value: /* options */ VerificationRequestParams => js.Promise[Unit]): Self = this.set("sendVerificationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSendVerificationRequest: Self = this.set("sendVerificationRequest", js.undefined)
    
    @scala.inline
    def setServer(value: String | ProviderEmailServer): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
