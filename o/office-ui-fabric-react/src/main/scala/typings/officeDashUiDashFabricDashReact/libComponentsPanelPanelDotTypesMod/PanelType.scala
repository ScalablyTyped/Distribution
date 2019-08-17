package typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PanelType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.types", "PanelType")
@js.native
object PanelType extends js.Object {
  /**
    * Renders the Panel in `custom` size using `customWidth`, anchored to the far side (right in LTR mode).
    * - Has a fixed width provided by the `customWidth` prop
    * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
    * taking up 100% of the viewport width
    */
  @js.native
  sealed trait custom extends PanelType
  
  /**
    * Renders the Panel in `custom` size using `customWidth`, anchored to the near side (left in LTR mode).
    * - Has a fixed width provided by the `customWidth` prop
    * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
    * taking up 100% of the viewport width
    */
  @js.native
  sealed trait customNear extends PanelType
  
  /**
    * Renders the Panel in `extra large` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): adapts to `PanelType.large` at this breakpoint
    * - XXLarge (1366-1919): 176px fixed left margin, fluid width, 40px left/right padding
    * - XXXLarge (1920-up): 176px fixed left margin, fluid width, 40px left/right padding
    */
  @js.native
  sealed trait extraLarge extends PanelType
  
  /**
    * Renders the Panel in `large` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639):  adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
    * - XXLarge (1366-up): 428px fixed left margin, fluid width, 40px left/right padding
    */
  @js.native
  sealed trait large extends PanelType
  
  /**
    * Renders the Panel in `large` size, anchored to the far side (right in LTR mode), with a fixed width at XX-Large breakpoint.
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
    * - XXLarge (1366-up): 940px width, 40px left/right padding
    */
  @js.native
  sealed trait largeFixed extends PanelType
  
  /**
    * Renders the Panel in `medium` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): 592px width, 32px left/right padding
    * - XLarge (1024-1365): 644px width, 32px left/right padding
    * - XXLarge (1366-up): 644px width, 40px left/right padding
    */
  @js.native
  sealed trait medium extends PanelType
  
  /**
    * Renders the Panel in fixed-width `small` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): 340px width, 16px left/right padding
    * - Large (640-1023): 340px width, 32px left/right padding
    * - XLarge (1024-1365): 340px width, 32px left/right padding
    * - XXLarge (1366-up): 340px width, 40px left/right padding
    */
  @js.native
  sealed trait smallFixedFar extends PanelType
  
  /**
    * Renders the Panel in fixed-width `small` size, anchored to the near side (left in LTR mode).
    * - Small (320-479): 272px width, 16px left/right padding
    * - Medium (480-639): 272px width, 16px left/right padding
    * - Large (640-1023): 272px width, 32px left/right padding
    * - XLarge (1024-1365): 272px width, 32px left/right padding
    * - XXLarge (1366-up): 272px width, 40px left/right padding
    */
  @js.native
  sealed trait smallFixedNear extends PanelType
  
  /**
    * Renders the Panel with a `fluid` (full screen) width.
    * Recommended for use on small screen breakpoints.
    * - Small (320-479): full screen width, 16px left/right padding
    * - Medium (480-639): full screen width, 16px left/right padding
    * - Large (640-1023): full screen width, 32px left/right padding
    * - XLarge (1024-1365): full screen width, 32px left/right padding
    * - XXLarge (1366-up): full screen width, 40px left/right padding
    */
  @js.native
  sealed trait smallFluid extends PanelType
  
  /* 7 */ val custom: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.custom with Double = js.native
  /* 8 */ val customNear: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.customNear with Double = js.native
  /* 6 */ val extraLarge: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.extraLarge with Double = js.native
  /* 4 */ val large: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.large with Double = js.native
  /* 5 */ val largeFixed: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.largeFixed with Double = js.native
  /* 3 */ val medium: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.medium with Double = js.native
  /* 1 */ val smallFixedFar: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.smallFixedFar with Double = js.native
  /* 2 */ val smallFixedNear: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.smallFixedNear with Double = js.native
  /* 0 */ val smallFluid: typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.PanelType.smallFluid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PanelType with Double] = js.native
}

