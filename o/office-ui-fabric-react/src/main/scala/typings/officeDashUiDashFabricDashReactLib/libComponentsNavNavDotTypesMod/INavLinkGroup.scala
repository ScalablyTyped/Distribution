package typings
package officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INavLinkGroup extends js.Object {
  /**
       * The name to use for functional automation tests
       */
  var automationId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true, the group should render collapsed by default
       */
  var collapseByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Links to render within this group
       */
  var links: js.Array[INavLink]
  /**
       * Text to render as the header of a group
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Callback invoked when a group header is clicked
       */
  var onHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* isCollapsing */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

