package typings
package pkijsLib.srcOtherRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRecipientInfo extends js.Object {
  var oriType: java.lang.String
  var oriValue: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    oriType: java.lang.String,
    oriValue: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), oriType = oriType, oriValue = oriValue, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherRecipientInfo]
  }
}

