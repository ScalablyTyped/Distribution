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
    contactPointA: js.Tuple2[scala.Double, scala.Double],
    contactPointB: js.Tuple2[scala.Double, scala.Double],
    enabled: scala.Boolean,
    epsilon: scala.Double,
    firstImpact: scala.Boolean,
    getVelocityAlongNormal: js.Function0[scala.Double],
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
    normalA: js.Tuple2[scala.Double, scala.Double],
    penetrationVec: js.Tuple2[scala.Double, scala.Double],
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    restitution: scala.Double,
    shapeA: Shape,
    shapeB: Shape,
    stiffness: scala.Double,
    timeStep: scala.Double,
    update: js.Function0[scala.Unit]
  ): ContactEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = addToWlambda, bodyA = bodyA, bodyB = bodyB, computeB = computeB, computeGW = computeGW, computeGWlambda = computeGWlambda, computeGiMGt = computeGiMGt, computeGiMf = computeGiMf, computeGq = computeGq, computeInvC = computeInvC, contactPointA = contactPointA, contactPointB = contactPointB, enabled = enabled, epsilon = epsilon, firstImpact = firstImpact, getVelocityAlongNormal = getVelocityAlongNormal, gmult = gmult, maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, normalA = normalA, penetrationVec = penetrationVec, relativeVelocity = relativeVelocity, relaxation = relaxation, restitution = restitution, shapeA = shapeA, shapeB = shapeB, stiffness = stiffness, timeStep = timeStep, update = update)
  
    __obj.asInstanceOf[ContactEquation]
  }
}

