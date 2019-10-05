package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PRFAlgorithm extends js.Object

@JSImport("node-forge", "tls.PRFAlgorithm")
@js.native
object PRFAlgorithm extends js.Object {
  @js.native
  sealed trait tls_prf_sha256 extends PRFAlgorithm
  
  /* 0 */ val tls_prf_sha256: typings.nodeDashForge.nodeDashForgeMod.tls.PRFAlgorithm.tls_prf_sha256 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PRFAlgorithm with Double] = js.native
}

