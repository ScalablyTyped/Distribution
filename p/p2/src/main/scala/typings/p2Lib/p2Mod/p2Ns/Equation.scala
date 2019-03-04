package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var G: js.Tuple2[scala.Double, scala.Double]
  var bodyA: Body
  var bodyB: Body
  var enabled: scala.Boolean
  var epsilon: scala.Double
  var maxForce: scala.Double
  var minForce: scala.Double
  var multiplier: scala.Double
  var needsUpdate: scala.Boolean
  var relativeVelocity: scala.Double
  var relaxation: scala.Double
  var stiffness: scala.Double
  var timeStep: scala.Double
  def addToWlambda(deltalambda: scala.Double): scala.Double
  def computeB(a: scala.Double, b: scala.Double, h: scala.Double): scala.Double
  def computeGW(): scala.Double
  def computeGWlambda(): scala.Double
  def computeGiMGt(): scala.Double
  def computeGiMf(): scala.Double
  def computeGq(): scala.Double
  def computeInvC(eps: scala.Double): scala.Double
  def gmult(
    G: js.Tuple2[scala.Double, scala.Double],
    vi: js.Tuple2[scala.Double, scala.Double],
    wi: js.Tuple2[scala.Double, scala.Double],
    vj: js.Tuple2[scala.Double, scala.Double],
    wj: js.Tuple2[scala.Double, scala.Double]
  ): scala.Double
  def update(): scala.Unit
}

object Equation {
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
    relativeVelocity: scala.Double,
    relaxation: scala.Double,
    stiffness: scala.Double,
    timeStep: scala.Double,
    update: js.Function0[scala.Unit]
  ): Equation = {
    val __obj = js.Dynamic.literal(G = G, addToWlambda = addToWlambda, bodyA = bodyA, bodyB = bodyB, computeB = computeB, computeGW = computeGW, computeGWlambda = computeGWlambda, computeGiMGt = computeGiMGt, computeGiMf = computeGiMf, computeGq = computeGq, computeInvC = computeInvC, enabled = enabled, epsilon = epsilon, gmult = gmult, maxForce = maxForce, minForce = minForce, multiplier = multiplier, needsUpdate = needsUpdate, relativeVelocity = relativeVelocity, relaxation = relaxation, stiffness = stiffness, timeStep = timeStep, update = update)
  
    __obj.asInstanceOf[Equation]
  }
}

