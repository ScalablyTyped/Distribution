package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardProps
import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardStyleProps
import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardStyles
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardExpandingCardDottypesMod {
  
  @js.native
  sealed trait ExpandingCardMode extends StObject
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.types", "ExpandingCardMode")
  @js.native
  object ExpandingCardMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExpandingCardMode & Double] = js.native
    
    /**
      * To have top compact card only
      */
    @js.native
    sealed trait compact
      extends StObject
         with ExpandingCardMode
    /* 0 */ val compact: typings.officeUiFabricReact.libComponentsHoverCardExpandingCardDottypesMod.ExpandingCardMode.compact & Double = js.native
    
    /**
      * To have both top compact and bottom expanded card
      */
    @js.native
    sealed trait expanded
      extends StObject
         with ExpandingCardMode
    /* 1 */ val expanded: typings.officeUiFabricReact.libComponentsHoverCardExpandingCardDottypesMod.ExpandingCardMode.expanded & Double = js.native
  }
  
  trait IExpandingCard extends StObject
  
  trait IExpandingCardProps
    extends StObject
       with IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
    
    /**
      * Height of compact card
      * @defaultvalue 156
      */
    var compactCardHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of expanded card
      * @defaultvalue 384
      */
    var expandedCardHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Use to open the card in expanded format and not wait for the delay
      * @defaultvalue ExpandingCardMode.compact
      */
    var mode: js.UndefOr[ExpandingCardMode] = js.undefined
    
    /**
      *  Render function to populate compact content area
      */
    var onRenderCompactCard: js.UndefOr[IRenderFunction[Any]] = js.undefined
    
    /**
      *  Render function to populate expanded content area
      */
    var onRenderExpandedCard: js.UndefOr[IRenderFunction[Any]] = js.undefined
  }
  object IExpandingCardProps {
    
    inline def apply(): IExpandingCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpandingCardProps]
    }
    
    extension [Self <: IExpandingCardProps](x: Self) {
      
      inline def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
      
      inline def setCompactCardHeightUndefined: Self = StObject.set(x, "compactCardHeight", js.undefined)
      
      inline def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardHeightUndefined: Self = StObject.set(x, "expandedCardHeight", js.undefined)
      
      inline def setMode(value: ExpandingCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnRenderCompactCard(
        value: (/* props */ js.UndefOr[Any], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Any], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderCompactCard", js.Any.fromFunction2(value))
      
      inline def setOnRenderCompactCardUndefined: Self = StObject.set(x, "onRenderCompactCard", js.undefined)
      
      inline def setOnRenderExpandedCard(
        value: (/* props */ js.UndefOr[Any], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Any], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderExpandedCard", js.Any.fromFunction2(value))
      
      inline def setOnRenderExpandedCardUndefined: Self = StObject.set(x, "onRenderExpandedCard", js.undefined)
    }
  }
  
  trait IExpandingCardStyleProps
    extends StObject
       with IBaseCardStyleProps {
    
    /**
      * Height of the compact section of the card.
      */
    var compactCardHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean flag that expanded card is in Expanded.mode === expanded && first frame was rendered.
      */
    var expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of the expanded section of the card.
      */
    var expandedCardHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the content of the expanded card overflows vertically.
      */
    var needsScroll: js.UndefOr[Boolean] = js.undefined
  }
  object IExpandingCardStyleProps {
    
    inline def apply(theme: ITheme): IExpandingCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpandingCardStyleProps]
    }
    
    extension [Self <: IExpandingCardStyleProps](x: Self) {
      
      inline def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
      
      inline def setCompactCardHeightUndefined: Self = StObject.set(x, "compactCardHeight", js.undefined)
      
      inline def setExpandedCardFirstFrameRendered(value: Boolean): Self = StObject.set(x, "expandedCardFirstFrameRendered", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardFirstFrameRenderedUndefined: Self = StObject.set(x, "expandedCardFirstFrameRendered", js.undefined)
      
      inline def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardHeightUndefined: Self = StObject.set(x, "expandedCardHeight", js.undefined)
      
      inline def setNeedsScroll(value: Boolean): Self = StObject.set(x, "needsScroll", value.asInstanceOf[js.Any])
      
      inline def setNeedsScrollUndefined: Self = StObject.set(x, "needsScroll", js.undefined)
    }
  }
  
  trait IExpandingCardStyles
    extends StObject
       with IBaseCardStyles {
    
    /**
      * Style for the main card element.
      */
    var compactCard: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Base Style for the expanded card content.
      */
    var expandedCard: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the expanded card scroll content.
      */
    var expandedCardScroll: js.UndefOr[IStyle] = js.undefined
  }
  object IExpandingCardStyles {
    
    inline def apply(): IExpandingCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpandingCardStyles]
    }
    
    extension [Self <: IExpandingCardStyles](x: Self) {
      
      inline def setCompactCard(value: IStyle): Self = StObject.set(x, "compactCard", value.asInstanceOf[js.Any])
      
      inline def setCompactCardNull: Self = StObject.set(x, "compactCard", null)
      
      inline def setCompactCardUndefined: Self = StObject.set(x, "compactCard", js.undefined)
      
      inline def setExpandedCard(value: IStyle): Self = StObject.set(x, "expandedCard", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardNull: Self = StObject.set(x, "expandedCard", null)
      
      inline def setExpandedCardScroll(value: IStyle): Self = StObject.set(x, "expandedCardScroll", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardScrollNull: Self = StObject.set(x, "expandedCardScroll", null)
      
      inline def setExpandedCardScrollUndefined: Self = StObject.set(x, "expandedCardScroll", js.undefined)
      
      inline def setExpandedCardUndefined: Self = StObject.set(x, "expandedCard", js.undefined)
    }
  }
}
