package typings.p2

import typings.p2.p2Mod.ContactEquation
import typings.p2.p2Mod.FrictionEquation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContactEquations extends js.Object {
  var contactEquations: js.Array[ContactEquation]
  var frictionEquations: js.Array[FrictionEquation]
  var `type`: String
}

object Anon_ContactEquations {
  @scala.inline
  def apply(
    contactEquations: js.Array[ContactEquation],
    frictionEquations: js.Array[FrictionEquation],
    `type`: String
  ): Anon_ContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations, frictionEquations = frictionEquations)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContactEquations]
  }
}

