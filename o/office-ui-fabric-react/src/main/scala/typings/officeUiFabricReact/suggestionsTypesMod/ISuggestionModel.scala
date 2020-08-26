package typings.officeUiFabricReact.suggestionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionModel[T] extends js.Object {
  /** Aria-label string for each suggested item. */
  var ariaLabel: js.UndefOr[String] = js.native
  /** The suggested item of the type T */
  var item: T = js.native
  /** Whether the suggested item is selected or not. */
  var selected: Boolean = js.native
}

object ISuggestionModel {
  @scala.inline
  def apply[T](item: T, selected: Boolean): ISuggestionModel[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionModel[T]]
  }
  @scala.inline
  implicit class ISuggestionModelOps[Self <: ISuggestionModel[_], T] (val x: Self with ISuggestionModel[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
  }
  
}

