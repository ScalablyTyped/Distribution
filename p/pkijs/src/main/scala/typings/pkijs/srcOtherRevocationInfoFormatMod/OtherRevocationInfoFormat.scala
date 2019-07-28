package typings.pkijs.srcOtherRevocationInfoFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRevocationInfoFormat extends js.Object {
  var otherRevInfo: js.Any
  var otherRevInfoFormat: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRevocationInfoFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    otherRevInfo: js.Any,
    otherRevInfoFormat: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherRevInfo = otherRevInfo, otherRevInfoFormat = otherRevInfoFormat, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherRevocationInfoFormat]
  }
}

