package typings.p2

import typings.p2.mod.ContactEquation
import typings.p2.mod.FrictionEquation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContactEquations extends js.Object {
  var contactEquations: js.Array[ContactEquation]
  var frictionEquations: js.Array[FrictionEquation]
  var `type`: String
}

object AnonContactEquations {
  @scala.inline
  def apply(
    contactEquations: js.Array[ContactEquation],
    frictionEquations: js.Array[FrictionEquation],
    `type`: String
  ): AnonContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations.asInstanceOf[js.Any], frictionEquations = frictionEquations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContactEquations]
  }
}

