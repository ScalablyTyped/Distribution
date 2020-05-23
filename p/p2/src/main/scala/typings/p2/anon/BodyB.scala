package typings.p2.anon

import typings.p2.mod.ContactEquation
import typings.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyB extends js.Object {
  var bodyA: typings.p2.mod.Body
  var bodyB: typings.p2.mod.Body
  var contactEquations: js.Array[ContactEquation]
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object BodyB {
  @scala.inline
  def apply(
    bodyA: typings.p2.mod.Body,
    bodyB: typings.p2.mod.Body,
    contactEquations: js.Array[ContactEquation],
    shapeA: Shape,
    shapeB: Shape,
    `type`: String
  ): BodyB = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquations = contactEquations.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyB]
  }
}

