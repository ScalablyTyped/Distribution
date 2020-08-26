package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// KlassOptions shared between date and time pickers
@js.native
trait KlassOptions extends js.Object {
   // default 'picker__input'
  var active: js.UndefOr[String] = js.native
   // default 'picker__wrap'
  var box: js.UndefOr[String] = js.native
   // default 'picker__day--today' or 'picker__list-item--now'
  // Clear button
  var buttonClear: js.UndefOr[String] = js.native
   // default 'picker__box'
  // Day/Time states
  var disabled: js.UndefOr[String] = js.native
   // default 'picker--opened'
  var focused: js.UndefOr[String] = js.native
   // default 'picker__holder'
  // The picker frame, wrapper, and box
  var frame: js.UndefOr[String] = js.native
  // default 'picker__day--selected' or 'picker__list-item--selected'
  var highlighted: js.UndefOr[String] = js.native
   // default 'picker--focused'
  // The picker holder
  var holder: js.UndefOr[String] = js.native
  // The element states
  var input: js.UndefOr[String] = js.native
  // default 'picker__day--highlighted' or 'picker__list-item--highlighted'
  var now: js.UndefOr[String] = js.native
   // default 'picker' or 'picker picker--time'
  var opened: js.UndefOr[String] = js.native
   // default 'picker__input--active'
  // The root picker and states
  var picker: js.UndefOr[String] = js.native
   // default 'picker__day--disabled' or 'picker__list-item--disabled'
  var selected: js.UndefOr[String] = js.native
   // default 'picker__frame'
  var wrap: js.UndefOr[String] = js.native
}

object KlassOptions {
  @scala.inline
  def apply(): KlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KlassOptions]
  }
  @scala.inline
  implicit class KlassOptionsOps[Self <: KlassOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBox(value: String): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setButtonClear(value: String): Self = this.set("buttonClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonClear: Self = this.set("buttonClear", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setHighlighted(value: String): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlighted: Self = this.set("highlighted", js.undefined)
    @scala.inline
    def setHolder(value: String): Self = this.set("holder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolder: Self = this.set("holder", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setNow(value: String): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    @scala.inline
    def setOpened(value: String): Self = this.set("opened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setPicker(value: String): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

