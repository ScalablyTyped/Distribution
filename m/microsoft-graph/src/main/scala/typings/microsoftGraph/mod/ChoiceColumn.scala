package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoiceColumn extends js.Object {
  // If true, allows custom values that aren't in the configured choices.
  var allowTextEntry: js.UndefOr[Boolean] = js.native
  // The list of values available for this column.
  var choices: js.UndefOr[js.Array[String]] = js.native
  // How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
  var displayAs: js.UndefOr[String] = js.native
}

object ChoiceColumn {
  @scala.inline
  def apply(): ChoiceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceColumn]
  }
  @scala.inline
  implicit class ChoiceColumnOps[Self <: ChoiceColumn] (val x: Self) extends AnyVal {
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
    def setAllowTextEntry(value: Boolean): Self = this.set("allowTextEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTextEntry: Self = this.set("allowTextEntry", js.undefined)
    @scala.inline
    def setChoicesVarargs(value: String*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setDisplayAs(value: String): Self = this.set("displayAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayAs: Self = this.set("displayAs", js.undefined)
  }
  
}

