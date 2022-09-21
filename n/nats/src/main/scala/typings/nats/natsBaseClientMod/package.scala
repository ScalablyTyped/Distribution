package typings.nats.natsBaseClientMod

import typings.nats.anon.PartialConsumerConfig
import typings.nats.anon.PartialKvOptions
import typings.nats.authenticatorMod.Authenticator
import typings.nats.codecMod.Codec
import typings.nats.denobufferMod.Reader
import typings.nats.denobufferMod.Writer
import typings.nats.headersMod.MsgHdrs
import typings.nats.natsBaseClientMod.^
import typings.nats.queuedIteratorMod.QueuedIterator
import typings.nats.semverMod.SemVer
import typings.nats.transportMod.TransportFactory
import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.ConsumerOptsBuilder
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.KvCodec
import typings.nats.typesMod.KvCodecs
import typings.nats.typesMod.Msg
import typings.nats.typesMod.Nanos
import typings.nats.typesMod.ServerInfo
import typings.nats.utilMod.Deferred_
import typings.nats.utilMod.Timeout_
import typings.std.TextDecoder
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Base64KeyCodec(): KvCodec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64KeyCodec")().asInstanceOf[KvCodec[String]]

inline def Empty: js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].selectDynamic("Empty").asInstanceOf[js.typedarray.Uint8Array]

inline def INFO: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("INFO").asInstanceOf[js.RegExp]

inline def JSONCodec[T](): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")().asInstanceOf[Codec[T]]
inline def JSONCodec[T](reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")(reviver.asInstanceOf[js.Any]).asInstanceOf[Codec[T]]

inline def MAX_SIZE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MAX_SIZE").asInstanceOf[Double]

inline def NoopKvCodecs(): KvCodecs = ^.asInstanceOf[js.Dynamic].applyDynamic("NoopKvCodecs")().asInstanceOf[KvCodecs]

inline def StringCodec(): Codec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("StringCodec")().asInstanceOf[Codec[String]]

inline def TD: TextDecoder = ^.asInstanceOf[js.Dynamic].selectDynamic("TD").asInstanceOf[TextDecoder]

inline def TE: TextEncoder = ^.asInstanceOf[js.Dynamic].selectDynamic("TE").asInstanceOf[TextEncoder]

inline def canonicalMIMEHeaderKey(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalMIMEHeaderKey")(k.asInstanceOf[js.Any]).asInstanceOf[String]

inline def checkJsError(msg: Msg): typings.nats.errorMod.NatsError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsError")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.nats.errorMod.NatsError | Null]

inline def checkOptions(info: ServerInfo, options: ConnectionOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOptions")(info.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def checkUnsupportedOption(prop: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUnsupportedOption")(prop.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def checkUnsupportedOption(prop: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUnsupportedOption")(prop.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def collect[T](iter: QueuedIterator[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]

inline def compare(a: SemVer, b: SemVer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def consumerOpts(): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")().asInstanceOf[ConsumerOptsBuilder]
inline def consumerOpts(opts: PartialConsumerConfig): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ConsumerOptsBuilder]

inline def createInbox(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")().asInstanceOf[String]
inline def createInbox(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]

inline def credsAuthenticator(creds: js.typedarray.Uint8Array): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("credsAuthenticator")(creds.asInstanceOf[js.Any]).asInstanceOf[Authenticator]

inline def defaultBucketOpts(): PartialKvOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultBucketOpts")().asInstanceOf[PartialKvOptions]

inline def deferred[T](): Deferred_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferred")().asInstanceOf[Deferred_[T]]

inline def delay(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")().asInstanceOf[js.Promise[Unit]]
inline def delay(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def extend(a: Any, b: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(a.asInstanceOf[js.Any]).`++`(b.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]

inline def extractProtocolMessage(a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractProtocolMessage")(a.asInstanceOf[js.Any]).asInstanceOf[String]

inline def headers(): MsgHdrs = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[MsgHdrs]

inline def isFlowControlMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowControlMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isHeartbeatMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeartbeatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isIP(h: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(h.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNatsError(err: js.Error): /* is nats.nats/lib/nats-base-client/error.NatsError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNatsError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is nats.nats/lib/nats-base-client/error.NatsError */ Boolean]
inline def isNatsError(err: typings.nats.errorMod.NatsError): /* is nats.nats/lib/nats-base-client/error.NatsError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNatsError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is nats.nats/lib/nats-base-client/error.NatsError */ Boolean]

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

inline def nkeys: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("nkeys").asInstanceOf[Any]

inline def nuid: typings.nats.nuidMod.Nuid_ = ^.asInstanceOf[js.Dynamic].selectDynamic("nuid").asInstanceOf[typings.nats.nuidMod.Nuid_]

inline def parseIP(h: String): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIP")(h.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]

inline def parseSemVer(s: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemVer")(s.asInstanceOf[js.Any]).asInstanceOf[SemVer]

inline def readAll(r: Reader): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readAll")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def render(frame: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(frame.asInstanceOf[js.Any]).asInstanceOf[String]

inline def setTransportFactory(config: TransportFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTransportFactory")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def timeout[T](ms: Double): Timeout_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[Timeout_[T]]

inline def toJsMsg(m: Msg): JsMsg = ^.asInstanceOf[js.Dynamic].applyDynamic("toJsMsg")(m.asInstanceOf[js.Any]).asInstanceOf[JsMsg]

inline def tokenAuthenticator(token: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenAuthenticator")(token.asInstanceOf[js.Any]).asInstanceOf[Authenticator]

inline def usernamePasswordAuthenticator(user: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
inline def usernamePasswordAuthenticator(user: String, pass: String): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[Authenticator]

inline def writeAll(w: Writer, arr: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAll")(w.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Unit]
