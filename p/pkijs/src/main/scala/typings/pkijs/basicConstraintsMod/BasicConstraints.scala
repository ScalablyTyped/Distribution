package typings.pkijs.basicConstraintsMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicConstraints extends js.Object {
  var cA: Boolean
  var pathLenConstraint: Double | Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object BasicConstraints {
  @scala.inline
  def apply(
    cA: Boolean,
    fromSchema: js.Any => Unit,
    pathLenConstraint: Double | Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[BasicConstraints]
  }
}

