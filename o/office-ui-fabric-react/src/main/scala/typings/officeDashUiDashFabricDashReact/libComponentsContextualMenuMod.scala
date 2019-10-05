package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
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

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu", JSImport.Namespace)
@js.native
object libComponentsContextualMenuMod extends js.Object {
  @js.native
  class ContextualMenuBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotBaseMod.ContextualMenuBase {
    def this(props: IContextualMenuProps) = this()
  }
  
  @js.native
  class ContextualMenuItemBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotBaseMod.ContextualMenuItemBase
  
  val ContextualMenu: StatelessComponent[IContextualMenuProps] = js.native
  val ContextualMenuItem: StatelessComponent[IContextualMenuItemProps] = js.native
  def canAnyMenuItemsCheck(items: js.Array[IContextualMenuItem]): Boolean = js.native
  def getSubmenuItems(item: IContextualMenuItem): js.UndefOr[js.Array[IContextualMenuItem]] = js.native
  /* static members */
  @js.native
  object ContextualMenuBase extends js.Object {
    var defaultProps: IContextualMenuProps = js.native
  }
  
  @js.native
  object ContextualMenuItemType extends js.Object {
    /* 1 */ val Divider: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Normal with Double = js.native
    /* 3 */ val Section: typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType.Section with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.ContextualMenuItemType with Double
      ] = js.native
  }
  
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
  
}

