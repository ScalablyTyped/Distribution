package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyABodyB extends js.Object {
  var bodyA: p2Lib.p2Mod.Body
  var bodyB: p2Lib.p2Mod.Body
  var contactEquations: js.Array[p2Lib.p2Mod.ContactEquation]
  var shapeA: p2Lib.p2Mod.Shape
  var shapeB: p2Lib.p2Mod.Shape
  var `type`: java.lang.String
}

object Anon_BodyABodyB {
  @scala.inline
  def apply(
    bodyA: p2Lib.p2Mod.Body,
    bodyB: p2Lib.p2Mod.Body,
    contactEquations: js.Array[p2Lib.p2Mod.ContactEquation],
    shapeA: p2Lib.p2Mod.Shape,
    shapeB: p2Lib.p2Mod.Shape,
    `type`: java.lang.String
  ): Anon_BodyABodyB = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, contactEquations = contactEquations, shapeA = shapeA, shapeB = shapeB)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BodyABodyB]
  }
}

