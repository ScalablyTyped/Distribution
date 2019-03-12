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

object SubjectDirectoryAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[pkijsLib.srcAttributeMod.default],
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): SubjectDirectoryAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[SubjectDirectoryAttributes]
  }
}

