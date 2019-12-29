package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PRFAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object tls_prf_sha256 extends TopLevel[tls_prf_sha256 with Double]
  
}

