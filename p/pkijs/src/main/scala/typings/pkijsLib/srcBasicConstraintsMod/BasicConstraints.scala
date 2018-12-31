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

