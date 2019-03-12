package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrictionEquation extends Equation {
  var contactEquations: js.Array[ContactEquation]
  var contactPointA: js.Tuple2[scala.Double, scala.Double]
  var contactPointB: js.Tuple2[scala.Double, scala.Double]
  var frictionCoefficient: scala.Double
  var shapeA: Shape
  var shapeB: Shape
  var t: js.Tuple2[scala.Double, scala.Double]
  def getSlipForce(): scala.Double
  def setSlipForce(slipForce: scala.Double): scala.Unit
}

object FrictionEquation {
  @scala.inline
  def apply(
    G: js.Tuple2[scala.Double, scala.Double],
    addToWlambda: scala.Double => scala.Double,
    bodyA: Body,
    bodyB: Body,
    computeB: (scala.Double, scala.Double, scala.Double) => scala.Double,
    computeGW: () => scala.Double,
    computeGWlambda: () => scala.Double,
    computeGiMGt: () => scala.Double,
    computeGiMf: () => scala.Double,
    computeGq: () => scala.Double,
    computeInvC: scala.Double => scala.Double,
    contactEquations: js.Array[ContactEquation],
    contactPointA: js.Tuple2[scala.Double, scala.Double],
    contactPointB: js.Tuple2[scala.Double, scala.Double],
    enabled: scala.Boolean,
    epsilon: scala.Double,
    frictionCoefficient: scala.Double,
    getSlipForce: () => scala.Double,
    gmult: (js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]) => scala.Double,
    maxForce: scala.Double,
    minForce: scala.Double,
    multiplier: scala.Double,
    needsUpdate: scala.Boolean,
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    setSlipForce: scala.Double => scala.Unit,
    shapeA: Shape,
    shapeB: Shape,
    stiffness: scala.Double,
    t: js.Tuple2[scala.Double, scala.Double],
    timeStep: scala.Double,
    update: () => scala.Unit
  ): FrictionEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = js.Any.fromFunction1(addToWlambda), bodyA = bodyA, bodyB = bodyB, computeB = js.Any.fromFunction3(computeB), computeGW = js.Any.fromFunction0(computeGW), computeGWlambda = js.Any.fromFunction0(computeGWlambda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), computeInvC = js.Any.fromFunction1(computeInvC), contactEquations = contactEquations, contactPointA = contactPointA, contactPointB = contactPointB, enabled = enabled, epsilon = epsilon, frictionCoefficient = frictionCoefficient, getSlipForce = js.Any.fromFunction0(getSlipForce), gmult = js.Any.fromFunction5(gmult), maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, relativeVelocity = relativeVelocity, relaxation = relaxation, setSlipForce = js.Any.fromFunction1(setSlipForce), shapeA = shapeA, shapeB = shapeB, stiffness = stiffness, t = t, timeStep = timeStep, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[FrictionEquation]
  }
}

