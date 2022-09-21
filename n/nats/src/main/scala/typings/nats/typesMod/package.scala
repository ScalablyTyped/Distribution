package typings.nats.typesMod

import typings.nats.errorMod.NatsError
import typings.nats.typedsubMod.TypedSubscriptionOptions
import typings.nats.typesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_HOST: /* "127.0.0.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_HOST").asInstanceOf[/* "127.0.0.1" */ String]

inline def DEFAULT_JITTER: /* 100 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_JITTER").asInstanceOf[/* 100 */ Double]

inline def DEFAULT_JITTER_TLS: /* 1000 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_JITTER_TLS").asInstanceOf[/* 1000 */ Double]

inline def DEFAULT_MAX_PING_OUT: /* 2 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_PING_OUT").asInstanceOf[/* 2 */ Double]

inline def DEFAULT_MAX_RECONNECT_ATTEMPTS: /* 10 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_RECONNECT_ATTEMPTS").asInstanceOf[/* 10 */ Double]

inline def DEFAULT_PING_INTERVAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_PING_INTERVAL").asInstanceOf[Double]

inline def DEFAULT_PORT: /* 4222 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_PORT").asInstanceOf[/* 4222 */ Double]

inline def DEFAULT_RECONNECT_TIME_WAIT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_RECONNECT_TIME_WAIT").asInstanceOf[Double]

inline def Empty: js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].selectDynamic("Empty").asInstanceOf[js.typedarray.Uint8Array]

type ConnectFn = js.Function1[/* opts */ ConnectionOptions, js.Promise[NatsConnection]]

type DnsResolveFn = js.Function1[/* h */ String, js.Promise[js.Array[String]]]

type JetStreamPullSubscription = JetStreamSubscription & Pullable

type JetStreamSubscriptionOptions = TypedSubscriptionOptions[JsMsg]

type JsMsgCallback = js.Function2[/* err */ NatsError | Null, /* msg */ JsMsg | Null, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.nats.typesMod.SeqMsgRequest
  - typings.nats.typesMod.LastForMsgRequest
  - scala.Double
*/
type MsgRequest = _MsgRequest | Double

type Nanos = Double

type Subscription = Sub[Msg]

type SubscriptionOptions = SubOpts[Msg]

type URLParseFn = js.Function1[/* u */ String, String]

type callbackFn = js.Function0[Unit]
