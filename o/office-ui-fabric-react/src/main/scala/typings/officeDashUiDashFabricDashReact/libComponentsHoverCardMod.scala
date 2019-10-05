package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.IExpandingCardProps
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.IHoverCardProps
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardPlainCardPlainCardDotTypesMod.IPlainCardProps
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/HoverCard", JSImport.Namespace)
@js.native
object libComponentsHoverCardMod extends js.Object {
  @js.native
  class ExpandingCardBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotBaseMod.ExpandingCardBase {
    def this(props: IExpandingCardProps) = this()
  }
  
  @js.native
  class HoverCardBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotBaseMod.HoverCardBase {
    def this(props: IHoverCardProps) = this()
  }
  
  @js.native
  class PlainCardBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsHoverCardPlainCardPlainCardDotBaseMod.PlainCardBase
  
  val ExpandingCard: StatelessComponent[IExpandingCardProps] = js.native
  val HoverCard: StatelessComponent[IHoverCardProps] = js.native
  val PlainCard: StatelessComponent[IPlainCardProps] = js.native
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
  object ExpandingCardBase extends js.Object {
    var defaultProps: Anon_CompactCardHeight = js.native
  }
  
  @js.native
  object ExpandingCardMode extends js.Object {
    /* 0 */ val compact: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode.compact with Double = js.native
    /* 1 */ val expanded: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode.expanded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object HoverCardBase extends js.Object {
    var defaultProps: Anon_CardDismissDelay = js.native
  }
  
  @js.native
  object HoverCardType extends js.Object {
    /* "ExpandingCard" */ val expanding: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType.expanding with String = js.native
    /* "PlainCard" */ val plain: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType.plain with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.HoverCardType with String
      ] = js.native
  }
  
  @js.native
  object OpenCardMode extends js.Object {
    /* 1 */ val hotKey: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hotKey with Double = js.native
    /* 0 */ val hover: typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode.hover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode with Double
      ] = js.native
  }
  
}

