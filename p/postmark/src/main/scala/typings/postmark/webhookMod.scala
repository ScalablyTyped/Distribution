package typings.postmark

import typings.postmark.anon.Bounce
import typings.postmark.messageSupportingTypesMod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookMod {
  
  @JSImport("postmark/dist/client/models/webhooks/Webhook", "CreateWebhookRequest")
  @js.native
  class CreateWebhookRequest () extends UpdateWebhookRequest {
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
  }
  
  @JSImport("postmark/dist/client/models/webhooks/Webhook", "UpdateWebhookRequest")
  @js.native
  class UpdateWebhookRequest () extends StObject {
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
    
    @scala.inline
    def apply(Enabled: Boolean): BounceWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceWebhookTrigger]
    }
    
    @scala.inline
    implicit class BounceWebhookTriggerMutableBuilder[Self <: BounceWebhookTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "IncludeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentUndefined: Self = StObject.set(x, "IncludeContent", js.undefined)
    }
  }
  
  trait HttpAuth extends StObject {
    
    var Password: String
    
    var Username: String
  }
  object HttpAuth {
    
    @scala.inline
    def apply(Password: String, Username: String): HttpAuth = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpAuth]
    }
    
    @scala.inline
    implicit class HttpAuthMutableBuilder[Self <: HttpAuth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenWebhookTrigger
    extends StObject
       with WebhookTrigger {
    
    var PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined
  }
  object OpenWebhookTrigger {
    
    @scala.inline
    def apply(Enabled: Boolean): OpenWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebhookTrigger]
    }
    
    @scala.inline
    implicit class OpenWebhookTriggerMutableBuilder[Self <: OpenWebhookTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostFirstOpenOnly(value: Boolean): Self = StObject.set(x, "PostFirstOpenOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostFirstOpenOnlyUndefined: Self = StObject.set(x, "PostFirstOpenOnly", js.undefined)
    }
  }
  
  trait SpamWebhookTrigger
    extends StObject
       with WebhookTrigger {
    
    var IncludeContent: js.UndefOr[Boolean] = js.undefined
  }
  object SpamWebhookTrigger {
    
    @scala.inline
    def apply(Enabled: Boolean): SpamWebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpamWebhookTrigger]
    }
    
    @scala.inline
    implicit class SpamWebhookTriggerMutableBuilder[Self <: SpamWebhookTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "IncludeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentUndefined: Self = StObject.set(x, "IncludeContent", js.undefined)
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
    
    @scala.inline
    def apply(ID: Double, MessageStream: String, Triggers: Bounce, Url: String): Webhook = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Webhook]
    }
    
    @scala.inline
    implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpAuth(value: HttpAuth): Self = StObject.set(x, "HttpAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAuthUndefined: Self = StObject.set(x, "HttpAuth", js.undefined)
      
      @scala.inline
      def setHttpHeaders(value: js.Array[Header]): Self = StObject.set(x, "HttpHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpHeadersUndefined: Self = StObject.set(x, "HttpHeaders", js.undefined)
      
      @scala.inline
      def setHttpHeadersVarargs(value: Header*): Self = StObject.set(x, "HttpHeaders", js.Array(value :_*))
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggers(value: Bounce): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookRequestTriggers extends StObject {
    
    var Bounce: js.UndefOr[BounceWebhookTrigger] = js.undefined
    
    var Click: js.UndefOr[WebhookTrigger] = js.undefined
    
    var Delivery: js.UndefOr[WebhookTrigger] = js.undefined
    
    var Open: js.UndefOr[OpenWebhookTrigger] = js.undefined
    
    var SpamComplaint: js.UndefOr[SpamWebhookTrigger] = js.undefined
  }
  object WebhookRequestTriggers {
    
    @scala.inline
    def apply(): WebhookRequestTriggers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookRequestTriggers]
    }
    
    @scala.inline
    implicit class WebhookRequestTriggersMutableBuilder[Self <: WebhookRequestTriggers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: BounceWebhookTrigger): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "Bounce", js.undefined)
      
      @scala.inline
      def setClick(value: WebhookTrigger): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setDelivery(value: WebhookTrigger): Self = StObject.set(x, "Delivery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryUndefined: Self = StObject.set(x, "Delivery", js.undefined)
      
      @scala.inline
      def setOpen(value: OpenWebhookTrigger): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "Open", js.undefined)
      
      @scala.inline
      def setSpamComplaint(value: SpamWebhookTrigger): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpamComplaintUndefined: Self = StObject.set(x, "SpamComplaint", js.undefined)
    }
  }
  
  trait WebhookTrigger extends StObject {
    
    var Enabled: Boolean
  }
  object WebhookTrigger {
    
    @scala.inline
    def apply(Enabled: Boolean): WebhookTrigger = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookTrigger]
    }
    
    @scala.inline
    implicit class WebhookTriggerMutableBuilder[Self <: WebhookTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
}
