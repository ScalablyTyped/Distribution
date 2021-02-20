package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PRFAlgorithm extends StObject
@JSImport("node-forge", "tls.PRFAlgorithm")
@js.native
object PRFAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PRFAlgorithm with Double] = js.native
  
  @js.native
  sealed trait tls_prf_sha256 extends PRFAlgorithm
  /* 0 */ val tls_prf_sha256: typings.nodeForge.mod.tls.PRFAlgorithm.tls_prf_sha256 with Double = js.native
}
