package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyA extends js.Object {
  var bodyA: p2Lib.p2Mod.p2Ns.Body
  var bodyB: p2Lib.p2Mod.p2Ns.Body
  var contactEquation: p2Lib.p2Mod.p2Ns.ContactEquation
  var shapeA: p2Lib.p2Mod.p2Ns.Shape
  var shapeB: p2Lib.p2Mod.p2Ns.Shape
  var `type`: java.lang.String
}

object Anon_BodyA {
  @scala.inline
  def apply(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    contactEquation: p2Lib.p2Mod.p2Ns.ContactEquation,
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    shapeB: p2Lib.p2Mod.p2Ns.Shape,
    `type`: java.lang.String
  ): Anon_BodyA = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("contactEquation")(contactEquation)
    __obj.updateDynamic("shapeA")(shapeA)
    __obj.updateDynamic("shapeB")(shapeB)
    __obj.asInstanceOf[Anon_BodyA]
  }
}

