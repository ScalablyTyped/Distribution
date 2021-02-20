package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandingCardTypesMod {
  
  @js.native
  sealed trait ExpandingCardMode extends StObject
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.types", "ExpandingCardMode")
  @js.native
  object ExpandingCardMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExpandingCardMode with Double] = js.native
    
    /**
      * To have top compact card only
      */
    @js.native
    sealed trait compact extends ExpandingCardMode
    /* 0 */ val compact: typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.compact with Double = js.native
    
    /**
      * To have both top compact and bottom expanded card
      */
    @js.native
    sealed trait expanded extends ExpandingCardMode
    /* 1 */ val expanded: typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.expanded with Double = js.native
  }
  
  @js.native
  trait IExpandingCard extends StObject
  
  @js.native
  trait IExpandingCardProps extends IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
    
    /**
      * Height of compact card
      * @defaultvalue 156
      */
    var compactCardHeight: js.UndefOr[Double] = js.native
    
    /**
      * Height of expanded card
      * @defaultvalue 384
      */
    var expandedCardHeight: js.UndefOr[Double] = js.native
    
    /**
      * Use to open the card in expanded format and not wait for the delay
      * @defaultvalue ExpandingCardMode.compact
      */
    var mode: js.UndefOr[ExpandingCardMode] = js.native
    
    /**
      *  Render function to populate compact content area
      */
    var onRenderCompactCard: js.UndefOr[IRenderFunction[_]] = js.native
    
    /**
      *  Render function to populate expanded content area
      */
    var onRenderExpandedCard: js.UndefOr[IRenderFunction[_]] = js.native
  }
  object IExpandingCardProps {
    
    @scala.inline
    def apply(): IExpandingCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpandingCardProps]
    }
    
    @scala.inline
    implicit class IExpandingCardPropsMutableBuilder[Self <: IExpandingCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactCardHeightUndefined: Self = StObject.set(x, "compactCardHeight", js.undefined)
      
      @scala.inline
      def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedCardHeightUndefined: Self = StObject.set(x, "expandedCardHeight", js.undefined)
      
      @scala.inline
      def setMode(value: ExpandingCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnRenderCompactCard(
        value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderCompactCard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderCompactCardUndefined: Self = StObject.set(x, "onRenderCompactCard", js.undefined)
      
      @scala.inline
      def setOnRenderExpandedCard(
        value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderExpandedCard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderExpandedCardUndefined: Self = StObject.set(x, "onRenderExpandedCard", js.undefined)
    }
  }
  
  @js.native
  trait IExpandingCardStyleProps extends IBaseCardStyleProps {
    
    /**
      * Height of the compact section of the card.
      */
    var compactCardHeight: js.UndefOr[Double] = js.native
    
    /**
      * Boolean flag that expanded card is in Expanded.mode === expanded && first frame was rendered.
      */
    var expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.native
    
    /**
      * Height of the expanded section of the card.
      */
    var expandedCardHeight: js.UndefOr[Double] = js.native
    
    /**
      * Whether the content of the expanded card overflows vertically.
      */
    var needsScroll: js.UndefOr[Boolean] = js.native
  }
  object IExpandingCardStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IExpandingCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpandingCardStyleProps]
    }
    
    @scala.inline
    implicit class IExpandingCardStylePropsMutableBuilder[Self <: IExpandingCardStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactCardHeightUndefined: Self = StObject.set(x, "compactCardHeight", js.undefined)
      
      @scala.inline
      def setExpandedCardFirstFrameRendered(value: Boolean): Self = StObject.set(x, "expandedCardFirstFrameRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedCardFirstFrameRenderedUndefined: Self = StObject.set(x, "expandedCardFirstFrameRendered", js.undefined)
      
      @scala.inline
      def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedCardHeightUndefined: Self = StObject.set(x, "expandedCardHeight", js.undefined)
      
      @scala.inline
      def setNeedsScroll(value: Boolean): Self = StObject.set(x, "needsScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsScrollUndefined: Self = StObject.set(x, "needsScroll", js.undefined)
    }
  }
  
  @js.native
  trait IExpandingCardStyles extends IBaseCardStyles {
    
    /**
      * Style for the main card element.
      */
    var compactCard: js.UndefOr[IStyle] = js.native
    
    /**
      * Base Style for the expanded card content.
      */
    var expandedCard: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the expanded card scroll content.
      */
    var expandedCardScroll: js.UndefOr[IStyle] = js.native
  }
  object IExpandingCardStyles {
    
    @scala.inline
    def apply(): IExpandingCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpandingCardStyles]
    }
    
    @scala.inline
    implicit class IExpandingCardStylesMutableBuilder[Self <: IExpandingCardStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactCard(value: IStyle): Self = StObject.set(x, "compactCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactCardNull: Self = StObject.set(x, "compactCard", null)
      
      @scala.inline
      def setCompactCardUndefined: Self = StObject.set(x, "compactCard", js.undefined)
      
      @scala.inline
      def setExpandedCard(value: IStyle): Self = StObject.set(x, "expandedCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedCardNull: Self = StObject.set(x, "expandedCard", null)
      
      @scala.inline
      def setExpandedCardScroll(value: IStyle): Self = StObject.set(x, "expandedCardScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedCardScrollNull: Self = StObject.set(x, "expandedCardScroll", null)
      
      @scala.inline
      def setExpandedCardScrollUndefined: Self = StObject.set(x, "expandedCardScroll", js.undefined)
      
      @scala.inline
      def setExpandedCardUndefined: Self = StObject.set(x, "expandedCard", js.undefined)
    }
  }
}
