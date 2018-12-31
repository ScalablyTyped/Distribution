package typings
package pkijsLib.srcInfoAccessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoAccess extends js.Object {
  var accessDescriptions: js.Array[pkijsLib.srcAccessDescriptionMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

