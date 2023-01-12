package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notification {
  
  object webhook {
    
    @JSImport("paypal-rest-sdk", "notification.webhook")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(data: Webhook, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def create(data: Webhook, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def create(data: Webhook, config: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def create(data: Webhook, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def del(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def del(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def del(id: String, config: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def del(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def eventTypes(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTypes")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eventTypes(id: String, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTypes")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eventTypes(id: String, config: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTypes")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eventTypes(id: String, config: CallbackFunction[EventTypesResponse], cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTypes")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def list(data: RequestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: Unit, cb: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[WebhookListResponse]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookListResponse],
      config: Unit,
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[WebhookListResponse], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[WebhookListResponse], config: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookListResponse],
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: Unit, cb: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: CallbackFunction[WebhookListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def replace(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[Webhook]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def replace(
      id: String,
      data: js.Array[UpdateRequest],
      config: CallbackFunction[Webhook],
      cb: CallbackFunction[Webhook]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait Webhook extends StObject {
      
      var event_types: js.Array[NotificationEventType]
      
      val id: js.UndefOr[String] = js.undefined
      
      val links: js.UndefOr[js.Array[Link]] = js.undefined
      
      var url: String
    }
    object Webhook {
      
      inline def apply(event_types: js.Array[NotificationEventType], url: String): Webhook = {
        val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Webhook]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
        
        inline def setEvent_types(value: js.Array[NotificationEventType]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
        
        inline def setEvent_typesVarargs(value: NotificationEventType*): Self = StObject.set(x, "event_types", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
        
        inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebhookListResponse
      extends StObject
         with Response {
      
      val webhooks: js.Array[Webhook]
    }
    object WebhookListResponse {
      
      inline def apply(httpStatusCode: Double, webhooks: js.Array[Webhook]): WebhookListResponse = {
        val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookListResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebhookListResponse] (val x: Self) extends AnyVal {
        
        inline def setWebhooks(value: js.Array[Webhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
        
        inline def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "webhooks", js.Array(value*))
      }
    }
  }
  
  object webhookEvent {
    
    @JSImport("paypal-rest-sdk", "notification.webhookEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAndVerify(body: WebhookEvent, cb: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndVerify")(body.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def list(data: RequestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: Unit, cb: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[WebhookEventListResponse]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: Unit,
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[WebhookEventListResponse], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: Unit, cb: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: CallbackFunction[WebhookEventListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resend(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resend")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resend(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resend")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resend(id: String, config: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resend")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resend(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resend")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def verify(headers: Any, body: WebhookEvent, id: String, cb: CallbackFunction[WebhookVerifyResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any], id.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait WebhookEvent extends StObject {
      
      val create_time: js.UndefOr[String] = js.undefined
      
      val event_type: js.UndefOr[String] = js.undefined
      
      val event_version: js.UndefOr[String] = js.undefined
      
      val id: js.UndefOr[String] = js.undefined
      
      val resource: js.UndefOr[Any] = js.undefined
      
      val resource_type: js.UndefOr[String] = js.undefined
      
      val summary: js.UndefOr[String] = js.undefined
    }
    object WebhookEvent {
      
      inline def apply(): WebhookEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WebhookEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebhookEvent] (val x: Self) extends AnyVal {
        
        inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
        
        inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
        
        inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
        
        inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
        
        inline def setEvent_version(value: String): Self = StObject.set(x, "event_version", value.asInstanceOf[js.Any])
        
        inline def setEvent_versionUndefined: Self = StObject.set(x, "event_version", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
        
        inline def setResource_typeUndefined: Self = StObject.set(x, "resource_type", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      }
    }
    
    trait WebhookEventListResponse
      extends StObject
         with Response {
      
      var events: js.Array[WebhookEvent]
    }
    object WebhookEventListResponse {
      
      inline def apply(events: js.Array[WebhookEvent], httpStatusCode: Double): WebhookEventListResponse = {
        val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookEventListResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebhookEventListResponse] (val x: Self) extends AnyVal {
        
        inline def setEvents(value: js.Array[WebhookEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsVarargs(value: WebhookEvent*): Self = StObject.set(x, "events", js.Array(value*))
      }
    }
    
    trait WebhookVerifyResponse extends StObject {
      
      var verification_status: String
    }
    object WebhookVerifyResponse {
      
      inline def apply(verification_status: String): WebhookVerifyResponse = {
        val __obj = js.Dynamic.literal(verification_status = verification_status.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookVerifyResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebhookVerifyResponse] (val x: Self) extends AnyVal {
        
        inline def setVerification_status(value: String): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object webhookEventType {
    
    @JSImport("paypal-rest-sdk", "notification.webhookEventType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def list(data: RequestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: Unit, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: RequestOptions, config: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: RequestOptions,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[EventTypesResponse]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[EventTypesResponse], config: Unit, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[EventTypesResponse], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[EventTypesResponse],
      config: RequestOptions,
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: CallbackFunction[EventTypesResponse], config: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: CallbackFunction[EventTypesResponse],
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: Unit, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(data: QueryParameters, config: CallbackFunction[EventTypesResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def list(
      data: QueryParameters,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait EventTypesResponse
    extends StObject
       with Response {
    
    val event_types: js.Array[NotificationEventType]
  }
  object EventTypesResponse {
    
    inline def apply(event_types: js.Array[NotificationEventType], httpStatusCode: Double): EventTypesResponse = {
      val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventTypesResponse] (val x: Self) extends AnyVal {
      
      inline def setEvent_types(value: js.Array[NotificationEventType]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
      
      inline def setEvent_typesVarargs(value: NotificationEventType*): Self = StObject.set(x, "event_types", js.Array(value*))
    }
  }
  
  trait NotificationEventType extends StObject {
    
    val description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var status: js.UndefOr[String] = js.undefined
  }
  object NotificationEventType {
    
    inline def apply(name: String): NotificationEventType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEventType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationEventType] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
