package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CipherType extends StObject
@JSImport("node-forge", "tls.CipherType")
@js.native
object CipherType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CipherType with Double] = js.native
  
  @js.native
  sealed trait aead extends CipherType
  /* 2 */ val aead: typings.nodeForge.mod.tls.CipherType.aead with Double = js.native
  
  @js.native
  sealed trait block extends CipherType
  /* 1 */ val block: typings.nodeForge.mod.tls.CipherType.block with Double = js.native
  
  @js.native
  sealed trait stream extends CipherType
  /* 0 */ val stream: typings.nodeForge.mod.tls.CipherType.stream with Double = js.native
}
