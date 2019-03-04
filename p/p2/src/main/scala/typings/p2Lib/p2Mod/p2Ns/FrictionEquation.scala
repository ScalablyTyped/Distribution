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
    addToWlambda: js.Function1[scala.Double, scala.Double],
    bodyA: Body,
    bodyB: Body,
    computeB: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    computeGW: js.Function0[scala.Double],
    computeGWlambda: js.Function0[scala.Double],
    computeGiMGt: js.Function0[scala.Double],
    computeGiMf: js.Function0[scala.Double],
    computeGq: js.Function0[scala.Double],
    computeInvC: js.Function1[scala.Double, scala.Double],
    contactEquations: js.Array[ContactEquation],
    contactPointA: js.Tuple2[scala.Double, scala.Double],
    contactPointB: js.Tuple2[scala.Double, scala.Double],
    enabled: scala.Boolean,
    epsilon: scala.Double,
    frictionCoefficient: scala.Double,
    getSlipForce: js.Function0[scala.Double],
    gmult: js.Function5[
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      scala.Double
    ],
    maxForce: scala.Double,
    minForce: scala.Double,
    multiplier: scala.Double,
    needsUpdate: scala.Boolean,
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    setSlipForce: js.Function1[scala.Double, scala.Unit],
    shapeA: Shape,
    shapeB: Shape,
    stiffness: scala.Double,
    t: js.Tuple2[scala.Double, scala.Double],
    timeStep: scala.Double,
    update: js.Function0[scala.Unit]
  ): FrictionEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = addToWlambda, bodyA = bodyA, bodyB = bodyB, computeB = computeB, computeGW = computeGW, computeGWlambda = computeGWlambda, computeGiMGt = computeGiMGt, computeGiMf = computeGiMf, computeGq = computeGq, computeInvC = computeInvC, contactEquations = contactEquations, contactPointA = contactPointA, contactPointB = contactPointB, enabled = enabled, epsilon = epsilon, frictionCoefficient = frictionCoefficient, getSlipForce = getSlipForce, gmult = gmult, maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, relativeVelocity = relativeVelocity, relaxation = relaxation, setSlipForce = setSlipForce, shapeA = shapeA, shapeB = shapeB, stiffness = stiffness, t = t, timeStep = timeStep, update = update)
  
    __obj.asInstanceOf[FrictionEquation]
  }
}

