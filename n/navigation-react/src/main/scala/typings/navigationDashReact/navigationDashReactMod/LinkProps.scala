package typings.navigationDashReact.navigationDashReactMod

import typings.navigationDashReact.navigationDashReactStrings.add
import typings.navigationDashReact.navigationDashReactStrings.none
import typings.navigationDashReact.navigationDashReactStrings.replace
import typings.react.NativeMouseEvent
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[add | replace | none] = js.undefined
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String, Boolean]
  ] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    historyAction: add | replace | none = null,
    navigating: (/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String) => Boolean = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (historyAction != null) __obj.updateDynamic("historyAction")(historyAction.asInstanceOf[js.Any])
    if (navigating != null) __obj.updateDynamic("navigating")(js.Any.fromFunction2(navigating))
    __obj.asInstanceOf[LinkProps]
  }
}

