package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLockEquation extends Equation {
  var angle: scala.Double
  var ratio: scala.Double
  def setMaxTorque(torque: scala.Double): scala.Unit
  def setRatio(ratio: scala.Double): scala.Double
}

object AngleLockEquation {
  @scala.inline
  def apply(
    G: js.Tuple2[scala.Double, scala.Double],
    addToWlambda: js.Function1[scala.Double, scala.Double],
    angle: scala.Double,
    bodyA: Body,
    bodyB: Body,
    computeB: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    computeGW: js.Function0[scala.Double],
    computeGWlambda: js.Function0[scala.Double],
    computeGiMGt: js.Function0[scala.Double],
    computeGiMf: js.Function0[scala.Double],
    computeGq: js.Function0[scala.Double],
    computeInvC: js.Function1[scala.Double, scala.Double],
    enabled: scala.Boolean,
    epsilon: scala.Double,
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
    ratio: scala.Double,
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    setMaxTorque: js.Function1[scala.Double, scala.Unit],
    setRatio: js.Function1[scala.Double, scala.Double],
    stiffness: scala.Double,
    timeStep: scala.Double,
    update: js.Function0[scala.Unit]
  ): AngleLockEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = addToWlambda, angle = angle, bodyA = bodyA, bodyB = bodyB, computeB = computeB, computeGW = computeGW, computeGWlambda = computeGWlambda, computeGiMGt = computeGiMGt, computeGiMf = computeGiMf, computeGq = computeGq, computeInvC = computeInvC, enabled = enabled, epsilon = epsilon, gmult = gmult, maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, ratio = ratio, relativeVelocity = relativeVelocity, relaxation = relaxation, setMaxTorque = setMaxTorque, setRatio = setRatio, stiffness = stiffness, timeStep = timeStep, update = update)
  
    __obj.asInstanceOf[AngleLockEquation]
  }
}

