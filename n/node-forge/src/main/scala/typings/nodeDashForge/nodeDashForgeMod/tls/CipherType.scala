package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CipherType extends js.Object

@JSImport("node-forge", "tls.CipherType")
@js.native
object CipherType extends js.Object {
  @js.native
  sealed trait aead extends CipherType
  
  @js.native
  sealed trait block extends CipherType
  
  @js.native
  sealed trait stream extends CipherType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CipherType with Double] = js.native
  /* 2 */ @js.native
  object aead extends TopLevel[aead with Double]
  
  /* 1 */ @js.native
  object block extends TopLevel[block with Double]
  
  /* 0 */ @js.native
  object stream extends TopLevel[stream with Double]
  
}

