package typings
package navigationDashReactLib.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLAnchorElement] {
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[
    navigationDashReactLib.navigationDashReactLibStrings.add | navigationDashReactLib.navigationDashReactLibStrings.replace | navigationDashReactLib.navigationDashReactLibStrings.none
  ] = js.undefined
  /**
    * Indicates whether Links listen for navigate events
    */
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[
    js.Function3[
      /* e */ stdLib.MouseEvent, 
      /* domId */ java.lang.String, 
      /* link */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * The State Navigator
    */
  var stateNavigator: js.UndefOr[navigationLib.navigationMod.StateNavigator] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLAnchorElement] = null,
    historyAction: navigationDashReactLib.navigationDashReactLibStrings.add | navigationDashReactLib.navigationDashReactLibStrings.replace | navigationDashReactLib.navigationDashReactLibStrings.none = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    navigating: (/* e */ stdLib.MouseEvent, /* domId */ java.lang.String, /* link */ java.lang.String) => scala.Boolean = null,
    stateNavigator: navigationLib.navigationMod.StateNavigator = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (historyAction != null) __obj.updateDynamic("historyAction")(historyAction.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (navigating != null) __obj.updateDynamic("navigating")(js.Any.fromFunction3(navigating))
    if (stateNavigator != null) __obj.updateDynamic("stateNavigator")(stateNavigator)
    __obj.asInstanceOf[LinkProps]
  }
}

