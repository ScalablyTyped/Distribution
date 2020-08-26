package typings.navigationReact.mod

import typings.navigationReact.navigationReactStrings.add
import typings.navigationReact.navigationReactStrings.none
import typings.navigationReact.navigationReactStrings.replace
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[add | replace | none] = js.native
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String, Boolean]
  ] = js.native
}

object LinkProps {
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setHistoryAction(value: add | replace | none): Self = this.set("historyAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryAction: Self = this.set("historyAction", js.undefined)
    @scala.inline
    def setNavigating(value: (/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String) => Boolean): Self = this.set("navigating", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNavigating: Self = this.set("navigating", js.undefined)
  }
  
}

