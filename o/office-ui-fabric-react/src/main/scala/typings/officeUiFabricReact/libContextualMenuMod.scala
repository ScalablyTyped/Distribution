package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.Target
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuProps
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IMenuItemStyles
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemStyleProps
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemStyles
import typings.officeUiFabricReact.officeUiFabricReactInts.`0`
import typings.officeUiFabricReact.officeUiFabricReactInts.`10`
import typings.officeUiFabricReact.officeUiFabricReactInts.`11`
import typings.officeUiFabricReact.officeUiFabricReactInts.`12`
import typings.officeUiFabricReact.officeUiFabricReactInts.`13`
import typings.officeUiFabricReact.officeUiFabricReactInts.`1`
import typings.officeUiFabricReact.officeUiFabricReactInts.`2`
import typings.officeUiFabricReact.officeUiFabricReactInts.`3`
import typings.officeUiFabricReact.officeUiFabricReactInts.`4`
import typings.officeUiFabricReact.officeUiFabricReactInts.`5`
import typings.officeUiFabricReact.officeUiFabricReactInts.`6`
import typings.officeUiFabricReact.officeUiFabricReactInts.`7`
import typings.officeUiFabricReact.officeUiFabricReactInts.`8`
import typings.officeUiFabricReact.officeUiFabricReactInts.`9`
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextualMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenu")
  @js.native
  val ContextualMenu: FunctionComponent[IContextualMenuProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase")
  @js.native
  open class ContextualMenuBase protected ()
    extends typings.officeUiFabricReact.libComponentsContextualMenuMod.ContextualMenuBase {
    def this(props: IContextualMenuProps) = this()
  }
  /* static members */
  object ContextualMenuBase {
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase.defaultProps")
    @js.native
    def defaultProps: IContextualMenuProps = js.native
    inline def defaultProps_=(x: IContextualMenuProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItem")
  @js.native
  val ContextualMenuItem: FunctionComponent[IContextualMenuItemProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItemBase")
  @js.native
  open class ContextualMenuItemBase protected ()
    extends typings.officeUiFabricReact.libComponentsContextualMenuMod.ContextualMenuItemBase {
    def this(props: IContextualMenuItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItemType")
  @js.native
  object ContextualMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.ContextualMenuItemType & Double
      ] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.ContextualMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.ContextualMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.ContextualMenuItemType.Normal & Double = js.native
    
    /* 3 */ val Section: typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.ContextualMenuItemType.Section & Double = js.native
  }
  
  object DirectionalHint {
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomAutoEdge")
    @js.native
    def bottomAutoEdge: `7` = js.native
    inline def bottomAutoEdge_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomCenter")
    @js.native
    def bottomCenter: `5` = js.native
    inline def bottomCenter_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomLeftEdge")
    @js.native
    def bottomLeftEdge: `4` = js.native
    inline def bottomLeftEdge_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomRightEdge")
    @js.native
    def bottomRightEdge: `6` = js.native
    inline def bottomRightEdge_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRightEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftBottomEdge")
    @js.native
    def leftBottomEdge: `10` = js.native
    inline def leftBottomEdge_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftCenter")
    @js.native
    def leftCenter: `9` = js.native
    inline def leftCenter_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftTopEdge")
    @js.native
    def leftTopEdge: `8` = js.native
    inline def leftTopEdge_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightBottomEdge")
    @js.native
    def rightBottomEdge: `13` = js.native
    inline def rightBottomEdge_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightCenter")
    @js.native
    def rightCenter: `12` = js.native
    inline def rightCenter_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightTopEdge")
    @js.native
    def rightTopEdge: `11` = js.native
    inline def rightTopEdge_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topAutoEdge")
    @js.native
    def topAutoEdge: `3` = js.native
    inline def topAutoEdge_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topCenter")
    @js.native
    def topCenter: `1` = js.native
    inline def topCenter_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topLeftEdge")
    @js.native
    def topLeftEdge: `0` = js.native
    inline def topLeftEdge_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topRightEdge")
    @js.native
    def topRightEdge: `2` = js.native
    inline def topRightEdge_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRightEdge")(x.asInstanceOf[js.Any])
  }
  
  inline def canAnyMenuItemsCheck(items: js.Array[IContextualMenuItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAnyMenuItemsCheck")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getContextualMenuItemClassNames(
    theme: ITheme,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    itemClassName: js.UndefOr[String],
    dividerClassName: js.UndefOr[String],
    iconClassName: js.UndefOr[String],
    subMenuClassName: js.UndefOr[String],
    primaryDisabled: js.UndefOr[Boolean],
    className: js.UndefOr[String]
  ): IContextualMenuItemStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getContextualMenuItemClassNames")(theme.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], isAnchorLink.asInstanceOf[js.Any], knownIcon.asInstanceOf[js.Any], itemClassName.asInstanceOf[js.Any], dividerClassName.asInstanceOf[js.Any], iconClassName.asInstanceOf[js.Any], subMenuClassName.asInstanceOf[js.Any], primaryDisabled.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[IContextualMenuItemStyles]
  
  inline def getContextualMenuItemStyles(props: IContextualMenuItemStyleProps): IContextualMenuItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getContextualMenuItemStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IContextualMenuItemStyles]
  
  inline def getMenuItemStyles(theme: ITheme): IMenuItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IMenuItemStyles]
  
  inline def getSubmenuItems(item: IContextualMenuItem): js.UndefOr[js.Array[IContextualMenuItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmenuItems")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[IContextualMenuItem]]]
  inline def getSubmenuItems(item: IContextualMenuItem, options: Target): js.UndefOr[js.Array[IContextualMenuItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubmenuItems")(item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IContextualMenuItem]]]
}
