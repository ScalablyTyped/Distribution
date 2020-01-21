package typings.pkijs.otherRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRecipientInfo extends js.Object {
  var oriType: String
  var oriValue: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    oriType: String,
    oriValue: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), oriType = oriType.asInstanceOf[js.Any], oriValue = oriValue.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherRecipientInfo]
  }
}

