package typings
package pkijsLib.srcExtensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Extensions extends js.Object {
  var extensions: js.Array[pkijsLib.srcExtensionMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

