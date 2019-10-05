package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandshakeType extends js.Object

@JSImport("node-forge", "tls.HandshakeType")
@js.native
object HandshakeType extends js.Object {
  @js.native
  sealed trait certificate extends HandshakeType
  
  @js.native
  sealed trait certificate_request extends HandshakeType
  
  @js.native
  sealed trait certificate_verify extends HandshakeType
  
  @js.native
  sealed trait client_hello extends HandshakeType
  
  @js.native
  sealed trait client_key_exchange extends HandshakeType
  
  @js.native
  sealed trait finished extends HandshakeType
  
  @js.native
  sealed trait hello_request extends HandshakeType
  
  @js.native
  sealed trait server_hello extends HandshakeType
  
  @js.native
  sealed trait server_hello_done extends HandshakeType
  
  @js.native
  sealed trait server_key_exchange extends HandshakeType
  
  /* 11 */ val certificate: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.certificate with Double = js.native
  /* 13 */ val certificate_request: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.certificate_request with Double = js.native
  /* 15 */ val certificate_verify: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.certificate_verify with Double = js.native
  /* 1 */ val client_hello: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.client_hello with Double = js.native
  /* 16 */ val client_key_exchange: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.client_key_exchange with Double = js.native
  /* 20 */ val finished: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.finished with Double = js.native
  /* 0 */ val hello_request: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.hello_request with Double = js.native
  /* 2 */ val server_hello: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.server_hello with Double = js.native
  /* 14 */ val server_hello_done: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.server_hello_done with Double = js.native
  /* 12 */ val server_key_exchange: typings.nodeDashForge.nodeDashForgeMod.tls.HandshakeType.server_key_exchange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandshakeType with Double] = js.native
}

