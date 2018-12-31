package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Narrowphase extends js.Object {
  var contactEquations: js.Array[ContactEquation]
  var contactSkinSize: scala.Double
  var enableEquations: scala.Boolean
  var enableFriction: scala.Boolean
  var enableFrictionReduction: scala.Boolean
  var frictionCoefficient: scala.Double
  var frictionEquations: js.Array[FrictionEquation]
  var frictionRelaxation: scala.Double
  var frictionStiffness: scala.Double
  var relaxation: scala.Double
  var restitution: scala.Double
  var resuableContactEquations: js.Array[_]
  var reusableFrictionEquations: js.Array[_]
  var reuseObjects: scala.Boolean
  var slipForce: scala.Double
  var stiffness: scala.Double
  var surfaceVelocity: scala.Double
  def collidedLastStep(bodyA: Body, bodyB: Body): scala.Boolean
  def createContactEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): ContactEquation
  def createFrictionFromContact(c: ContactEquation): FrictionEquation
  def reset(): scala.Unit
}

