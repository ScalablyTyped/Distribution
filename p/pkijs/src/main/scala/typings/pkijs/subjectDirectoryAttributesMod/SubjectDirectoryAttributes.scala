package typings.pkijs.subjectDirectoryAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubjectDirectoryAttributes extends js.Object {
  var attributes: js.Array[typings.pkijs.attributeMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SubjectDirectoryAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[typings.pkijs.attributeMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): SubjectDirectoryAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[SubjectDirectoryAttributes]
  }
}

