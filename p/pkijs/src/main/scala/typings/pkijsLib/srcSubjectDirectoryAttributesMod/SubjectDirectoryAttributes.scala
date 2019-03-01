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
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): SubjectDirectoryAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[SubjectDirectoryAttributes]
  }
}

