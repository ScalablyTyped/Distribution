package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.anon.CompactCardHeight
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
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
import typings.officeUiFabricReact.plainCardTypesMod.IPlainCardProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/HoverCard", JSImport.Namespace)
@js.native
object libHoverCardMod extends js.Object {
  @js.native
  class ExpandingCardBase protected ()
    extends typings.officeUiFabricReact.hoverCardMod.ExpandingCardBase {
    def this(props: IExpandingCardProps) = this()
  }
  
  @js.native
  class HoverCardBase protected ()
    extends typings.officeUiFabricReact.hoverCardMod.HoverCardBase {
    def this(props: IHoverCardProps) = this()
  }
  
  @js.native
  class PlainCardBase protected ()
    extends typings.officeUiFabricReact.hoverCardMod.PlainCardBase {
    def this(props: IPlainCardProps) = this()
  }
  
  val ExpandingCard: FunctionComponent[IExpandingCardProps] = js.native
  val HoverCard: FunctionComponent[IHoverCardProps] = js.native
  val PlainCard: FunctionComponent[IPlainCardProps] = js.native
  @js.native
  object DirectionalHint extends js.Object {
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
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
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
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
    var defaultProps: CompactCardHeight = js.native
  }
  
  @js.native
  object ExpandingCardMode extends js.Object {
    /* 0 */ val compact: typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.compact with Double = js.native
    /* 1 */ val expanded: typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.expanded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object HoverCardBase extends js.Object {
    var defaultProps: CardDismissDelay = js.native
  }
  
  @js.native
  object HoverCardType extends js.Object {
    /* "ExpandingCard" */ val expanding: typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType.expanding with String = js.native
    /* "PlainCard" */ val plain: typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType.plain with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType with String] = js.native
  }
  
  @js.native
  object OpenCardMode extends js.Object {
    /* 1 */ val hotKey: typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hotKey with Double = js.native
    /* 0 */ val hover: typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode with Double] = js.native
  }
  
}

