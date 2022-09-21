package typings.nats

import typings.nats.anon.PartialConsumerConfig
import typings.nats.authenticatorMod.Authenticator
import typings.nats.benchMod.BenchOpts
import typings.nats.codecMod.Codec
import typings.nats.headersMod.MsgHdrs
import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.ConsumerOptsBuilder
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.Msg
import typings.nats.typesMod.Nanos
import typings.nats.typesMod.NatsConnection
import typings.nats.utilMod.Deferred_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats", "AckPolicy")
  @js.native
  object AckPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.AckPolicy & String] = js.native
    
    /* "all" */ val All: typings.nats.typesMod.AckPolicy.All & String = js.native
    
    /* "explicit" */ val Explicit: typings.nats.typesMod.AckPolicy.Explicit & String = js.native
    
    /* "none" */ val None: typings.nats.typesMod.AckPolicy.None & String = js.native
    
    /* "" */ val NotSet: typings.nats.typesMod.AckPolicy.NotSet & String = js.native
  }
  
  @JSImport("nats", "AdvisoryKind")
  @js.native
  object AdvisoryKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.AdvisoryKind & String] = js.native
    
    /* "api_audit" */ val API: typings.nats.typesMod.AdvisoryKind.API & String = js.native
    
    /* "consumer_ack" */ val Ack: typings.nats.typesMod.AdvisoryKind.Ack & String = js.native
    
    /* "consumer_action" */ val ConsumerAction: typings.nats.typesMod.AdvisoryKind.ConsumerAction & String = js.native
    
    /* "consumer_leader_elected" */ val ConsumerLeaderElected: typings.nats.typesMod.AdvisoryKind.ConsumerLeaderElected & String = js.native
    
    /* "consumer_quorum_lost" */ val ConsumerQuorumLost: typings.nats.typesMod.AdvisoryKind.ConsumerQuorumLost & String = js.native
    
    /* "max_deliver" */ val MaxDeliver: typings.nats.typesMod.AdvisoryKind.MaxDeliver & String = js.native
    
    /* "restore_complete" */ val RestoreComplete: typings.nats.typesMod.AdvisoryKind.RestoreComplete & String = js.native
    
    /* "restore_create" */ val RestoreCreate: typings.nats.typesMod.AdvisoryKind.RestoreCreate & String = js.native
    
    /* "snapshot_complete" */ val SnapshotComplete: typings.nats.typesMod.AdvisoryKind.SnapshotComplete & String = js.native
    
    /* "snapshot_create" */ val SnapshotCreate: typings.nats.typesMod.AdvisoryKind.SnapshotCreate & String = js.native
    
    /* "stream_action" */ val StreamAction: typings.nats.typesMod.AdvisoryKind.StreamAction & String = js.native
    
    /* "stream_leader_elected" */ val StreamLeaderElected: typings.nats.typesMod.AdvisoryKind.StreamLeaderElected & String = js.native
    
    /* "stream_quorum_lost" */ val StreamQuorumLost: typings.nats.typesMod.AdvisoryKind.StreamQuorumLost & String = js.native
    
    /* "terminated" */ val Terminated: typings.nats.typesMod.AdvisoryKind.Terminated & String = js.native
  }
  
  @JSImport("nats", "Bench")
  @js.native
  open class Bench protected ()
    extends typings.nats.modMod.Bench {
    def this(nc: NatsConnection) = this()
    def this(nc: NatsConnection, opts: BenchOpts) = this()
  }
  
  @JSImport("nats", "DebugEvents")
  @js.native
  object DebugEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.DebugEvents & String] = js.native
    
    /* "pingTimer" */ val PingTimer: typings.nats.typesMod.DebugEvents.PingTimer & String = js.native
    
    /* "reconnecting" */ val Reconnecting: typings.nats.typesMod.DebugEvents.Reconnecting & String = js.native
    
    /* "staleConnection" */ val StaleConnection: typings.nats.typesMod.DebugEvents.StaleConnection & String = js.native
  }
  
  @JSImport("nats", "DeliverPolicy")
  @js.native
  object DeliverPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.DeliverPolicy & String] = js.native
    
    /* "all" */ val All: typings.nats.typesMod.DeliverPolicy.All & String = js.native
    
    /* "last" */ val Last: typings.nats.typesMod.DeliverPolicy.Last & String = js.native
    
    /* "last_per_subject" */ val LastPerSubject: typings.nats.typesMod.DeliverPolicy.LastPerSubject & String = js.native
    
    /* "new" */ val New: typings.nats.typesMod.DeliverPolicy.New & String = js.native
    
    /* "by_start_sequence" */ val StartSequence: typings.nats.typesMod.DeliverPolicy.StartSequence & String = js.native
    
    /* "by_start_time" */ val StartTime: typings.nats.typesMod.DeliverPolicy.StartTime & String = js.native
  }
  
  @JSImport("nats", "DiscardPolicy")
  @js.native
  object DiscardPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.DiscardPolicy & String] = js.native
    
    /* "new" */ val New: typings.nats.typesMod.DiscardPolicy.New & String = js.native
    
    /* "old" */ val Old: typings.nats.typesMod.DiscardPolicy.Old & String = js.native
  }
  
  @JSImport("nats", "Empty")
  @js.native
  val Empty: js.typedarray.Uint8Array = js.native
  
  @JSImport("nats", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.errorMod.ErrorCode & String] = js.native
    
    /* "BAD API" */ val ApiError: typings.nats.errorMod.ErrorCode.ApiError & String = js.native
    
    /* "AUTHENTICATION_EXPIRED" */ val AuthenticationExpired: typings.nats.errorMod.ErrorCode.AuthenticationExpired & String = js.native
    
    /* "AUTHORIZATION_VIOLATION" */ val AuthorizationViolation: typings.nats.errorMod.ErrorCode.AuthorizationViolation & String = js.native
    
    /* "BAD_AUTHENTICATION" */ val BadAuthentication: typings.nats.errorMod.ErrorCode.BadAuthentication & String = js.native
    
    /* "BAD_CREDS" */ val BadCreds: typings.nats.errorMod.ErrorCode.BadCreds & String = js.native
    
    /* "BAD_HEADER" */ val BadHeader: typings.nats.errorMod.ErrorCode.BadHeader & String = js.native
    
    /* "BAD_JSON" */ val BadJson: typings.nats.errorMod.ErrorCode.BadJson & String = js.native
    
    /* "BAD_PAYLOAD" */ val BadPayload: typings.nats.errorMod.ErrorCode.BadPayload & String = js.native
    
    /* "BAD_SUBJECT" */ val BadSubject: typings.nats.errorMod.ErrorCode.BadSubject & String = js.native
    
    /* "CANCELLED" */ val Cancelled: typings.nats.errorMod.ErrorCode.Cancelled & String = js.native
    
    /* "CONNECTION_CLOSED" */ val ConnectionClosed: typings.nats.errorMod.ErrorCode.ConnectionClosed & String = js.native
    
    /* "CONNECTION_DRAINING" */ val ConnectionDraining: typings.nats.errorMod.ErrorCode.ConnectionDraining & String = js.native
    
    /* "CONNECTION_REFUSED" */ val ConnectionRefused: typings.nats.errorMod.ErrorCode.ConnectionRefused & String = js.native
    
    /* "CONNECTION_TIMEOUT" */ val ConnectionTimeout: typings.nats.errorMod.ErrorCode.ConnectionTimeout & String = js.native
    
    /* "DISCONNECT" */ val Disconnect: typings.nats.errorMod.ErrorCode.Disconnect & String = js.native
    
    /* "INVALID_OPTION" */ val InvalidOption: typings.nats.errorMod.ErrorCode.InvalidOption & String = js.native
    
    /* "INVALID_PAYLOAD" */ val InvalidPayload: typings.nats.errorMod.ErrorCode.InvalidPayload & String = js.native
    
    /* "404" */ val JetStream404NoMessages: typings.nats.errorMod.ErrorCode.JetStream404NoMessages & String = js.native
    
    /* "408" */ val JetStream408RequestTimeout: typings.nats.errorMod.ErrorCode.JetStream408RequestTimeout & String = js.native
    
    /* "409" */ val JetStream409: typings.nats.errorMod.ErrorCode.JetStream409 & String = js.native
    
    /* "409" */ val JetStream409MaxAckPendingExceeded: typings.nats.errorMod.ErrorCode.JetStream409MaxAckPendingExceeded & String = js.native
    
    /* "JESTREAM_INVALID_ACK" */ val JetStreamInvalidAck: typings.nats.errorMod.ErrorCode.JetStreamInvalidAck & String = js.native
    
    /* "503" */ val JetStreamNotEnabled: typings.nats.errorMod.ErrorCode.JetStreamNotEnabled & String = js.native
    
    /* "MAX_PAYLOAD_EXCEEDED" */ val MaxPayloadExceeded: typings.nats.errorMod.ErrorCode.MaxPayloadExceeded & String = js.native
    
    /* "503" */ val NoResponders: typings.nats.errorMod.ErrorCode.NoResponders & String = js.native
    
    /* "NOT_FUNC" */ val NotFunction: typings.nats.errorMod.ErrorCode.NotFunction & String = js.native
    
    /* "PERMISSIONS_VIOLATION" */ val PermissionsViolation: typings.nats.errorMod.ErrorCode.PermissionsViolation & String = js.native
    
    /* "NATS_PROTOCOL_ERR" */ val ProtocolError: typings.nats.errorMod.ErrorCode.ProtocolError & String = js.native
    
    /* "REQUEST_ERROR" */ val RequestError: typings.nats.errorMod.ErrorCode.RequestError & String = js.native
    
    /* "SERVER_OPT_NA" */ val ServerOptionNotAvailable: typings.nats.errorMod.ErrorCode.ServerOptionNotAvailable & String = js.native
    
    /* "SUB_CLOSED" */ val SubClosed: typings.nats.errorMod.ErrorCode.SubClosed & String = js.native
    
    /* "SUB_DRAINING" */ val SubDraining: typings.nats.errorMod.ErrorCode.SubDraining & String = js.native
    
    /* "TIMEOUT" */ val Timeout: typings.nats.errorMod.ErrorCode.Timeout & String = js.native
    
    /* "TLS" */ val Tls: typings.nats.errorMod.ErrorCode.Tls & String = js.native
    
    /* "UNKNOWN_ERROR" */ val Unknown: typings.nats.errorMod.ErrorCode.Unknown & String = js.native
    
    /* "WSS_REQUIRED" */ val WssRequired: typings.nats.errorMod.ErrorCode.WssRequired & String = js.native
  }
  
  @JSImport("nats", "Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.Events & String] = js.native
    
    /* "disconnect" */ val Disconnect: typings.nats.typesMod.Events.Disconnect & String = js.native
    
    /* "error" */ val Error: typings.nats.typesMod.Events.Error & String = js.native
    
    /* "ldm" */ val LDM: typings.nats.typesMod.Events.LDM & String = js.native
    
    /* "reconnect" */ val Reconnect: typings.nats.typesMod.Events.Reconnect & String = js.native
    
    /* "update" */ val Update: typings.nats.typesMod.Events.Update & String = js.native
  }
  
  inline def JSONCodec[T](): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")().asInstanceOf[Codec[T]]
  inline def JSONCodec[T](reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")(reviver.asInstanceOf[js.Any]).asInstanceOf[Codec[T]]
  
  @JSImport("nats", "JsHeaders")
  @js.native
  object JsHeaders extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.JsHeaders & String] = js.native
    
    /* "Nats-Consumer-Stalled" */ val ConsumerStalledHdr: typings.nats.typesMod.JsHeaders.ConsumerStalledHdr & String = js.native
    
    /* "Nats-Last-Consumer" */ val LastConsumerSeqHdr: typings.nats.typesMod.JsHeaders.LastConsumerSeqHdr & String = js.native
    
    /* "Nats-Last-Stream" */ val LastStreamSeqHdr: typings.nats.typesMod.JsHeaders.LastStreamSeqHdr & String = js.native
    
    /* "Nats-Msg-Size" */ val MessageSizeHdr: typings.nats.typesMod.JsHeaders.MessageSizeHdr & String = js.native
    
    /* "Nats-Rollup" */ val RollupHdr: typings.nats.typesMod.JsHeaders.RollupHdr & String = js.native
    
    /* "all" */ val RollupValueAll: typings.nats.typesMod.JsHeaders.RollupValueAll & String = js.native
    
    /* "sub" */ val RollupValueSubject: typings.nats.typesMod.JsHeaders.RollupValueSubject & String = js.native
    
    /* "Nats-Stream-Source" */ val StreamSourceHdr: typings.nats.typesMod.JsHeaders.StreamSourceHdr & String = js.native
  }
  
  @JSImport("nats", "Match")
  @js.native
  object Match extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.nats.headersMod.Match & Double] = js.native
    
    /* 1 */ val CanonicalMIME: typings.nats.headersMod.Match.CanonicalMIME & Double = js.native
    
    /* 0 */ val Exact: typings.nats.headersMod.Match.Exact & Double = js.native
    
    /* 2 */ val IgnoreCase: typings.nats.headersMod.Match.IgnoreCase & Double = js.native
  }
  
  @JSImport("nats", "Metric")
  @js.native
  open class Metric protected ()
    extends typings.nats.modMod.Metric {
    def this(name: String, duration: Double) = this()
  }
  /* static members */
  object Metric {
    
    @JSImport("nats", "Metric")
    @js.native
    val ^ : js.Any = js.native
    
    inline def header(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[String]
  }
  
  @JSImport("nats", "MsgHdrsImpl")
  @js.native
  open class MsgHdrsImpl ()
    extends typings.nats.modMod.MsgHdrsImpl
  /* static members */
  object MsgHdrsImpl {
    
    @JSImport("nats", "MsgHdrsImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(a: js.typedarray.Uint8Array): typings.nats.headersMod.MsgHdrsImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[typings.nats.headersMod.MsgHdrsImpl]
    
    inline def validHeaderValue(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validHeaderValue")(k.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("nats", "NatsError")
  @js.native
  open class NatsError protected ()
    extends typings.nats.modMod.NatsError {
    /**
      * @param {String} message
      * @param {String} code
      * @param {Error} [chainedError]
      * @constructor
      *
      * @api private
      */
    def this(message: String, code: String) = this()
    def this(message: String, code: String, chainedError: js.Error) = this()
  }
  /* static members */
  object NatsError {
    
    @JSImport("nats", "NatsError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def errorForCode(code: String): typings.nats.errorMod.NatsError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any]).asInstanceOf[typings.nats.errorMod.NatsError]
    inline def errorForCode(code: String, chainedError: js.Error): typings.nats.errorMod.NatsError = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any], chainedError.asInstanceOf[js.Any])).asInstanceOf[typings.nats.errorMod.NatsError]
  }
  
  @JSImport("nats", "Nuid")
  @js.native
  open class Nuid_ ()
    extends typings.nats.modMod.Nuid_
  
  @JSImport("nats", "ReplayPolicy")
  @js.native
  object ReplayPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.ReplayPolicy & String] = js.native
    
    /* "instant" */ val Instant: typings.nats.typesMod.ReplayPolicy.Instant & String = js.native
    
    /* "original" */ val Original: typings.nats.typesMod.ReplayPolicy.Original & String = js.native
  }
  
  @JSImport("nats", "RetentionPolicy")
  @js.native
  object RetentionPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.RetentionPolicy & String] = js.native
    
    /* "interest" */ val Interest: typings.nats.typesMod.RetentionPolicy.Interest & String = js.native
    
    /* "limits" */ val Limits: typings.nats.typesMod.RetentionPolicy.Limits & String = js.native
    
    /* "workqueue" */ val Workqueue: typings.nats.typesMod.RetentionPolicy.Workqueue & String = js.native
  }
  
  @JSImport("nats", "StorageType")
  @js.native
  object StorageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nats.typesMod.StorageType & String] = js.native
    
    /* "file" */ val File: typings.nats.typesMod.StorageType.File & String = js.native
    
    /* "memory" */ val Memory: typings.nats.typesMod.StorageType.Memory & String = js.native
  }
  
  inline def StringCodec(): Codec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("StringCodec")().asInstanceOf[Codec[String]]
  
  inline def canonicalMIMEHeaderKey(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalMIMEHeaderKey")(k.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def checkJsError(msg: Msg): typings.nats.errorMod.NatsError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsError")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.nats.errorMod.NatsError | Null]
  
  inline def connect(): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[NatsConnection]]
  inline def connect(opts: ConnectionOptions): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatsConnection]]
  
  inline def consumerOpts(): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")().asInstanceOf[ConsumerOptsBuilder]
  inline def consumerOpts(opts: PartialConsumerConfig): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ConsumerOptsBuilder]
  
  inline def createInbox(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")().asInstanceOf[String]
  inline def createInbox(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def credsAuthenticator(creds: js.typedarray.Uint8Array): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("credsAuthenticator")(creds.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def deferred[T](): Deferred_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferred")().asInstanceOf[Deferred_[T]]
  
  inline def headers(): MsgHdrs = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[MsgHdrs]
  
  inline def isFlowControlMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowControlMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHeartbeatMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeartbeatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jwtAuthenticator(ajwt: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: String, seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: String, seed: js.typedarray.Uint8Array): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String]): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String], seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String], seed: js.typedarray.Uint8Array): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  
  inline def millis(ns: Nanos): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millis")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nanos(millis: Double): Nanos = ^.asInstanceOf[js.Dynamic].applyDynamic("nanos")(millis.asInstanceOf[js.Any]).asInstanceOf[Nanos]
  
  inline def nkeyAuthenticator(): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")().asInstanceOf[Authenticator]
  inline def nkeyAuthenticator(seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")(seed.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def nkeyAuthenticator(seed: js.typedarray.Uint8Array): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")(seed.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  @JSImport("nats", "nuid")
  @js.native
  val nuid: typings.nats.nuidMod.Nuid_ = js.native
  
  inline def toJsMsg(m: Msg): JsMsg = ^.asInstanceOf[js.Dynamic].applyDynamic("toJsMsg")(m.asInstanceOf[js.Any]).asInstanceOf[JsMsg]
  
  inline def tokenAuthenticator(token: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenAuthenticator")(token.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def usernamePasswordAuthenticator(user: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def usernamePasswordAuthenticator(user: String, pass: String): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
}
