package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Narrowphase")
@js.native
class Narrowphase ()
  extends p2Lib.p2Mod.p2Ns.Narrowphase {
  /* CompleteClass */
  override var contactEquations: js.Array[p2Lib.p2Mod.p2Ns.ContactEquation] = js.native
  /* CompleteClass */
  override var contactSkinSize: scala.Double = js.native
  /* CompleteClass */
  override var enableEquations: scala.Boolean = js.native
  /* CompleteClass */
  override var enableFriction: scala.Boolean = js.native
  /* CompleteClass */
  override var enableFrictionReduction: scala.Boolean = js.native
  /* CompleteClass */
  override var frictionCoefficient: scala.Double = js.native
  /* CompleteClass */
  override var frictionEquations: js.Array[p2Lib.p2Mod.p2Ns.FrictionEquation] = js.native
  /* CompleteClass */
  override var frictionRelaxation: scala.Double = js.native
  /* CompleteClass */
  override var frictionStiffness: scala.Double = js.native
  /* CompleteClass */
  override var relaxation: scala.Double = js.native
  /* CompleteClass */
  override var restitution: scala.Double = js.native
  /* CompleteClass */
  override var resuableContactEquations: js.Array[_] = js.native
  /* CompleteClass */
  override var reusableFrictionEquations: js.Array[_] = js.native
  /* CompleteClass */
  override var reuseObjects: scala.Boolean = js.native
  /* CompleteClass */
  override var slipForce: scala.Double = js.native
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /* CompleteClass */
  override var surfaceVelocity: scala.Double = js.native
  /* CompleteClass */
  override def collidedLastStep(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  /* CompleteClass */
  override def createContactEquation(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    shapeB: p2Lib.p2Mod.p2Ns.Shape
  ): p2Lib.p2Mod.p2Ns.ContactEquation = js.native
  /* CompleteClass */
  override def createFrictionFromContact(c: p2Lib.p2Mod.p2Ns.ContactEquation): p2Lib.p2Mod.p2Ns.FrictionEquation = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}

