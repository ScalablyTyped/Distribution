package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyABodyBShapeA extends js.Object {
  var bodyA: p2Lib.p2Mod.p2Ns.Body
  var bodyB: p2Lib.p2Mod.p2Ns.Body
  var shapeA: p2Lib.p2Mod.p2Ns.Shape
  var shapeB: p2Lib.p2Mod.p2Ns.Shape
  var `type`: java.lang.String
}

object Anon_BodyABodyBShapeA {
  @scala.inline
  def apply(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    shapeB: p2Lib.p2Mod.p2Ns.Shape,
    `type`: java.lang.String
  ): Anon_BodyABodyBShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, shapeA = shapeA, shapeB = shapeB)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BodyABodyBShapeA]
  }
}

