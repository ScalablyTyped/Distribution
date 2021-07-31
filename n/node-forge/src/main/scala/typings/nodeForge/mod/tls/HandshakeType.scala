package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandshakeType extends StObject
@JSImport("node-forge", "tls.HandshakeType")
@js.native
object HandshakeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandshakeType & Double] = js.native
  
  @js.native
  sealed trait certificate
    extends StObject
       with HandshakeType
  /* 11 */ val certificate: typings.nodeForge.mod.tls.HandshakeType.certificate & Double = js.native
  
  @js.native
  sealed trait certificate_request
    extends StObject
       with HandshakeType
  /* 13 */ val certificate_request: typings.nodeForge.mod.tls.HandshakeType.certificate_request & Double = js.native
  
  @js.native
  sealed trait certificate_verify
    extends StObject
       with HandshakeType
  /* 15 */ val certificate_verify: typings.nodeForge.mod.tls.HandshakeType.certificate_verify & Double = js.native
  
  @js.native
  sealed trait client_hello
    extends StObject
       with HandshakeType
  /* 1 */ val client_hello: typings.nodeForge.mod.tls.HandshakeType.client_hello & Double = js.native
  
  @js.native
  sealed trait client_key_exchange
    extends StObject
       with HandshakeType
  /* 16 */ val client_key_exchange: typings.nodeForge.mod.tls.HandshakeType.client_key_exchange & Double = js.native
  
  @js.native
  sealed trait finished
    extends StObject
       with HandshakeType
  /* 20 */ val finished: typings.nodeForge.mod.tls.HandshakeType.finished & Double = js.native
  
  @js.native
  sealed trait hello_request
    extends StObject
       with HandshakeType
  /* 0 */ val hello_request: typings.nodeForge.mod.tls.HandshakeType.hello_request & Double = js.native
  
  @js.native
  sealed trait server_hello
    extends StObject
       with HandshakeType
  /* 2 */ val server_hello: typings.nodeForge.mod.tls.HandshakeType.server_hello & Double = js.native
  
  @js.native
  sealed trait server_hello_done
    extends StObject
       with HandshakeType
  /* 14 */ val server_hello_done: typings.nodeForge.mod.tls.HandshakeType.server_hello_done & Double = js.native
  
  @js.native
  sealed trait server_key_exchange
    extends StObject
       with HandshakeType
  /* 12 */ val server_key_exchange: typings.nodeForge.mod.tls.HandshakeType.server_key_exchange & Double = js.native
}
