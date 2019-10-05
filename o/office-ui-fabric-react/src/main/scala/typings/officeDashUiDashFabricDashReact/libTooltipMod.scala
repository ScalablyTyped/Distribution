package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.ITooltipProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`0`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`10`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`11`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`12`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`13`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`1`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`2`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`3`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`4`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`5`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`6`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`7`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`8`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`9`
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Tooltip", JSImport.Namespace)
@js.native
object libTooltipMod extends js.Object {
  @js.native
  class TooltipBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTooltipMod.TooltipBase
  
  @js.native
  class TooltipHostBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTooltipMod.TooltipHostBase {
    def this(props: ITooltipHostProps) = this()
  }
  
  val Tooltip: StatelessComponent[ITooltipProps] = js.native
  val TooltipHost: StatelessComponent[ITooltipHostProps] = js.native
  @js.native
  object DirectionalHint extends js.Object {
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var bottomAutoEdge: `7` = js.native
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    var bottomCenter: `5` = js.native
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    var bottomLeftEdge: `4` = js.native
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    var bottomRightEdge: `6` = js.native
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    var leftBottomEdge: `10` = js.native
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    var leftCenter: `9` = js.native
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    var leftTopEdge: `8` = js.native
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    var rightBottomEdge: `13` = js.native
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    var rightCenter: `12` = js.native
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    var rightTopEdge: `11` = js.native
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var topAutoEdge: `3` = js.native
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    var topCenter: `1` = js.native
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    var topLeftEdge: `0` = js.native
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    var topRightEdge: `2` = js.native
  }
  
  /* static members */
  @js.native
  object TooltipBase extends js.Object {
    var defaultProps: Partial[ITooltipProps] = js.native
  }
  
  @js.native
  object TooltipDelay extends js.Object {
    /* 2 */ val long: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.long with Double = js.native
    /* 1 */ val medium: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.medium with Double = js.native
    /* 0 */ val zero: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.zero with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TooltipHostBase extends js.Object {
    var _currentVisibleTooltip: js.Any = js.native
    var defaultProps: Anon_Delay = js.native
  }
  
  @js.native
  object TooltipOverflowMode extends js.Object {
    /* 0 */ val Parent: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Parent with Double = js.native
    /* 1 */ val Self: typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Self with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode with Double
      ] = js.native
  }
  
}

