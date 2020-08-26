package typings.officeUiFabricReact.coachmarkBasicExampleMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkBasicExampleState extends js.Object {
  var coachmarkPosition: DirectionalHint = js.native
  var dropdownSelectedOptionKey: String | Double = js.native
  var isCoachmarkVisible: js.UndefOr[Boolean] = js.native
}

object ICoachmarkBasicExampleState {
  @scala.inline
  def apply(coachmarkPosition: DirectionalHint, dropdownSelectedOptionKey: String | Double): ICoachmarkBasicExampleState = {
    val __obj = js.Dynamic.literal(coachmarkPosition = coachmarkPosition.asInstanceOf[js.Any], dropdownSelectedOptionKey = dropdownSelectedOptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkBasicExampleState]
  }
  @scala.inline
  implicit class ICoachmarkBasicExampleStateOps[Self <: ICoachmarkBasicExampleState] (val x: Self) extends AnyVal {
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
    def setCoachmarkPosition(value: DirectionalHint): Self = this.set("coachmarkPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownSelectedOptionKey(value: String | Double): Self = this.set("dropdownSelectedOptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCoachmarkVisible(value: Boolean): Self = this.set("isCoachmarkVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCoachmarkVisible: Self = this.set("isCoachmarkVisible", js.undefined)
  }
  
}

