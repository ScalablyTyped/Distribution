package typings
package pkijsLib.srcGeneralNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeneralNames extends js.Object {
  var names: js.Array[pkijsLib.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

