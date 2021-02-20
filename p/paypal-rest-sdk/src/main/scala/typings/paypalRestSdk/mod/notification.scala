package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notification {
  
  object webhook {
    
    @JSImport("paypal-rest-sdk", "notification.webhook.create")
    @js.native
    def create(data: Webhook, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.create")
    @js.native
    def create(data: Webhook, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.create")
    @js.native
    def create(data: Webhook, config: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.create")
    @js.native
    def create(data: Webhook, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhook.del")
    @js.native
    def del(id: String, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.del")
    @js.native
    def del(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.del")
    @js.native
    def del(id: String, config: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.del")
    @js.native
    def del(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
    @js.native
    def eventTypes(id: String, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
    @js.native
    def eventTypes(id: String, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
    @js.native
    def eventTypes(id: String, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
    @js.native
    def eventTypes(id: String, config: CallbackFunction[EventTypesResponse], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhook.get")
    @js.native
    def get(id: String, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.get")
    @js.native
    def get(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.get")
    @js.native
    def get(id: String, config: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.get")
    @js.native
    def get(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: RequestOptions, config: js.UndefOr[scala.Nothing], cb: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: RequestOptions, config: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookListResponse],
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: CallbackFunction[WebhookListResponse], config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: CallbackFunction[WebhookListResponse], config: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookListResponse],
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: QueryParameters): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: QueryParameters,
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(data: QueryParameters, config: CallbackFunction[WebhookListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.list")
    @js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhook.replace")
    @js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.replace")
    @js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.replace")
    @js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[Webhook]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhook.replace")
    @js.native
    def replace(
      id: String,
      data: js.Array[UpdateRequest],
      config: CallbackFunction[Webhook],
      cb: CallbackFunction[Webhook]
    ): Unit = js.native
    
    @js.native
    trait Webhook extends StObject {
      
      var event_types: js.Array[NotificationEventType] = js.native
      
      val id: js.UndefOr[String] = js.native
      
      val links: js.UndefOr[js.Array[Link]] = js.native
      
      var url: String = js.native
    }
    object Webhook {
      
      @scala.inline
      def apply(event_types: js.Array[NotificationEventType], url: String): Webhook = {
        val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Webhook]
      }
      
      @scala.inline
      implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEvent_types(value: js.Array[NotificationEventType]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent_typesVarargs(value: NotificationEventType*): Self = StObject.set(x, "event_types", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
        
        @scala.inline
        def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WebhookListResponse extends Response {
      
      val webhooks: js.Array[Webhook] = js.native
    }
    object WebhookListResponse {
      
      @scala.inline
      def apply(httpStatusCode: Double, webhooks: js.Array[Webhook]): WebhookListResponse = {
        val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookListResponse]
      }
      
      @scala.inline
      implicit class WebhookListResponseMutableBuilder[Self <: WebhookListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWebhooks(value: js.Array[Webhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "webhooks", js.Array(value :_*))
      }
    }
  }
  
  object webhookEvent {
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
    @js.native
    def get(id: String, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
    @js.native
    def get(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
    @js.native
    def get(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
    @js.native
    def get(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.getAndVerify")
    @js.native
    def getAndVerify(body: WebhookEvent, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: RequestOptions,
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: RequestOptions, config: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: CallbackFunction[WebhookEventListResponse], config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: QueryParameters): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: QueryParameters,
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(data: QueryParameters, config: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.list")
    @js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.resend")
    @js.native
    def resend(id: String, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.resend")
    @js.native
    def resend(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.resend")
    @js.native
    def resend(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.resend")
    @js.native
    def resend(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent.verify")
    @js.native
    def verify(headers: js.Any, body: WebhookEvent, id: String, cb: CallbackFunction[WebhookVerifyResponse]): Unit = js.native
    
    @js.native
    trait WebhookEvent extends StObject {
      
      val create_time: js.UndefOr[String] = js.native
      
      val event_type: js.UndefOr[String] = js.native
      
      val event_version: js.UndefOr[String] = js.native
      
      val id: js.UndefOr[String] = js.native
      
      val resource: js.UndefOr[js.Any] = js.native
      
      val resource_type: js.UndefOr[String] = js.native
      
      val summary: js.UndefOr[String] = js.native
    }
    object WebhookEvent {
      
      @scala.inline
      def apply(): WebhookEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebhookEvent]
      }
      
      @scala.inline
      implicit class WebhookEventMutableBuilder[Self <: WebhookEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
        
        @scala.inline
        def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
        
        @scala.inline
        def setEvent_version(value: String): Self = StObject.set(x, "event_version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent_versionUndefined: Self = StObject.set(x, "event_version", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        @scala.inline
        def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResource_typeUndefined: Self = StObject.set(x, "resource_type", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      }
    }
    
    @js.native
    trait WebhookEventListResponse extends Response {
      
      var events: js.Array[WebhookEvent] = js.native
    }
    object WebhookEventListResponse {
      
      @scala.inline
      def apply(events: js.Array[WebhookEvent], httpStatusCode: Double): WebhookEventListResponse = {
        val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookEventListResponse]
      }
      
      @scala.inline
      implicit class WebhookEventListResponseMutableBuilder[Self <: WebhookEventListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEvents(value: js.Array[WebhookEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventsVarargs(value: WebhookEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      }
    }
    
    @js.native
    trait WebhookVerifyResponse extends StObject {
      
      var verification_status: String = js.native
    }
    object WebhookVerifyResponse {
      
      @scala.inline
      def apply(verification_status: String): WebhookVerifyResponse = {
        val __obj = js.Dynamic.literal(verification_status = verification_status.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookVerifyResponse]
      }
      
      @scala.inline
      implicit class WebhookVerifyResponseMutableBuilder[Self <: WebhookVerifyResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVerification_status(value: String): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object webhookEventType {
    
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: RequestOptions, config: js.UndefOr[scala.Nothing], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: RequestOptions, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(
      data: CallbackFunction[EventTypesResponse],
      config: js.UndefOr[scala.Nothing],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: CallbackFunction[EventTypesResponse], config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(
      data: CallbackFunction[EventTypesResponse],
      config: RequestOptions,
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: CallbackFunction[EventTypesResponse], config: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(
      data: CallbackFunction[EventTypesResponse],
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: QueryParameters): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: QueryParameters, config: js.UndefOr[scala.Nothing], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(data: QueryParameters, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    @JSImport("paypal-rest-sdk", "notification.webhookEventType.list")
    @js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
  }
  
  @js.native
  trait EventTypesResponse extends Response {
    
    val event_types: js.Array[NotificationEventType] = js.native
  }
  object EventTypesResponse {
    
    @scala.inline
    def apply(event_types: js.Array[NotificationEventType], httpStatusCode: Double): EventTypesResponse = {
      val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypesResponse]
    }
    
    @scala.inline
    implicit class EventTypesResponseMutableBuilder[Self <: EventTypesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent_types(value: js.Array[NotificationEventType]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_typesVarargs(value: NotificationEventType*): Self = StObject.set(x, "event_types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NotificationEventType extends StObject {
    
    val description: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var status: js.UndefOr[String] = js.native
  }
  object NotificationEventType {
    
    @scala.inline
    def apply(name: String): NotificationEventType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEventType]
    }
    
    @scala.inline
    implicit class NotificationEventTypeMutableBuilder[Self <: NotificationEventType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
