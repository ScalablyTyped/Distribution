package typings
package pkijsLib.srcAltNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltName extends js.Object {
  var altNames: js.Array[pkijsLib.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

