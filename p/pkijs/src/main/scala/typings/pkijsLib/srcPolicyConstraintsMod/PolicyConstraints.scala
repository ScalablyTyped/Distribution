package typings
package pkijsLib.srcPolicyConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PolicyConstraints extends js.Object {
  var inhibitPolicyMapping: js.UndefOr[scala.Double] = js.undefined
  var requireExplicitPolicy: js.UndefOr[scala.Double] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

