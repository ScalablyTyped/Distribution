package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandshakeType extends js.Object
@JSImport("node-forge", "tls.HandshakeType")
@js.native
object HandshakeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandshakeType with Double] = js.native
  
  @js.native
  sealed trait certificate extends HandshakeType
  /* 11 */ @js.native
  object certificate extends TopLevel[certificate with Double]
  
  @js.native
  sealed trait certificate_request extends HandshakeType
  /* 13 */ @js.native
  object certificate_request extends TopLevel[certificate_request with Double]
  
  @js.native
  sealed trait certificate_verify extends HandshakeType
  /* 15 */ @js.native
  object certificate_verify extends TopLevel[certificate_verify with Double]
  
  @js.native
  sealed trait client_hello extends HandshakeType
  /* 1 */ @js.native
  object client_hello extends TopLevel[client_hello with Double]
  
  @js.native
  sealed trait client_key_exchange extends HandshakeType
  /* 16 */ @js.native
  object client_key_exchange extends TopLevel[client_key_exchange with Double]
  
  @js.native
  sealed trait finished extends HandshakeType
  /* 20 */ @js.native
  object finished extends TopLevel[finished with Double]
  
  @js.native
  sealed trait hello_request extends HandshakeType
  /* 0 */ @js.native
  object hello_request extends TopLevel[hello_request with Double]
  
  @js.native
  sealed trait server_hello extends HandshakeType
  /* 2 */ @js.native
  object server_hello extends TopLevel[server_hello with Double]
  
  @js.native
  sealed trait server_hello_done extends HandshakeType
  /* 14 */ @js.native
  object server_hello_done extends TopLevel[server_hello_done with Double]
  
  @js.native
  sealed trait server_key_exchange extends HandshakeType
  /* 12 */ @js.native
  object server_key_exchange extends TopLevel[server_key_exchange with Double]
}
