package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends js.Object
@JSImport("node-forge", "tls.ContentType")
@js.native
object ContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  
  @js.native
  sealed trait alert extends ContentType
  /* 21 */ @js.native
  object alert extends TopLevel[alert with Double]
  
  @js.native
  sealed trait application_data extends ContentType
  /* 23 */ @js.native
  object application_data extends TopLevel[application_data with Double]
  
  @js.native
  sealed trait change_cipher_spec extends ContentType
  /* 20 */ @js.native
  object change_cipher_spec extends TopLevel[change_cipher_spec with Double]
  
  @js.native
  sealed trait handshake extends ContentType
  /* 22 */ @js.native
  object handshake extends TopLevel[handshake with Double]
  
  @js.native
  sealed trait heartbeat extends ContentType
  /* 24 */ @js.native
  object heartbeat extends TopLevel[heartbeat with Double]
}
