package typings
package pkijsLib.srcBasicConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicConstraints extends js.Object {
  var cA: scala.Boolean
  var pathLenConstraint: scala.Double | asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object BasicConstraints {
  @scala.inline
  def apply(
    cA: scala.Boolean,
    fromSchema: js.Any => scala.Unit,
    pathLenConstraint: scala.Double | asn1jsLib.asn1jsMod.Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA, fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[BasicConstraints]
  }
}

