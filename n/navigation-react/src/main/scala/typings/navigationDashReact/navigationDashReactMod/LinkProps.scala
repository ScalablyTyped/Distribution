package typings.navigationDashReact.navigationDashReactMod

import typings.navigation.navigationMod.StateNavigator
import typings.navigationDashReact.navigationDashReactStrings.add
import typings.navigationDashReact.navigationDashReactStrings.none
import typings.navigationDashReact.navigationDashReactStrings.replace
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[add | replace | none] = js.undefined
  /**
    * Indicates whether Links listen for navigate events
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[js.Function3[/* e */ MouseEvent, /* domId */ String, /* link */ String, Boolean]] = js.undefined
  /**
    * The State Navigator
    */
  var stateNavigator: js.UndefOr[StateNavigator] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    historyAction: add | replace | none = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    navigating: (/* e */ MouseEvent, /* domId */ String, /* link */ String) => Boolean = null,
    stateNavigator: StateNavigator = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (historyAction != null) __obj.updateDynamic("historyAction")(historyAction.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (navigating != null) __obj.updateDynamic("navigating")(js.Any.fromFunction3(navigating))
    if (stateNavigator != null) __obj.updateDynamic("stateNavigator")(stateNavigator)
    __obj.asInstanceOf[LinkProps]
  }
}

