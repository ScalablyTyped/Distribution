package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyABodyB extends js.Object {
  var bodyA: p2Lib.p2Mod.p2Ns.Body
  var bodyB: p2Lib.p2Mod.p2Ns.Body
  var contactEquations: js.Array[p2Lib.p2Mod.p2Ns.ContactEquation]
  var shapeA: p2Lib.p2Mod.p2Ns.Shape
  var shapeB: p2Lib.p2Mod.p2Ns.Shape
  var `type`: java.lang.String
}

object Anon_BodyABodyB {
  @scala.inline
  def apply(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    contactEquations: js.Array[p2Lib.p2Mod.p2Ns.ContactEquation],
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    shapeB: p2Lib.p2Mod.p2Ns.Shape,
    `type`: java.lang.String
  ): Anon_BodyABodyB = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("contactEquations")(contactEquations)
    __obj.updateDynamic("shapeA")(shapeA)
    __obj.updateDynamic("shapeB")(shapeB)
    __obj.asInstanceOf[Anon_BodyABodyB]
  }
}

