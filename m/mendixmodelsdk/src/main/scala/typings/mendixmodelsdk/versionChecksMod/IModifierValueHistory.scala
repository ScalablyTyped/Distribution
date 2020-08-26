package typings.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModifierValueHistory extends js.Object {
  /** descending list of change in previous meta model versions */
  var changedIn: js.UndefOr[js.Array[String]] = js.native
  var currentValue: Boolean = js.native
}

object IModifierValueHistory {
  @scala.inline
  def apply(currentValue: Boolean): IModifierValueHistory = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifierValueHistory]
  }
  @scala.inline
  implicit class IModifierValueHistoryOps[Self <: IModifierValueHistory] (val x: Self) extends AnyVal {
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
    def setCurrentValue(value: Boolean): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedInVarargs(value: String*): Self = this.set("changedIn", js.Array(value :_*))
    @scala.inline
    def setChangedIn(value: js.Array[String]): Self = this.set("changedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedIn: Self = this.set("changedIn", js.undefined)
  }
  
}

