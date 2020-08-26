package typings.officeUiFabricReact.suggestionsDottypesMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsHeaderFooterProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.native
  def renderItem(): Element = js.native
  def shouldShow(): Boolean = js.native
}

object ISuggestionsHeaderFooterProps {
  @scala.inline
  def apply(renderItem: () => Element, shouldShow: () => Boolean): ISuggestionsHeaderFooterProps = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction0(renderItem), shouldShow = js.Any.fromFunction0(shouldShow))
    __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
  }
  @scala.inline
  implicit class ISuggestionsHeaderFooterPropsOps[Self <: ISuggestionsHeaderFooterProps] (val x: Self) extends AnyVal {
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
    def setRenderItem(value: () => Element): Self = this.set("renderItem", js.Any.fromFunction0(value))
    @scala.inline
    def setShouldShow(value: () => Boolean): Self = this.set("shouldShow", js.Any.fromFunction0(value))
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnExecute(value: () => Unit): Self = this.set("onExecute", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExecute: Self = this.set("onExecute", js.undefined)
  }
  
}

