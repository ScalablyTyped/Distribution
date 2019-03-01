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
    __obj.updateDynamic("contactPointA")(contactPointA)
    __obj.updateDynamic("contactPointB")(contactPointB)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("epsilon")(epsilon)
    __obj.updateDynamic("firstImpact")(firstImpact)
    __obj.updateDynamic("getVelocityAlongNormal")(getVelocityAlongNormal)
    __obj.updateDynamic("gmult")(gmult)
    __obj.updateDynamic("maxForce")(maxForce)
    __obj.updateDynamic("minForce")(minForce)
    __obj.updateDynamic("multiplier")(multiplier)
    __obj.updateDynamic("needsUpdate")(needsUpdate)
    __obj.updateDynamic("normalA")(normalA)
    __obj.updateDynamic("penetrationVec")(penetrationVec)
    __obj.updateDynamic("relativeVelocity")(relativeVelocity)
    __obj.updateDynamic("relaxation")(relaxation)
    __obj.updateDynamic("restitution")(restitution)
    __obj.updateDynamic("shapeA")(shapeA)
    __obj.updateDynamic("shapeB")(shapeB)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("timeStep")(timeStep)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ContactEquation]
  }
}

