package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSImport("node-forge", "tls.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait alert extends ContentType
  
  @js.native
  sealed trait application_data extends ContentType
  
  @js.native
  sealed trait change_cipher_spec extends ContentType
  
  @js.native
  sealed trait handshake extends ContentType
  
  @js.native
  sealed trait heartbeat extends ContentType
  
  /* 21 */ val alert: typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.alert with Double = js.native
  /* 23 */ val application_data: typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.application_data with Double = js.native
  /* 20 */ val change_cipher_spec: typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.change_cipher_spec with Double = js.native
  /* 22 */ val handshake: typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.handshake with Double = js.native
  /* 24 */ val heartbeat: typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.heartbeat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}

