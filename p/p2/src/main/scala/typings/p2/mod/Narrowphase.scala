package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Narrowphase")
@js.native
class Narrowphase () extends js.Object {
  
  def bodiesOverlap(bodyA: Body, bodyB: Body): Boolean = js.native
  def bodiesOverlap(bodyA: Body, bodyB: Body, checkCollisionMasks: Boolean): Boolean = js.native
  
  def collidedLastStep(bodyA: Body, bodyB: Body): Boolean = js.native
  
  var collidingBodiesLastStep: TupleDictionary = js.native
  
  var contactEquationPool: ContactEquationPool = js.native
  
  var contactEquations: js.Array[ContactEquation] = js.native
  
  def createContactEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): ContactEquation = js.native
  
  def createFrictionEquation(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape): FrictionEquation = js.native
  
  def createFrictionFromContact(c: ContactEquation): FrictionEquation = js.native
  
  var currentContactMaterial: ContactMaterial = js.native
  
  var enableFriction: Boolean = js.native
  
  var enableFrictionReduction: Boolean = js.native
  
  var enabledEquations: Boolean = js.native
  
  var frictionEquationPool: FrictionEquationPool = js.native
  
  var frictionEquations: js.Array[FrictionEquation] = js.native
  
  def reset(): Unit = js.native
  
  var slipForce: Double = js.native
}
