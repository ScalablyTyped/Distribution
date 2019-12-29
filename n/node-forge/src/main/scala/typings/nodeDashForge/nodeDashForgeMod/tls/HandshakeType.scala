package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandshakeType with Double] = js.native
  /* 11 */ @js.native
  object certificate extends TopLevel[certificate with Double]
  
  /* 13 */ @js.native
  object certificate_request extends TopLevel[certificate_request with Double]
  
  /* 15 */ @js.native
  object certificate_verify extends TopLevel[certificate_verify with Double]
  
  /* 1 */ @js.native
  object client_hello extends TopLevel[client_hello with Double]
  
  /* 16 */ @js.native
  object client_key_exchange extends TopLevel[client_key_exchange with Double]
  
  /* 20 */ @js.native
  object finished extends TopLevel[finished with Double]
  
  /* 0 */ @js.native
  object hello_request extends TopLevel[hello_request with Double]
  
  /* 2 */ @js.native
  object server_hello extends TopLevel[server_hello with Double]
  
  /* 14 */ @js.native
  object server_hello_done extends TopLevel[server_hello_done with Double]
  
  /* 12 */ @js.native
  object server_key_exchange extends TopLevel[server_key_exchange with Double]
  
}

