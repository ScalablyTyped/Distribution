package typings.p2

import typings.p2.mod.Body
import typings.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyABodyBShapeA extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object AnonBodyABodyBShapeA {
  @scala.inline
  def apply(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape, `type`: String): AnonBodyABodyBShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyABodyBShapeA]
  }
}

