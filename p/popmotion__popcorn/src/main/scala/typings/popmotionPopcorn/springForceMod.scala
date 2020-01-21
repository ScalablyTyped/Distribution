package typings.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn/lib/utils/spring-force", JSImport.Namespace)
@js.native
object springForceMod extends js.Object {
  def springForce(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  def springForce(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  def springForceExpo(min: Double, max: Double): js.Any = js.native
  def springForceExpo(min: Double, max: Double, v: Double): js.Any = js.native
  def springForceLinear(min: Double, max: Double): js.Any = js.native
  def springForceLinear(min: Double, max: Double, v: Double): js.Any = js.native
}

