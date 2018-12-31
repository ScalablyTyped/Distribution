package typings
package pkijsLib.srcNameConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameConstraints extends js.Object {
  var excludedSubtrees: js.UndefOr[js.Array[pkijsLib.srcGeneralSubtreeMod.default]] = js.undefined
  var permittedSubtrees: js.UndefOr[js.Array[pkijsLib.srcGeneralSubtreeMod.default]] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

