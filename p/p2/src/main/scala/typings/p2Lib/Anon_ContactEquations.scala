package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContactEquations extends js.Object {
  var contactEquations: js.Array[p2Lib.p2Mod.p2Ns.ContactEquation]
  var frictionEquations: js.Array[p2Lib.p2Mod.p2Ns.FrictionEquation]
  var `type`: java.lang.String
}

object Anon_ContactEquations {
  @scala.inline
  def apply(
    contactEquations: js.Array[p2Lib.p2Mod.p2Ns.ContactEquation],
    frictionEquations: js.Array[p2Lib.p2Mod.p2Ns.FrictionEquation],
    `type`: java.lang.String
  ): Anon_ContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations, frictionEquations = frictionEquations)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContactEquations]
  }
}

