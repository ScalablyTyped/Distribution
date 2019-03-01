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
    __obj.updateDynamic("contactEquations")(contactEquations)
    __obj.updateDynamic("contactPointA")(contactPointA)
    __obj.updateDynamic("contactPointB")(contactPointB)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("epsilon")(epsilon)
    __obj.updateDynamic("frictionCoefficient")(frictionCoefficient)
    __obj.updateDynamic("getSlipForce")(getSlipForce)
    __obj.updateDynamic("gmult")(gmult)
    __obj.updateDynamic("maxForce")(maxForce)
    __obj.updateDynamic("minForce")(minForce)
    __obj.updateDynamic("multiplier")(multiplier)
    __obj.updateDynamic("needsUpdate")(needsUpdate)
    __obj.updateDynamic("relativeVelocity")(relativeVelocity)
    __obj.updateDynamic("relaxation")(relaxation)
    __obj.updateDynamic("setSlipForce")(setSlipForce)
    __obj.updateDynamic("shapeA")(shapeA)
    __obj.updateDynamic("shapeB")(shapeB)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("t")(t)
    __obj.updateDynamic("timeStep")(timeStep)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[FrictionEquation]
  }
}

