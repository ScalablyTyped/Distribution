package typings
package pkijsLib.srcOtherRevocationInfoFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRevocationInfoFormat extends js.Object {
  var otherRevInfo: js.Any
  var otherRevInfoFormat: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRevocationInfoFormat {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    otherRevInfo: js.Any,
    otherRevInfoFormat: java.lang.String,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, otherRevInfo = otherRevInfo, otherRevInfoFormat = otherRevInfoFormat, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OtherRevocationInfoFormat]
  }
}

