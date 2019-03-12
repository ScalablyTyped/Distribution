package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactEquation extends Equation {
  var contactPointA: js.Tuple2[scala.Double, scala.Double]
  var contactPointB: js.Tuple2[scala.Double, scala.Double]
  var firstImpact: scala.Boolean
  var normalA: js.Tuple2[scala.Double, scala.Double]
  var penetrationVec: js.Tuple2[scala.Double, scala.Double]
  var restitution: scala.Double
  var shapeA: Shape
  var shapeB: Shape
  def getVelocityAlongNormal(): scala.Double
}

object ContactEquation {
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
    contactPointA: js.Tuple2[scala.Double, scala.Double],
    contactPointB: js.Tuple2[scala.Double, scala.Double],
    enabled: scala.Boolean,
    epsilon: scala.Double,
    firstImpact: scala.Boolean,
    getVelocityAlongNormal: () => scala.Double,
    gmult: (js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]) => scala.Double,
    maxForce: scala.Double,
    minForce: scala.Double,
    multiplier: scala.Double,
    needsUpdate: scala.Boolean,
    normalA: js.Tuple2[scala.Double, scala.Double],
    penetrationVec: js.Tuple2[scala.Double, scala.Double],
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    restitution: scala.Double,
    shapeA: Shape,
    shapeB: Shape,
    stiffness: scala.Double,
    timeStep: scala.Double,
    update: () => scala.Unit
  ): ContactEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = js.Any.fromFunction1(addToWlambda), bodyA = bodyA, bodyB = bodyB, computeB = js.Any.fromFunction3(computeB), computeGW = js.Any.fromFunction0(computeGW), computeGWlambda = js.Any.fromFunction0(computeGWlambda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), computeInvC = js.Any.fromFunction1(computeInvC), contactPointA = contactPointA, contactPointB = contactPointB, enabled = enabled, epsilon = epsilon, firstImpact = firstImpact, getVelocityAlongNormal = js.Any.fromFunction0(getVelocityAlongNormal), gmult = js.Any.fromFunction5(gmult), maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, normalA = normalA, penetrationVec = penetrationVec, relativeVelocity = relativeVelocity, relaxation = relaxation, restitution = restitution, shapeA = shapeA, shapeB = shapeB, stiffness = stiffness, timeStep = timeStep, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[ContactEquation]
  }
}

