package typings.p2

import typings.p2.p2Mod.Body
import typings.p2.p2Mod.ContactEquation
import typings.p2.p2Mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyA extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var contactEquation: ContactEquation
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object Anon_BodyA {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    contactEquation: ContactEquation,
    shapeA: Shape,
    shapeB: Shape,
    `type`: String
  ): Anon_BodyA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquation = contactEquation.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyA]
  }
}

