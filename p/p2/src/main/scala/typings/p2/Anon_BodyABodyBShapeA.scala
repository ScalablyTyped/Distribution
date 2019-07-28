package typings.p2

import typings.p2.p2Mod.Body
import typings.p2.p2Mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyABodyBShapeA extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var shapeA: Shape
  var shapeB: Shape
  var `type`: String
}

object Anon_BodyABodyBShapeA {
  @scala.inline
  def apply(bodyA: Body, bodyB: Body, shapeA: Shape, shapeB: Shape, `type`: String): Anon_BodyABodyBShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, shapeA = shapeA, shapeB = shapeB)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BodyABodyBShapeA]
  }
}

