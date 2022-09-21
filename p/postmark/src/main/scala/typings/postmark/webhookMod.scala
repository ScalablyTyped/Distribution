package typings.postmark

import typings.postmark.anon.Bounce
import typings.postmark.messageSupportingTypesMod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookMod {
  
  @JSImport("postmark/dist/client/models/webhooks/Webhook", "CreateWebhookRequest")
  @js.native
  open class CreateWebhookRequest () extends UpdateWebhookRequest {
    def this(url: String) = this()
    def this(url: String, triggers: WebhookRequestTriggers) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers) = this()
    def this(url: String, triggers: Unit, httpAuth: HttpAuth) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
    def this(url: Unit, triggers: Unit, httpAuth: HttpAuth) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
    def this(url: String, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: Unit, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: Unit, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header], messageStream: String) = this()
    def this(url: String, triggers: Unit, httpAuth: Unit, httpHeaders: Unit, messageStream: String) = this()
    def this(
      url: String,
      triggers: Unit,
      httpAuth: HttpAuth,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(url: String, triggers: Unit, httpAuth: HttpAuth, httpHeaders: Unit, messageStream: String) = this()
    def this(
      url: String,
      triggers: WebhookRequestTriggers,
      httpAuth: Unit,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(
      url: String,
      triggers: WebhookRequestTriggers,
      httpAuth: Unit,
      httpHeaders: Unit,
      messageStream: String
    ) = this()
    def this(
      url: String,
      triggers: WebhookRequestTriggers,
      httpAuth: HttpAuth,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(
      url: String,
      triggers: WebhookRequestTriggers,
      httpAuth: HttpAuth,
      httpHeaders: Unit,
      messageStream: String
    ) = this()
    def this(url: Unit, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header], messageStream: String) = this()
    def this(url: Unit, triggers: Unit, httpAuth: Unit, httpHeaders: Unit, messageStream: String) = this()
    def this(
      url: Unit,
      triggers: Unit,
      httpAuth: HttpAuth,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(url: Unit, triggers: Unit, httpAuth: HttpAuth, httpHeaders: Unit, messageStream: String) = this()
    def this(
      url: Unit,
      triggers: WebhookRequestTriggers,
      httpAuth: Unit,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(
      url: Unit,
      triggers: WebhookRequestTriggers,
      httpAuth: Unit,
      httpHeaders: Unit,
      messageStream: String
    ) = this()
    def this(
      url: Unit,
      triggers: WebhookRequestTriggers,
      httpAuth: HttpAuth,
      httpHeaders: js.Array[Header],
      messageStream: String
    ) = this()
    def this(
      url: Unit,
      triggers: WebhookRequestTriggers,
      httpAuth: HttpAuth,
      httpHeaders: Unit,
      messageStream: String
    ) = this()
    
    var MessageStream: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/webhooks/Webhook", "UpdateWebhookRequest")
  @js.native
  open class UpdateWebhookRequest () extends StObject {
    def this(url: String) = this()
    def this(url: String, triggers: WebhookRequestTriggers) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers) = this()
    def this(url: String, triggers: Unit, httpAuth: HttpAuth) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
    def this(url: Unit, triggers: Unit, httpAuth: HttpAuth) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
    def this(url: String, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: Unit, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: Unit, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: Unit, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: Unit, httpHeaders: js.Array[Header]) = this()
    def this(url: Unit, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
    
    var HttpAuth: js.UndefOr[typings.postmark.webhookMod.HttpAuth] = js.native
    
    var HttpHeaders: js.UndefOr[js.Array[Header]] = js.native
    
    var Triggers: js.UndefOr[WebhookRequestTriggers] = js.native
    
    var Url: js.UndefOr[String] = js.native
  }
  
  trait BounceWebhookTrigger
    extends StObject
       with WebhookTrigger {
    
    var IncludeContent: js.UndefOr[Boolean] = js.undefined
  }
  object BounceWebhookTrigger {
    
    inline def apply(Enabled: Boolean): BounceWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceWebhookTrigger]
    }
    
    extension [Self <: BounceWebhookTrigger](x: Self) {
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "IncludeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "IncludeContent", js.undefined)
    }
  }
  
  trait HttpAuth extends StObject {
    
    var Password: String
    
    var Username: String
  }
  object HttpAuth {
    
    inline def apply(Password: String, Username: String): HttpAuth = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpAuth]
    }
    
    extension [Self <: HttpAuth](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenWebhookTrigger
    extends StObject
       with WebhookTrigger {
    
    var PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined
  }
  object OpenWebhookTrigger {
    
    inline def apply(Enabled: Boolean): OpenWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebhookTrigger]
    }
    
    extension [Self <: OpenWebhookTrigger](x: Self) {
      
      inline def setPostFirstOpenOnly(value: Boolean): Self = StObject.set(x, "PostFirstOpenOnly", value.asInstanceOf[js.Any])
      
      inline def setPostFirstOpenOnlyUndefined: Self = StObject.set(x, "PostFirstOpenOnly", js.undefined)
    }
  }
  
  trait SpamWebhookTrigger
    extends StObject
       with WebhookTrigger {
    
    var IncludeContent: js.UndefOr[Boolean] = js.undefined
  }
  object SpamWebhookTrigger {
    
    inline def apply(Enabled: Boolean): SpamWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpamWebhookTrigger]
    }
    
    extension [Self <: SpamWebhookTrigger](x: Self) {
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "IncludeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "IncludeContent", js.undefined)
    }
  }
  
  trait Webhook extends StObject {
    
    var HttpAuth: js.UndefOr[typings.postmark.webhookMod.HttpAuth] = js.undefined
    
    var HttpHeaders: js.UndefOr[js.Array[Header]] = js.undefined
    
    var ID: Double
    
    var MessageStream: String
    
    var Triggers: Bounce
    
    var Url: String
  }
  object Webhook {
    
    inline def apply(ID: Double, MessageStream: String, Triggers: Bounce, Url: String): Webhook = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Webhook]
    }
    
    extension [Self <: Webhook](x: Self) {
      
      inline def setHttpAuth(value: HttpAuth): Self = StObject.set(x, "HttpAuth", value.asInstanceOf[js.Any])
      
      inline def setHttpAuthUndefined: Self = StObject.set(x, "HttpAuth", js.undefined)
      
      inline def setHttpHeaders(value: js.Array[Header]): Self = StObject.set(x, "HttpHeaders", value.asInstanceOf[js.Any])
      
      inline def setHttpHeadersUndefined: Self = StObject.set(x, "HttpHeaders", js.undefined)
      
      inline def setHttpHeadersVarargs(value: Header*): Self = StObject.set(x, "HttpHeaders", js.Array(value*))
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      inline def setTriggers(value: Bounce): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookRequestTriggers extends StObject {
    
    var Bounce: js.UndefOr[BounceWebhookTrigger] = js.undefined
    
    var Click: js.UndefOr[WebhookTrigger] = js.undefined
    
    var Delivery: js.UndefOr[WebhookTrigger] = js.undefined
    
    var Open: js.UndefOr[OpenWebhookTrigger] = js.undefined
    
    var SpamComplaint: js.UndefOr[SpamWebhookTrigger] = js.undefined
    
    var SubscriptionChange: js.UndefOr[WebhookTrigger] = js.undefined
  }
  object WebhookRequestTriggers {
    
    inline def apply(): WebhookRequestTriggers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookRequestTriggers]
    }
    
    extension [Self <: WebhookRequestTriggers](x: Self) {
      
      inline def setBounce(value: BounceWebhookTrigger): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "Bounce", js.undefined)
      
      inline def setClick(value: WebhookTrigger): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDelivery(value: WebhookTrigger): Self = StObject.set(x, "Delivery", value.asInstanceOf[js.Any])
      
      inline def setDeliveryUndefined: Self = StObject.set(x, "Delivery", js.undefined)
      
      inline def setOpen(value: OpenWebhookTrigger): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "Open", js.undefined)
      
      inline def setSpamComplaint(value: SpamWebhookTrigger): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
      
      inline def setSpamComplaintUndefined: Self = StObject.set(x, "SpamComplaint", js.undefined)
      
      inline def setSubscriptionChange(value: WebhookTrigger): Self = StObject.set(x, "SubscriptionChange", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionChangeUndefined: Self = StObject.set(x, "SubscriptionChange", js.undefined)
    }
  }
  
  trait WebhookTrigger extends StObject {
    
    var Enabled: Boolean
  }
  object WebhookTrigger {
    
    inline def apply(Enabled: Boolean): WebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookTrigger]
    }
    
    extension [Self <: WebhookTrigger](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
}
