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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("G")(G)
    __obj.updateDynamic("addToWlambda")(addToWlambda)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("computeB")(computeB)
    __obj.updateDynamic("computeGW")(computeGW)
    __obj.updateDynamic("computeGWlambda")(computeGWlambda)
    __obj.updateDynamic("computeGiMGt")(computeGiMGt)
    __obj.updateDynamic("computeGiMf")(computeGiMf)
    __obj.updateDynamic("computeGq")(computeGq)
    __obj.updateDynamic("computeInvC")(computeInvC)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("epsilon")(epsilon)
    __obj.updateDynamic("gmult")(gmult)
    __obj.updateDynamic("maxForce")(maxForce)
    __obj.updateDynamic("minForce")(minForce)
    __obj.updateDynamic("multiplier")(multiplier)
    __obj.updateDynamic("needsUpdate")(needsUpdate)
    __obj.updateDynamic("relativeVelocity")(relativeVelocity)
    __obj.updateDynamic("relaxation")(relaxation)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("timeStep")(timeStep)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Equation]
  }
}

