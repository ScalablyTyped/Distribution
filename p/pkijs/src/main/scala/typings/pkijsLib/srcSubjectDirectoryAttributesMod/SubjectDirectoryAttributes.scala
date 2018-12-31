package typings
package pkijsLib.srcSubjectDirectoryAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubjectDirectoryAttributes extends js.Object {
  var attributes: js.Array[pkijsLib.srcAttributeMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

