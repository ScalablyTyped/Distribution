package typings.popmotionPose.typesMod

import typings.popmotion.mod.ValueReaction
import typings.styleValueTypes.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var raw: ValueReaction = js.native
  var `type`: js.UndefOr[ValueType] = js.native
}

object Value {
  @scala.inline
  def apply(raw: ValueReaction): Value = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setRaw(value: ValueReaction): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ValueType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

