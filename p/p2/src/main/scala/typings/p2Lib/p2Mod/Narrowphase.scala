package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Narrowphase")
@js.native
class Narrowphase () extends js.Object {
  var collidingBodiesLastStep: TupleDictionary = js.native
  var contactEquationPool: ContactEquationPool = js.native
  var contactEquations: js.Array[ContactEquation] = js.native
  var currentContactMaterial: ContactMaterial = js.native
  var enableFriction: scala.Boolean = js.native
  var enableFrictionReduction: scala.Boolean = js.native
  var enabledEquations: scala.Boolean = js.native
  var frictionEquationPool: FrictionEquationPool = js.native
  var frictionEquations: js.Array[FrictionEquation] = js.native
  var slipForce: scala.Double = js.native
  def bodiesOverlap(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def bodiesOverlap(bodyA: Body, bodyB: Body, checkCollisionMasks: scala.Boolean): scala.Boolean = js.native
  def collidedLastStep(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def createContactEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): ContactEquation = js.native
  def createFrictionEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): FrictionEquation = js.native
  def createFrictionFromContact(c: ContactEquation): FrictionEquation = js.native
  def reset(): scala.Unit = js.native
}

