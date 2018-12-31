package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification")
@js.native
object notificationNs extends js.Object {
  trait EventTypesResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    val event_types: js.Array[NotificationEventType]
  }
  
  trait NotificationEventType extends js.Object {
    val description: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var status: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @JSName("webhookEvent")
  @js.native
  object webhookEventNs extends js.Object {
    trait WebhookEvent extends js.Object {
      val create_time: js.UndefOr[java.lang.String] = js.undefined
      val event_type: js.UndefOr[java.lang.String] = js.undefined
      val event_version: js.UndefOr[java.lang.String] = js.undefined
      val id: js.UndefOr[java.lang.String] = js.undefined
      val resource: js.UndefOr[js.Any] = js.undefined
      val resource_type: js.UndefOr[java.lang.String] = js.undefined
      val summary: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait WebhookEventListResponse
      extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
      var events: js.Array[WebhookEvent]
    }
    
    trait WebhookVerifyResponse extends js.Object {
      var verification_status: java.lang.String
    }
    
    def get(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def getAndVerify(
      body: WebhookEvent,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def list(data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEventListResponse]
    ): scala.Unit = js.native
    def resend(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def resend(
      id: java.lang.String,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def resend(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def resend(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookEvent]
    ): scala.Unit = js.native
    def verify(
      headers: js.Any,
      body: WebhookEvent,
      id: java.lang.String,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookVerifyResponse]
    ): scala.Unit = js.native
  }
  
  @JSName("webhookEventType")
  @js.native
  object webhookEventTypeNs extends js.Object {
    def list(data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
  }
  
  @JSName("webhook")
  @js.native
  object webhookNs extends js.Object {
    trait Webhook extends js.Object {
      var event_types: js.Array[
            paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.NotificationEventType
          ]
      val id: js.UndefOr[java.lang.String] = js.undefined
      val links: js.UndefOr[js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Link]] = js.undefined
      var url: java.lang.String
    }
    
    trait WebhookListResponse
      extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
      val webhooks: js.Array[Webhook]
    }
    
    def create(data: Webhook, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def create(
      data: Webhook,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def create(data: Webhook, config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]): scala.Unit = js.native
    def create(
      data: Webhook,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def del(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def del(
      id: java.lang.String,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def del(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def del(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def eventTypes(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def eventTypes(
      id: java.lang.String,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def eventTypes(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def eventTypes(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[
          paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.notificationNs.EventTypesResponse
        ]
    ): scala.Unit = js.native
    def get(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def get(
      id: java.lang.String,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def list(data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: nodeLib.httpMod.RequestOptions,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def list(
      data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[WebhookListResponse]
    ): scala.Unit = js.native
    def replace(
      id: java.lang.String,
      data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
      config: nodeLib.httpMod.RequestOptions
    ): scala.Unit = js.native
    def replace(
      id: java.lang.String,
      data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
      config: nodeLib.httpMod.RequestOptions,
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def replace(
      id: java.lang.String,
      data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
    def replace(
      id: java.lang.String,
      data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
      config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook],
      cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[Webhook]
    ): scala.Unit = js.native
  }
  
}

