package typings.nats

import typings.nats.anon.Consumerrestarts
import typings.nats.anon.Deliveryseq
import typings.nats.anon.PartialConsumerConfig
import typings.nats.anon.PartialConsumerOpts
import typings.nats.jsbaseclientApiMod.BaseApiClient
import typings.nats.queuedIteratorMod.IngestionFilterFn
import typings.nats.typedsubMod.TypedSubscriptionOptions
import typings.nats.typesMod.ConsumerAPI
import typings.nats.typesMod.ConsumerInfo
import typings.nats.typesMod.ConsumerOpts
import typings.nats.typesMod.ConsumerOptsBuilder
import typings.nats.typesMod.JetStreamClient
import typings.nats.typesMod.JetStreamOptions
import typings.nats.typesMod.JetStreamPullSubscription
import typings.nats.typesMod.JetStreamSubscription
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.NatsConnection
import typings.nats.typesMod.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsclientMod {
  
  @JSImport("nats/lib/nats-base-client/jsclient", "JetStreamClientImpl")
  @js.native
  open class JetStreamClientImpl protected ()
    extends BaseApiClient
       with JetStreamClient {
    def this(nc: NatsConnection) = this()
    def this(nc: NatsConnection, opts: JetStreamOptions) = this()
    
    def _buildTypedSubscriptionOpts(jsi: JetStreamSubscriptionInfo): TypedSubscriptionOptions[JsMsg] = js.native
    
    def _maybeCreateConsumer(jsi: JetStreamSubscriptionInfo): js.Promise[Unit] = js.native
    
    def _processOptions(subject: String): js.Promise[JetStreamSubscriptionInfo] = js.native
    def _processOptions(subject: String, opts: PartialConsumerOpts): js.Promise[JetStreamSubscriptionInfo] = js.native
    def _processOptions(subject: String, opts: ConsumerOptsBuilder): js.Promise[JetStreamSubscriptionInfo] = js.native
    
    var api: ConsumerAPI = js.native
    
    def pullSubscribe(subject: String): js.Promise[JetStreamPullSubscription] = js.native
    
    def subscribe(subject: String): js.Promise[JetStreamSubscription] = js.native
    
    @JSName("views")
    def views_MJetStreamClientImpl: Views = js.native
  }
  /* static members */
  object JetStreamClientImpl {
    
    @JSImport("nats/lib/nats-base-client/jsclient", "JetStreamClientImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ingestionFn(ordered: Boolean): IngestionFilterFn[JsMsg] = ^.asInstanceOf[js.Dynamic].applyDynamic("ingestionFn")(ordered.asInstanceOf[js.Any]).asInstanceOf[IngestionFilterFn[JsMsg]]
  }
  
  trait JetStreamSubscriptionInfo
    extends StObject
       with ConsumerOpts {
    
    var api: BaseApiClient
    
    var attached: Boolean
    
    var bind: Boolean
    
    var deliver: String
    
    var flow_control: Consumerrestarts
    
    var last: ConsumerInfo
    
    var ordered_consumer_sequence: Deliveryseq
  }
  object JetStreamSubscriptionInfo {
    
    inline def apply(
      api: BaseApiClient,
      attached: Boolean,
      bind: Boolean,
      config: PartialConsumerConfig,
      deliver: String,
      flow_control: Consumerrestarts,
      last: ConsumerInfo,
      mack: Boolean,
      ordered: Boolean,
      ordered_consumer_sequence: Deliveryseq,
      stream: String
    ): JetStreamSubscriptionInfo = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], bind = bind.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], deliver = deliver.asInstanceOf[js.Any], flow_control = flow_control.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], mack = mack.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], ordered_consumer_sequence = ordered_consumer_sequence.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[JetStreamSubscriptionInfo]
    }
    
    extension [Self <: JetStreamSubscriptionInfo](x: Self) {
      
      inline def setApi(value: BaseApiClient): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setBind(value: Boolean): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setDeliver(value: String): Self = StObject.set(x, "deliver", value.asInstanceOf[js.Any])
      
      inline def setFlow_control(value: Consumerrestarts): Self = StObject.set(x, "flow_control", value.asInstanceOf[js.Any])
      
      inline def setLast(value: ConsumerInfo): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setOrdered_consumer_sequence(value: Deliveryseq): Self = StObject.set(x, "ordered_consumer_sequence", value.asInstanceOf[js.Any])
    }
  }
  
  trait JetStreamSubscriptionInfoable extends StObject {
    
    var info: JetStreamSubscriptionInfo | Null
  }
  object JetStreamSubscriptionInfoable {
    
    inline def apply(): JetStreamSubscriptionInfoable = {
      val __obj = js.Dynamic.literal(info = null)
      __obj.asInstanceOf[JetStreamSubscriptionInfoable]
    }
    
    extension [Self <: JetStreamSubscriptionInfoable](x: Self) {
      
      inline def setInfo(value: JetStreamSubscriptionInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoNull: Self = StObject.set(x, "info", null)
    }
  }
}
