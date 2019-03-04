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
    fromSchema: js.Function1[js.Any, scala.Unit],
    pathLenConstraint: scala.Double | asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA, fromSchema = fromSchema, pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[BasicConstraints]
  }
}

