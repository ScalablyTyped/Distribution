package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`10`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`11`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`13`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`4`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`5`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`8`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`9`
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  @js.native
  class TooltipBase ()
    extends typings.officeUiFabricReact.tooltipBaseMod.TooltipBase
  
  @js.native
  class TooltipHostBase protected ()
    extends typings.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase {
    def this(props: ITooltipHostProps) = this()
  }
  
  val Tooltip: FunctionComponent[ITooltipProps] = js.native
  val TooltipHost: FunctionComponent[ITooltipHostProps] = js.native
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
    var defaultProps: PartialITooltipProps = js.native
  }
  
  @js.native
  object TooltipDelay extends js.Object {
    /* 2 */ val long: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.long with Double = js.native
    /* 1 */ val medium: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.medium with Double = js.native
    /* 0 */ val zero: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.zero with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay with Double] = js.native
  }
  
  /* static members */
  @js.native
  object TooltipHostBase extends js.Object {
    var _currentVisibleTooltip: js.Any = js.native
    var defaultProps: AnonDelay = js.native
  }
  
  @js.native
  object TooltipOverflowMode extends js.Object {
    /* 0 */ val Parent: typings.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Parent with Double = js.native
    /* 1 */ val Self: typings.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Self with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode with Double] = js.native
  }
  
}

