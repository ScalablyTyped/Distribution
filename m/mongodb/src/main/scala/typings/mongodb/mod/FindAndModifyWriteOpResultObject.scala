package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindAndModifyWriteOpResultObject[TSchema] extends js.Object {
  //The raw lastErrorObject returned from the command.
  var lastErrorObject: js.UndefOr[js.Any] = js.native
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.native
  //Document returned from findAndModify command.
  var value: js.UndefOr[TSchema] = js.native
}

object FindAndModifyWriteOpResultObject {
  @scala.inline
  def apply[TSchema](): FindAndModifyWriteOpResultObject[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAndModifyWriteOpResultObject[TSchema]]
  }
  @scala.inline
  implicit class FindAndModifyWriteOpResultObjectOps[Self <: FindAndModifyWriteOpResultObject[_], TSchema] (val x: Self with FindAndModifyWriteOpResultObject[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastErrorObject(value: js.Any): Self = this.set("lastErrorObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastErrorObject: Self = this.set("lastErrorObject", js.undefined)
    @scala.inline
    def setOk(value: scala.Double): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    @scala.inline
    def setValue(value: TSchema): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

