package typings.postmark.webhookMod

import typings.postmark.anon.Bounce
import typings.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webhook extends js.Object {
  
  var HttpAuth: js.UndefOr[typings.postmark.webhookMod.HttpAuth] = js.native
  
  var HttpHeaders: js.UndefOr[js.Array[Header]] = js.native
  
  var ID: Double = js.native
  
  var MessageStream: String = js.native
  
  var Triggers: Bounce = js.native
  
  var Url: String = js.native
}
object Webhook {
  
  @scala.inline
  def apply(ID: Double, MessageStream: String, Triggers: Bounce, Url: String): Webhook = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    
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
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStream(value: String): Self = this.set("MessageStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: Bounce): Self = this.set("Triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpAuth(value: HttpAuth): Self = this.set("HttpAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAuth: Self = this.set("HttpAuth", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: Header*): Self = this.set("HttpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHttpHeaders(value: js.Array[Header]): Self = this.set("HttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("HttpHeaders", js.undefined)
  }
}
