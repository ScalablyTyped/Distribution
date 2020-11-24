package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CipherType extends js.Object
@JSImport("node-forge", "tls.CipherType")
@js.native
object CipherType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CipherType with Double] = js.native
  
  @js.native
  sealed trait aead extends CipherType
  /* 2 */ @js.native
  object aead extends TopLevel[aead with Double]
  
  @js.native
  sealed trait block extends CipherType
  /* 1 */ @js.native
  object block extends TopLevel[block with Double]
  
  @js.native
  sealed trait stream extends CipherType
  /* 0 */ @js.native
  object stream extends TopLevel[stream with Double]
}
