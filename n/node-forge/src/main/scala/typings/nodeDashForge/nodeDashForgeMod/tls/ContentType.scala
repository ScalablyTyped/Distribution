package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.alert
import typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.application_data
import typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.change_cipher_spec
import typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.handshake
import typings.nodeDashForge.nodeDashForgeMod.tls.ContentType.heartbeat
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  /* 21 */ @js.native
  object alert extends TopLevel[alert with Double]
  
  /* 23 */ @js.native
  object application_data extends TopLevel[application_data with Double]
  
  /* 20 */ @js.native
  object change_cipher_spec extends TopLevel[change_cipher_spec with Double]
  
  /* 22 */ @js.native
  object handshake extends TopLevel[handshake with Double]
  
  /* 24 */ @js.native
  object heartbeat extends TopLevel[heartbeat with Double]
  
}

