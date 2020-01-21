package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LinearSpring")
@js.native
class LinearSpring protected () extends Spring {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: LinearSpringOptions) = this()
  var localAnchorA: js.Tuple2[Double, Double] = js.native
  var localAnchorB: js.Tuple2[Double, Double] = js.native
  var restLength: Double = js.native
  def getWorldAnchorA(result: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def getWorldAnchorB(result: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def setWorldAnchorA(worldAnchorA: js.Tuple2[Double, Double]): Unit = js.native
  def setWorldAnchorB(worldAnchorB: js.Tuple2[Double, Double]): Unit = js.native
}

