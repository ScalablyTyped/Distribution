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
    addToWlambda: scala.Double => scala.Double,
    angle: scala.Double,
    bodyA: Body,
    bodyB: Body,
    computeB: (scala.Double, scala.Double, scala.Double) => scala.Double,
    computeGW: () => scala.Double,
    computeGWlambda: () => scala.Double,
    computeGiMGt: () => scala.Double,
    computeGiMf: () => scala.Double,
    computeGq: () => scala.Double,
    computeInvC: scala.Double => scala.Double,
    enabled: scala.Boolean,
    epsilon: scala.Double,
    gmult: (js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]) => scala.Double,
    maxForce: scala.Double,
    minForce: scala.Double,
    multiplier: scala.Double,
    needsUpdate: scala.Boolean,
    ratio: scala.Double,
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    setMaxTorque: scala.Double => scala.Unit,
    setRatio: scala.Double => scala.Double,
    stiffness: scala.Double,
    timeStep: scala.Double,
    update: () => scala.Unit
  ): AngleLockEquation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = js.Any.fromFunction1(addToWlambda), angle = angle, bodyA = bodyA, bodyB = bodyB, computeB = js.Any.fromFunction3(computeB), computeGW = js.Any.fromFunction0(computeGW), computeGWlambda = js.Any.fromFunction0(computeGWlambda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), computeInvC = js.Any.fromFunction1(computeInvC), enabled = enabled, epsilon = epsilon, gmult = js.Any.fromFunction5(gmult), maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, ratio = ratio, relativeVelocity = relativeVelocity, relaxation = relaxation, setMaxTorque = js.Any.fromFunction1(setMaxTorque), setRatio = js.Any.fromFunction1(setRatio), stiffness = stiffness, timeStep = timeStep, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[AngleLockEquation]
  }
}

