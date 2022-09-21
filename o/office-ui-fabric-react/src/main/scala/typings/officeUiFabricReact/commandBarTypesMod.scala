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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarTypesMod {
  
  trait ICommandBar extends StObject {
    
    /**
      * Sets focus to the active command in the list.
      */
    def focus(): Unit
    
    /**
      * Remeasures the available space.
      */
    def remeasure(): Unit
  }
  object ICommandBar {
    
    inline def apply(focus: () => Unit, remeasure: () => Unit): ICommandBar = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), remeasure = js.Any.fromFunction0(remeasure))
      __obj.asInstanceOf[ICommandBar]
    }
    
    extension [Self <: ICommandBar](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setRemeasure(value: () => Unit): Self = StObject.set(x, "remeasure", js.Any.fromFunction0(value))
    }
  }
  
  trait ICommandBarItemProps
    extends StObject
       with IContextualMenuItem {
    
    /**
      * Custom styles for individual button
      */
    var buttonStyles: js.UndefOr[IButtonStyles] = js.undefined
    
    /**
      * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
      * Defaults to `key` value.
      */
    var cacheKey: js.UndefOr[String] = js.undefined
    
    /**
      * Method to override the render of the individual command bar button.
      * Not used when item is rendered in overflow.
      * @defaultvalue CommandBarButton
      */
    var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.undefined
    
    /**
      * Show only an icon for this item, not text.
      * Does not apply if item is in the overflow.
      * @defaultvalue false
      */
    var iconOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Context under which the item is being rendered.
      * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
      */
    var renderedInOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Props for the tooltip when in `iconOnly` mode.
      */
    var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.undefined
  }
  object ICommandBarItemProps {
    
    inline def apply(key: String): ICommandBarItemProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarItemProps]
    }
    
    extension [Self <: ICommandBarItemProps](x: Self) {
      
      inline def setButtonStyles(value: IButtonStyles): Self = StObject.set(x, "buttonStyles", value.asInstanceOf[js.Any])
      
      inline def setButtonStylesUndefined: Self = StObject.set(x, "buttonStyles", js.undefined)
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCommandBarButtonAs(value: IComponentAs[ICommandBarItemProps]): Self = StObject.set(x, "commandBarButtonAs", value.asInstanceOf[js.Any])
      
      inline def setCommandBarButtonAsUndefined: Self = StObject.set(x, "commandBarButtonAs", js.undefined)
      
      inline def setIconOnly(value: Boolean): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
      
      inline def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
      
      inline def setRenderedInOverflow(value: Boolean): Self = StObject.set(x, "renderedInOverflow", value.asInstanceOf[js.Any])
      
      inline def setRenderedInOverflowUndefined: Self = StObject.set(x, "renderedInOverflow", js.undefined)
      
      inline def setTooltipHostProps(value: ITooltipHostProps): Self = StObject.set(x, "tooltipHostProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipHostPropsUndefined: Self = StObject.set(x, "tooltipHostProps", js.undefined)
    }
  }
  
  trait ICommandBarProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Accessibility text to be read by the screen reader when the user's
      * focus enters the command bar. The screen reader will read this text
      * after reading information about the first focusable item in the command bar.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom component for the near and far item buttons. Not used for overflow menu items.
      */
    var buttonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.undefined
    
    /**
      * Optional callback to access the ICommandBar interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ICommandBar]] = js.undefined
    
    /**
      * Function to be called every time data is rendered. It provides the data that was actually rendered.
      * A use case would be adding telemetry when a particular control is shown in an overflow or dropped
      * as a result of `onReduceData`, or to count the number of renders that an implementation of
      * `onReduceData` triggers.
      */
    var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ Any, Unit]] = js.undefined
    
    /**
      * Items to render on the right side (or left, in RTL). ICommandBarItemProps extends IContextualMenuItem.
      */
    var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
    
    /**
      * Items to render. ICommandBarItemProps extends IContextualMenuItem.
      */
    var items: js.Array[ICommandBarItemProps]
    
    /**
      * Callback invoked when data has been grown.
      */
    var onDataGrown: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.undefined
    
    /**
      * Callback invoked when data has been reduced.
      */
    var onDataReduced: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, Unit]] = js.undefined
    
    /**
      * Custom function to grow data if items are too small for the given space.
      * Return `undefined` if no more steps can be taken to avoid infinate loop.
      */
    var onGrowData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.undefined
    
    /**
      * Custom function to reduce data if items do not fit in given space.
      * Return `undefined` if no more steps can be taken to avoid infinate loop.
      */
    var onReduceData: js.UndefOr[js.Function1[/* data */ ICommandBarData, js.UndefOr[ICommandBarData]]] = js.undefined
    
    /**
      * Custom component for the overflow button.
      */
    var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.undefined
    
    /**
      * Props to be passed to overflow button.
      * If `menuProps` are passed through this prop, any items provided will be prepended to any
      * computed overflow items.
      */
    var overflowButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * Default items to have in the overflow menu. ICommandBarItemProps extends IContextualMenuItem.
      */
    var overflowItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
    
    /**
      * When true, items will be 'shifted' off the front of the array when reduced, and unshifted during grow.
      */
    var shiftOnReduce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ICommandBarProps {
    
    inline def apply(items: js.Array[ICommandBarItemProps]): ICommandBarProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarProps]
    }
    
    extension [Self <: ICommandBarProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "buttonAs", value.asInstanceOf[js.Any])
      
      inline def setButtonAsUndefined: Self = StObject.set(x, "buttonAs", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ICommandBar]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ICommandBar | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDataDidRender(value: /* renderedData */ Any => Unit): Self = StObject.set(x, "dataDidRender", js.Any.fromFunction1(value))
      
      inline def setDataDidRenderUndefined: Self = StObject.set(x, "dataDidRender", js.undefined)
      
      inline def setFarItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "farItems", value.asInstanceOf[js.Any])
      
      inline def setFarItemsUndefined: Self = StObject.set(x, "farItems", js.undefined)
      
      inline def setFarItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "farItems", js.Array(value*))
      
      inline def setItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnDataGrown(value: /* movedItem */ ICommandBarItemProps => Unit): Self = StObject.set(x, "onDataGrown", js.Any.fromFunction1(value))
      
      inline def setOnDataGrownUndefined: Self = StObject.set(x, "onDataGrown", js.undefined)
      
      inline def setOnDataReduced(value: /* movedItem */ ICommandBarItemProps => Unit): Self = StObject.set(x, "onDataReduced", js.Any.fromFunction1(value))
      
      inline def setOnDataReducedUndefined: Self = StObject.set(x, "onDataReduced", js.undefined)
      
      inline def setOnGrowData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = StObject.set(x, "onGrowData", js.Any.fromFunction1(value))
      
      inline def setOnGrowDataUndefined: Self = StObject.set(x, "onGrowData", js.undefined)
      
      inline def setOnReduceData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = StObject.set(x, "onReduceData", js.Any.fromFunction1(value))
      
      inline def setOnReduceDataUndefined: Self = StObject.set(x, "onReduceData", js.undefined)
      
      inline def setOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonAsUndefined: Self = StObject.set(x, "overflowButtonAs", js.undefined)
      
      inline def setOverflowButtonProps(value: IButtonProps): Self = StObject.set(x, "overflowButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonPropsUndefined: Self = StObject.set(x, "overflowButtonProps", js.undefined)
      
      inline def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "overflowItems", value.asInstanceOf[js.Any])
      
      inline def setOverflowItemsUndefined: Self = StObject.set(x, "overflowItems", js.undefined)
      
      inline def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "overflowItems", js.Array(value*))
      
      inline def setShiftOnReduce(value: Boolean): Self = StObject.set(x, "shiftOnReduce", value.asInstanceOf[js.Any])
      
      inline def setShiftOnReduceUndefined: Self = StObject.set(x, "shiftOnReduce", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ICommandBarStyleProps => DeepPartial[ICommandBarStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ICommandBarStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object ICommandBarStyleProps {
    
    inline def apply(theme: ITheme): ICommandBarStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarStyleProps]
    }
    
    extension [Self <: ICommandBarStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICommandBarStyles extends StObject {
    
    var primarySet: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
    
    var secondarySet: js.UndefOr[IStyle] = js.undefined
  }
  object ICommandBarStyles {
    
    inline def apply(): ICommandBarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICommandBarStyles]
    }
    
    extension [Self <: ICommandBarStyles](x: Self) {
      
      inline def setPrimarySet(value: IStyle): Self = StObject.set(x, "primarySet", value.asInstanceOf[js.Any])
      
      inline def setPrimarySetNull: Self = StObject.set(x, "primarySet", null)
      
      inline def setPrimarySetUndefined: Self = StObject.set(x, "primarySet", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSecondarySet(value: IStyle): Self = StObject.set(x, "secondarySet", value.asInstanceOf[js.Any])
      
      inline def setSecondarySetNull: Self = StObject.set(x, "secondarySet", null)
      
      inline def setSecondarySetUndefined: Self = StObject.set(x, "secondarySet", js.undefined)
    }
  }
}
