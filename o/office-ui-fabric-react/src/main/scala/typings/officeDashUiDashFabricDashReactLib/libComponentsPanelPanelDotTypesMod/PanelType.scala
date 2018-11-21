package typings
package officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PanelType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.types", "PanelType")
@js.native
object PanelType extends js.Object {
  /**
       * Renders the panel in 'custom' mode using customWidth, anchored to the far side (right in LTR mode).
       * Small: <adapts to smallFluid>
       * Medium: <adapts to smallFixedFar>
       * Large: 48px fixed left margin, 32px Left/Right padding
       * XLarge: 644px width, 32px Left/Right padding
       * XXLarge: 643px width, 40px Left/Right padding
       */
  @js.native
  sealed trait custom
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'extra large' mode, anchored to the far side (right in LTR mode).
       * Small: <adapts to smallFluid>
       * Medium: <adapts to smallFixedFar>
       * Large: <adapts to medium>
       * XLarge: <adapts to large>
       * XXLarge: 176px fixed left margin, 40px Left/Right padding
       * XXXLarge: 176px fixed left margin, 40px Left/Right padding
       */
  @js.native
  sealed trait extraLarge
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'large' mode, anchored to the far side (right in LTR mode), and is fluid at XXX-Large breakpoint.
       * Small: <adapts to smallFluid>
       * Medium:  <adapts to smallFixedFar>
       * Large: <adapts to medium>
       * XLarge: 48px fixed left margin, 32px Left/Right padding
       * XXLarge: 48px fixed left margin, 32px Left/Right padding
       * XXXLarge: 48px fixed left margin, (no redlines for padding, assuming previous breakpoint)
       */
  @js.native
  sealed trait large
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'large' mode, anchored to the far side (right in LTR mode), and is fixed at XXX-Large breakpoint.
       * Small: <adapts to smallFluid>
       * Medium:  <adapts to smallFixedFar>
       * Large: <adapts to medium>
       * XLarge: 48px fixed left margin, 32px Left/Right padding
       * XXLarge: 48px fixed left margin, 32px Left/Right padding
       * XXXLarge: 940px width, (no redlines for padding, assuming previous breakpoint)
       */
  @js.native
  sealed trait largeFixed
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'medium' mode, anchored to the far side (right in LTR mode).
       * Small: <adapts to smallFluid>
       * Medium: <adapts to smallFixedFar>
       * Large: 48px fixed left margin, 32px Left/Right padding
       * XLarge: 644px width, 32px Left/Right padding
       * XXLarge: 643px width, 40px Left/Right padding
       */
  @js.native
  sealed trait medium
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'small' mode, anchored to the far side (right in LTR mode), and has a fixed width.
       * Small: 272px width, 16px Left/Right padding
       * Medium: 340px width, 16px Left/Right padding
       * Large: 340px width, 32px Left/Right padding
       * XLarge: 340px width, 32px Left/Right padding
       * XXLarge: 340px width, 40px Left/Right padding
       */
  @js.native
  sealed trait smallFixedFar
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'small' mode, anchored to the near side (left in LTR mode), and has a fixed width.
       * Small: 272px width, 16px Left/Right padding
       * Medium: 272px width, 16px Left/Right padding
       * Large: 272px width, 32px Left/Right padding
       * XLarge: 272px width, 32px Left/Right padding
       * XXLarge: 272px width, 32px Left/Right padding
       */
  @js.native
  sealed trait smallFixedNear
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /**
       * Renders the panel in 'small' mode, anchored to the far side (right in LTR mode), and has a fluid width.
       * Only used on Small screen breakpoints.
       * Small: 320-479px width (full screen), 16px Left/Right padding
       * Medium: <unused>
       * Large: <unused>
       * XLarge: <unused>
       * XXLarge: <unused>
       */
  @js.native
  sealed trait smallFluid
    extends officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType
  
  /* 7 */ val custom: custom with scala.Double = js.native
  /* 6 */ val extraLarge: extraLarge with scala.Double = js.native
  /* 4 */ val large: large with scala.Double = js.native
  /* 5 */ val largeFixed: largeFixed with scala.Double = js.native
  /* 3 */ val medium: medium with scala.Double = js.native
  /* 1 */ val smallFixedFar: smallFixedFar with scala.Double = js.native
  /* 2 */ val smallFixedNear: smallFixedNear with scala.Double = js.native
  /* 0 */ val smallFluid: smallFluid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.PanelType with scala.Double
  ] = js.native
}

