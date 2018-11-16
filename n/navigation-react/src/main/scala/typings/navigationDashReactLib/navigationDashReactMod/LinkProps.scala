package typings
package navigationDashReactLib.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinkProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLAnchorElement] {
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
      /* e */ reactLib.MouseEvent, 
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

