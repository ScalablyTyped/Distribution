package typings
package officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarItemProps
  extends officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem {
  /**
    * Custom styles for individual button
    */
  var buttonStyles: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonStyles
  ] = js.undefined
  /**
    * A custom cache key to be used for this item. If cacheKey is changed, the cache will invalidate. Defaults to key value;
    */
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Method to override the render of the individual command bar button. Note, is not used when rendered in overflow
    * @defaultvalue CommandBarButton
    */
  var commandBarButtonAs: js.UndefOr[atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[ICommandBarItemProps]] = js.undefined
  /**
    * Remove text when button is not in the overflow
    * @defaultvalue false
    */
  var iconOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Context under which the item is being rendered
    * This value is controlled by the component and useful for adjusting onRender function
    */
  var renderedInOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Props to pass into tooltip during iconOnly
    */
  var tooltipHostProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
  ] = js.undefined
}

