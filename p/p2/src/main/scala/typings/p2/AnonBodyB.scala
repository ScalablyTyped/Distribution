package typings.p2

import typings.p2.mod.Body
import typings.p2.mod.ContactEquation
import typings.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyB extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var contactEquations: js.Array[ContactEquation]
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object AnonBodyB {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    contactEquations: js.Array[ContactEquation],
    shapeA: Shape,
    shapeB: Shape,
    `type`: String
  ): AnonBodyB = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquations = contactEquations.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyB]
  }
}

