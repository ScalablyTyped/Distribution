package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PanelClassName extends js.Object {
  /**
       * Optional custom classname for the callout that displays in larger viewports, hosting the Dropdown options.
       * This is primarily provided for backwards compatibility.
       */
  var calloutClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Prop to notify on what edge the dropdown callout was positioned respective to the title.
       */
  var calloutRenderEdge: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  ] = js.undefined
  /**
       * Whether the dropdown is in an error state.
       */
  var hasError: scala.Boolean
  /**
       * Whether the dropdown is in an opened state.
       */
  var isOpen: scala.Boolean
  /**
       * Whether the dropdown is presently rendering a placeholder.
       */
  var isRenderingPlaceholder: scala.Boolean
  /**
       * Optional custom classname for the panel that displays in small viewports, hosting the Dropdown options.
       * This is primarily provided for backwards compatibility.
       */
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
}

