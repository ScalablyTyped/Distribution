package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.NotificationEventType
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.webhookEventNs.WebhookEvent
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.webhookEventNs.WebhookEventListResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.webhookEventNs.WebhookVerifyResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.webhookNs.Webhook
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notificationNs.webhookNs.WebhookListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification")
@js.native
object notificationNs extends js.Object {
  trait EventTypesResponse extends Response {
    val event_types: js.Array[NotificationEventType]
  }
  
  trait NotificationEventType extends js.Object {
    val description: js.UndefOr[String] = js.undefined
    var name: String
    var status: js.UndefOr[String] = js.undefined
  }
  
  @JSName("webhookEvent")
  @js.native
  object webhookEventNs extends js.Object {
    trait WebhookEvent extends js.Object {
      val create_time: js.UndefOr[String] = js.undefined
      val event_type: js.UndefOr[String] = js.undefined
      val event_version: js.UndefOr[String] = js.undefined
      val id: js.UndefOr[String] = js.undefined
      val resource: js.UndefOr[js.Any] = js.undefined
      val resource_type: js.UndefOr[String] = js.undefined
      val summary: js.UndefOr[String] = js.undefined
    }
    
    trait WebhookEventListResponse extends Response {
      var events: js.Array[WebhookEvent]
    }
    
    trait WebhookVerifyResponse extends js.Object {
      var verification_status: String
    }
    
    def get(id: String, config: RequestOptions): Unit = js.native
    def get(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    def get(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
    def get(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
    def getAndVerify(body: WebhookEvent, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    def list(data: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    def list(data: RequestOptions, config: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    def list(data: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    def list(data: CallbackFunction[WebhookEventListResponse], config: RequestOptions): Unit = js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    def list(
      data: CallbackFunction[WebhookEventListResponse],
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    def list(data: QueryParameters): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    def list(data: QueryParameters, config: CallbackFunction[WebhookEventListResponse]): Unit = js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookEventListResponse],
      cb: CallbackFunction[WebhookEventListResponse]
    ): Unit = js.native
    def resend(id: String, config: RequestOptions): Unit = js.native
    def resend(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
    def resend(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
    def resend(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
    def verify(headers: js.Any, body: WebhookEvent, id: String, cb: CallbackFunction[WebhookVerifyResponse]): Unit = js.native
  }
  
  @JSName("webhookEventType")
  @js.native
  object webhookEventTypeNs extends js.Object {
    def list(data: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(data: RequestOptions, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    def list(data: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(data: CallbackFunction[EventTypesResponse], config: RequestOptions): Unit = js.native
    def list(
      data: CallbackFunction[EventTypesResponse],
      config: RequestOptions,
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    def list(data: CallbackFunction[EventTypesResponse], config: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(
      data: CallbackFunction[EventTypesResponse],
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
    def list(data: QueryParameters): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(data: QueryParameters, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[EventTypesResponse],
      cb: CallbackFunction[EventTypesResponse]
    ): Unit = js.native
  }
  
  @JSName("webhook")
  @js.native
  object webhookNs extends js.Object {
    trait Webhook extends js.Object {
      var event_types: js.Array[NotificationEventType]
      val id: js.UndefOr[String] = js.undefined
      val links: js.UndefOr[js.Array[Link]] = js.undefined
      var url: String
    }
    
    trait WebhookListResponse extends Response {
      val webhooks: js.Array[Webhook]
    }
    
    def create(data: Webhook, config: RequestOptions): Unit = js.native
    def create(data: Webhook, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    def create(data: Webhook, config: CallbackFunction[Webhook]): Unit = js.native
    def create(data: Webhook, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    def del(id: String, config: RequestOptions): Unit = js.native
    def del(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    def del(id: String, config: CallbackFunction[Webhook]): Unit = js.native
    def del(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    def eventTypes(id: String, config: RequestOptions): Unit = js.native
    def eventTypes(id: String, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    def eventTypes(id: String, config: CallbackFunction[EventTypesResponse]): Unit = js.native
    def eventTypes(id: String, config: CallbackFunction[EventTypesResponse], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
    def get(id: String, config: RequestOptions): Unit = js.native
    def get(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    def get(id: String, config: CallbackFunction[Webhook]): Unit = js.native
    def get(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
    def list(data: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions): Unit = js.native
    def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(data: RequestOptions, config: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(
      data: RequestOptions,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    def list(data: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(data: CallbackFunction[WebhookListResponse], config: RequestOptions): Unit = js.native
    def list(
      data: CallbackFunction[WebhookListResponse],
      config: RequestOptions,
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    def list(data: CallbackFunction[WebhookListResponse], config: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(
      data: CallbackFunction[WebhookListResponse],
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    def list(data: QueryParameters): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions): Unit = js.native
    def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(data: QueryParameters, config: CallbackFunction[WebhookListResponse]): Unit = js.native
    def list(
      data: QueryParameters,
      config: CallbackFunction[WebhookListResponse],
      cb: CallbackFunction[WebhookListResponse]
    ): Unit = js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
    def replace(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[Webhook]): Unit = js.native
    def replace(
      id: String,
      data: js.Array[UpdateRequest],
      config: CallbackFunction[Webhook],
      cb: CallbackFunction[Webhook]
    ): Unit = js.native
  }
  
}

