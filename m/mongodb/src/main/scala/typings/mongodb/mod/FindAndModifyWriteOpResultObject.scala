package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAndModifyWriteOpResultObject[TSchema] extends js.Object {
  //The raw lastErrorObject returned from the command.
  var lastErrorObject: js.UndefOr[js.Any] = js.undefined
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.undefined
  //Document returned from findAndModify command.
  var value: js.UndefOr[TSchema] = js.undefined
}

object FindAndModifyWriteOpResultObject {
  @scala.inline
  def apply[TSchema](lastErrorObject: js.Any = null, ok: js.UndefOr[scala.Double] = js.undefined, value: TSchema = null): FindAndModifyWriteOpResultObject[TSchema] = {
    val __obj = js.Dynamic.literal()
    if (lastErrorObject != null) __obj.updateDynamic("lastErrorObject")(lastErrorObject.asInstanceOf[js.Any])
    if (!js.isUndefined(ok)) __obj.updateDynamic("ok")(ok.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAndModifyWriteOpResultObject[TSchema]]
  }
}

