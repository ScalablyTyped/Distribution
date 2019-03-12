package typings
package pkijsLib.srcContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentInfo extends js.Object {
  var content: js.Any
  var contentType: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ContentInfo {
  @scala.inline
  def apply(
    content: js.Any,
    contentType: java.lang.String,
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ContentInfo = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[ContentInfo]
  }
}

