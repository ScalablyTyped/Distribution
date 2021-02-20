package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.commandBarBaseMod.ICommandBarData
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarTypesMod {
  
  @js.native
  trait ICommandBar extends StObject {
    
    /**
      * Sets focus to the active command in the list.
      */
    def focus(): Unit = js.native
    
    /**
      * Remeasures the available space.
      */
    def remeasure(): Unit = js.native
  }
  object ICommandBar {
    
    @scala.inline
    def apply(focus: () => Unit, remeasure: () => Unit): ICommandBar = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), remeasure = js.Any.fromFunction0(remeasure))
      __obj.asInstanceOf[ICommandBar]
    }
    
    @scala.inline
    implicit class ICommandBarMutableBuilder[Self <: ICommandBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemeasure(value: () => Unit): Self = StObject.set(x, "remeasure", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ICommandBarItemProps extends IContextualMenuItem {
    
    /**
      * Custom styles for individual button
      */
    var buttonStyles: js.UndefOr[IButtonStyles] = js.native
    
    /**
      * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
      * Defaults to `key` value.
      */
    var cacheKey: js.UndefOr[String] = js.native
    
    /**
      * Method to override the render of the individual command bar button.
      * Not used when item is rendered in overflow.
      * @defaultvalue CommandBarButton
      */
    var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.native
    
    /**
      * Show only an icon for this item, not text.
      * Does not apply if item is in the overflow.
      * @defaultvalue false
      */
    var iconOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Context under which the item is being rendered.
      * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
      */
    var renderedInOverflow: js.UndefOr[Boolean] = js.native
    
    /**
      * Props for the tooltip when in `iconOnly` mode.
      */
    var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
  }
  object ICommandBarItemProps {
    
    @scala.inline
    def apply(key: String): ICommandBarItemProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarItemProps]
    }
    
    @scala.inline
    implicit class ICommandBarItemPropsMutableBuilder[Self <: ICommandBarItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonStyles(value: IButtonStyles): Self = StObject.set(x, "buttonStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStylesUndefined: Self = StObject.set(x, "buttonStyles", js.undefined)
      
      @scala.inline
      def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      @scala.inline
      def setCommandBarButtonAs(value: IComponentAs[ICommandBarItemProps]): Self = StObject.set(x, "commandBarButtonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandBarButtonAsUndefined: Self = StObject.set(x, "commandBarButtonAs", js.undefined)
      
      @scala.inline
      def setIconOnly(value: Boolean): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
      
      @scala.inline
      def setRenderedInOverflow(value: Boolean): Self = StObject.set(x, "renderedInOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedInOverflowUndefined: Self = StObject.set(x, "renderedInOverflow", js.undefined)
      
      @scala.inline
      def setTooltipHostProps(value: ITooltipHostProps): Self = StObject.set(x, "tooltipHostProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipHostPropsUndefined: Self = StObject.set(x, "tooltipHostProps", js.undefined)
    }
  }
  
  @js.native
  trait ICommandBarProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Accessibility text to be read by the screen reader when the user's
      * focus enters the command bar. The screen reader will read this text
      * after reading information about the first focusable item in the command bar.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Custom component for the near and far item buttons. Not used for overflow menu items.
      */
    var buttonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.native
    
    /**
      * Optional callback to access the ICommandBar interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ICommandBar]] = js.native
    
    /**
      * Function to be called every time data is rendered. It provides the data that was actually rendered.
      * A use case would be adding telemetry when a particular control is shown in an overflow or dropped
      * as a result of `onReduceData`, or to count the number of renders that an implementation of
      * `onReduceData` triggers.
      */
    var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, Unit]] = js.native
    
    /**
      * Items to render on the right side (or left, in RTL). ICommandBarItemProps extends IContextualMenuItem.
      */
    var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
    
    /**
      * Items to render. ICommandBarItemProps extends IContextualMenuItem.
      */
    var items: js.Array[ICommandBarItemProps] = js.native
    
    /**
      * Callback invoked when data has been grown.
      */
    var onDataGrown: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.native
    
    /**
      * Callback invoked when data has been reduced.
      */
    var onDataReduced: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.native
    
    /**
      * Custom function to grow data if items are too small for the given space.
      * Return `undefined` if no more steps can be taken to avoid infinate loop.
      */
    var onGrowData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.native
    
    /**
      * Custom function to reduce data if items do not fit in given space.
      * Return `undefined` if no more steps can be taken to avoid infinate loop.
      */
    var onReduceData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.native
    
    /**
      * Custom component for the overflow button.
      */
    var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.native
    
    /**
      * Props to be passed to overflow button.
      * If `menuProps` are passed through this prop, any items provided will be prepended to any
      * computed overflow items.
      */
    var overflowButtonProps: js.UndefOr[IButtonProps] = js.native
    
    /**
      * Default items to have in the overflow menu. ICommandBarItemProps extends IContextualMenuItem.
      */
    var overflowItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
    
    /**
      * When true, items will be 'shifted' off the front of the array when reduced, and unshifted during grow.
      */
    var shiftOnReduce: js.UndefOr[Boolean] = js.native
    
    /**
      * Customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ICommandBarProps {
    
    @scala.inline
    def apply(items: js.Array[ICommandBarItemProps]): ICommandBarProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarProps]
    }
    
    @scala.inline
    implicit class ICommandBarPropsMutableBuilder[Self <: ICommandBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "buttonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonAsUndefined: Self = StObject.set(x, "buttonAs", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ICommandBar]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ICommandBar | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDataDidRender(value: /* renderedData */ js.Any => Unit): Self = StObject.set(x, "dataDidRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataDidRenderUndefined: Self = StObject.set(x, "dataDidRender", js.undefined)
      
      @scala.inline
      def setFarItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "farItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFarItemsUndefined: Self = StObject.set(x, "farItems", js.undefined)
      
      @scala.inline
      def setFarItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "farItems", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnDataGrown(value: /* movedItem */ ICommandBarItemProps => Unit): Self = StObject.set(x, "onDataGrown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDataGrownUndefined: Self = StObject.set(x, "onDataGrown", js.undefined)
      
      @scala.inline
      def setOnDataReduced(value: /* movedItem */ ICommandBarItemProps => Unit): Self = StObject.set(x, "onDataReduced", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDataReducedUndefined: Self = StObject.set(x, "onDataReduced", js.undefined)
      
      @scala.inline
      def setOnGrowData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = StObject.set(x, "onGrowData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGrowDataUndefined: Self = StObject.set(x, "onGrowData", js.undefined)
      
      @scala.inline
      def setOnReduceData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = StObject.set(x, "onReduceData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReduceDataUndefined: Self = StObject.set(x, "onReduceData", js.undefined)
      
      @scala.inline
      def setOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonAsUndefined: Self = StObject.set(x, "overflowButtonAs", js.undefined)
      
      @scala.inline
      def setOverflowButtonProps(value: IButtonProps): Self = StObject.set(x, "overflowButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonPropsUndefined: Self = StObject.set(x, "overflowButtonProps", js.undefined)
      
      @scala.inline
      def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "overflowItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowItemsUndefined: Self = StObject.set(x, "overflowItems", js.undefined)
      
      @scala.inline
      def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "overflowItems", js.Array(value :_*))
      
      @scala.inline
      def setShiftOnReduce(value: Boolean): Self = StObject.set(x, "shiftOnReduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftOnReduceUndefined: Self = StObject.set(x, "shiftOnReduce", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ICommandBarStyleProps => DeepPartial[ICommandBarStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ICommandBarStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object ICommandBarStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ICommandBarStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarStyleProps]
    }
    
    @scala.inline
    implicit class ICommandBarStylePropsMutableBuilder[Self <: ICommandBarStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICommandBarStyles extends StObject {
    
    var primarySet: js.UndefOr[IStyle] = js.native
    
    var root: js.UndefOr[IStyle] = js.native
    
    var secondarySet: js.UndefOr[IStyle] = js.native
  }
  object ICommandBarStyles {
    
    @scala.inline
    def apply(): ICommandBarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICommandBarStyles]
    }
    
    @scala.inline
    implicit class ICommandBarStylesMutableBuilder[Self <: ICommandBarStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimarySet(value: IStyle): Self = StObject.set(x, "primarySet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimarySetNull: Self = StObject.set(x, "primarySet", null)
      
      @scala.inline
      def setPrimarySetUndefined: Self = StObject.set(x, "primarySet", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSecondarySet(value: IStyle): Self = StObject.set(x, "secondarySet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondarySetNull: Self = StObject.set(x, "secondarySet", null)
      
      @scala.inline
      def setSecondarySetUndefined: Self = StObject.set(x, "secondarySet", js.undefined)
    }
  }
}
