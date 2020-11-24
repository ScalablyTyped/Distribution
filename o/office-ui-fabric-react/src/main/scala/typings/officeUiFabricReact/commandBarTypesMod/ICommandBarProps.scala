package typings.officeUiFabricReact.commandBarTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.commandBarBaseMod.ICommandBarData
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ICommandBarPropsOps[Self <: ICommandBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: ICommandBarItemProps*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ICommandBarItemProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setButtonAs(value: IComponentAs[IButtonProps]): Self = this.set("buttonAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonAs: Self = this.set("buttonAs", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICommandBar | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ICommandBar]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDataDidRender(value: /* renderedData */ js.Any => Unit): Self = this.set("dataDidRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataDidRender: Self = this.set("dataDidRender", js.undefined)
    
    @scala.inline
    def setFarItemsVarargs(value: ICommandBarItemProps*): Self = this.set("farItems", js.Array(value :_*))
    
    @scala.inline
    def setFarItems(value: js.Array[ICommandBarItemProps]): Self = this.set("farItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFarItems: Self = this.set("farItems", js.undefined)
    
    @scala.inline
    def setOnDataGrown(value: /* movedItem */ ICommandBarItemProps => Unit): Self = this.set("onDataGrown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDataGrown: Self = this.set("onDataGrown", js.undefined)
    
    @scala.inline
    def setOnDataReduced(value: /* movedItem */ ICommandBarItemProps => Unit): Self = this.set("onDataReduced", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDataReduced: Self = this.set("onDataReduced", js.undefined)
    
    @scala.inline
    def setOnGrowData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = this.set("onGrowData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGrowData: Self = this.set("onGrowData", js.undefined)
    
    @scala.inline
    def setOnReduceData(value: /* data */ ICommandBarData => js.UndefOr[ICommandBarData]): Self = this.set("onReduceData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReduceData: Self = this.set("onReduceData", js.undefined)
    
    @scala.inline
    def setOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = this.set("overflowButtonAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButtonAs: Self = this.set("overflowButtonAs", js.undefined)
    
    @scala.inline
    def setOverflowButtonProps(value: IButtonProps): Self = this.set("overflowButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButtonProps: Self = this.set("overflowButtonProps", js.undefined)
    
    @scala.inline
    def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = this.set("overflowItems", js.Array(value :_*))
    
    @scala.inline
    def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = this.set("overflowItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowItems: Self = this.set("overflowItems", js.undefined)
    
    @scala.inline
    def setShiftOnReduce(value: Boolean): Self = this.set("shiftOnReduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftOnReduce: Self = this.set("shiftOnReduce", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ICommandBarStyleProps => DeepPartial[ICommandBarStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
