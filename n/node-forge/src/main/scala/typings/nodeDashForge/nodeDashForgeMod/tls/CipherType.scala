package typings.nodeDashForge.nodeDashForgeMod.tls

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
  
  /* 2 */ val aead: typings.nodeDashForge.nodeDashForgeMod.tls.CipherType.aead with Double = js.native
  /* 1 */ val block: typings.nodeDashForge.nodeDashForgeMod.tls.CipherType.block with Double = js.native
  /* 0 */ val stream: typings.nodeDashForge.nodeDashForgeMod.tls.CipherType.stream with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CipherType with Double] = js.native
}

