package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Equation")
@js.native
class Equation protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, minForce: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, minForce: scala.Double, maxForce: scala.Double) = this()
  var G: js.Tuple2[scala.Double, scala.Double] = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var enabled: scala.Boolean = js.native
  var epsilon: scala.Double = js.native
  var maxForce: scala.Double = js.native
  var minForce: scala.Double = js.native
  var multiplier: scala.Double = js.native
  var needsUpdate: scala.Boolean = js.native
  var relativeVelocity: scala.Double = js.native
  var relaxation: scala.Double = js.native
  var stiffness: scala.Double = js.native
  var timeStep: scala.Double = js.native
  def addToWlambda(deltalambda: scala.Double): scala.Double = js.native
  def computeB(a: scala.Double, b: scala.Double, h: scala.Double): scala.Double = js.native
  def computeGW(): scala.Double = js.native
  def computeGWlambda(): scala.Double = js.native
  def computeGiMGt(): scala.Double = js.native
  def computeGiMf(): scala.Double = js.native
  def computeGq(): scala.Double = js.native
  def computeInvC(eps: scala.Double): scala.Double = js.native
  def gmult(
    G: js.Tuple2[scala.Double, scala.Double],
    vi: js.Tuple2[scala.Double, scala.Double],
    wi: js.Tuple2[scala.Double, scala.Double],
    vj: js.Tuple2[scala.Double, scala.Double],
    wj: js.Tuple2[scala.Double, scala.Double]
  ): scala.Double = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Equation")
@js.native
object Equation extends js.Object {
  var DEFAULT_RELAXATION: scala.Double = js.native
  var DEFAULT_STIFFNESS: scala.Double = js.native
}

