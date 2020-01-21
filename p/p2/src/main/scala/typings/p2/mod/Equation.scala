package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Equation")
@js.native
class Equation protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, minForce: Double) = this()
  def this(bodyA: Body, bodyB: Body, minForce: Double, maxForce: Double) = this()
  var G: js.Tuple2[Double, Double] = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var enabled: Boolean = js.native
  var epsilon: Double = js.native
  var maxForce: Double = js.native
  var minForce: Double = js.native
  var multiplier: Double = js.native
  var needsUpdate: Boolean = js.native
  var relativeVelocity: Double = js.native
  var relaxation: Double = js.native
  var stiffness: Double = js.native
  var timeStep: Double = js.native
  def addToWlambda(deltalambda: Double): Double = js.native
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  def computeGW(): Double = js.native
  def computeGWlambda(): Double = js.native
  def computeGiMGt(): Double = js.native
  def computeGiMf(): Double = js.native
  def computeGq(): Double = js.native
  def computeInvC(eps: Double): Double = js.native
  def gmult(
    G: js.Tuple2[Double, Double],
    vi: js.Tuple2[Double, Double],
    wi: js.Tuple2[Double, Double],
    vj: js.Tuple2[Double, Double],
    wj: js.Tuple2[Double, Double]
  ): Double = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("p2", "Equation")
@js.native
object Equation extends js.Object {
  var DEFAULT_RELAXATION: Double = js.native
  var DEFAULT_STIFFNESS: Double = js.native
}

