package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTableElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGridTypesMod {
  
  @js.native
  trait IButtonGrid extends StObject
  
  @js.native
  trait IButtonGridProps extends TableHTMLAttributes[HTMLTableElement] {
    
    /**
      * Position this ButtonGrid is in the parent set (index in a parent menu, for example)
      */
    var ariaPosInSet: js.UndefOr[Double] = js.native
    
    /**
      * Size of the parent set (size of parent menu, for example)
      */
    var ariaSetSize: js.UndefOr[Double] = js.native
    
    /**
      * The number of columns.
      */
    var columnCount: Double = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IButtonGrid]] = js.native
    
    /**
      * Class name for the FocusZone container for the ButtonGrid.
      * @deprecated Use `styles.focusedContainer` to define styling for the focus zone container
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * If false (the default), the ButtonGrid is contained inside a FocusZone.
      * If true, a FocusZone is not used.
      * @default false
      */
    var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
    
    /**
      * Items to display in a ButtonGrid with the specified number of columns.
      */
    var items: js.Array[_] = js.native
    
    /**
      * Handler for when focus leaves the ButtonGrid.
      */
    @JSName("onBlur")
    var onBlur_IButtonGridProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Custom renderer for the individual items.
      */
    def onRenderItem(item: js.Any, index: Double): Element = js.native
    
    /**
      * @deprecated Use `ariaPosInSet`
      */
    var positionInSet: js.UndefOr[Double] = js.native
    
    /**
      * @deprecated Use `ariaSetSize`
      */
    var setSize: js.UndefOr[Double] = js.native
    
    /**
      * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
      * Only relevant if `doNotContainWithinFocusZone` is not true.
      */
    var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]] = js.native
    
    /**
      * Theme to apply to the component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IButtonGridProps {
    
    @scala.inline
    def apply(columnCount: Double, items: js.Array[_], onRenderItem: (js.Any, Double) => Element): IButtonGridProps = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
      __obj.asInstanceOf[IButtonGridProps]
    }
    
    @scala.inline
    implicit class IButtonGridPropsMutableBuilder[Self <: IButtonGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaPosInSet(value: Double): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      @scala.inline
      def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRef(value: IRefObject[IButtonGrid]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IButtonGrid | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setDoNotContainWithinFocusZone(value: Boolean): Self = StObject.set(x, "doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotContainWithinFocusZoneUndefined: Self = StObject.set(x, "doNotContainWithinFocusZone", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnRenderItem(value: (js.Any, Double) => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositionInSet(value: Double): Self = StObject.set(x, "positionInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionInSetUndefined: Self = StObject.set(x, "positionInSet", js.undefined)
      
      @scala.inline
      def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setShouldFocusCircularNavigate(value: Boolean): Self = StObject.set(x, "shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusCircularNavigateUndefined: Self = StObject.set(x, "shouldFocusCircularNavigate", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IButtonGridStyleProps => DeepPartial[IButtonGridStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IButtonGridStyleProps extends StObject {
    
    /**
      * Theme to apply to the ButtonGrid.
      */
    var theme: ITheme = js.native
  }
  object IButtonGridStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IButtonGridStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IButtonGridStyleProps]
    }
    
    @scala.inline
    implicit class IButtonGridStylePropsMutableBuilder[Self <: IButtonGridStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IButtonGridStyles extends StObject {
    
    /**
      * Style for the FocusZone container for the ButtonGrid.
      */
    var focusedContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the table container of a ButtonGrid.
      */
    var root: IStyle = js.native
    
    /**
      * Style for the table cells of the ButtonGrid.
      */
    var tableCell: IStyle = js.native
  }
  object IButtonGridStyles {
    
    @scala.inline
    def apply(): IButtonGridStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonGridStyles]
    }
    
    @scala.inline
    implicit class IButtonGridStylesMutableBuilder[Self <: IButtonGridStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusedContainer(value: IStyle): Self = StObject.set(x, "focusedContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedContainerNull: Self = StObject.set(x, "focusedContainer", null)
      
      @scala.inline
      def setFocusedContainerUndefined: Self = StObject.set(x, "focusedContainer", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTableCell(value: IStyle): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCellNull: Self = StObject.set(x, "tableCell", null)
      
      @scala.inline
      def setTableCellUndefined: Self = StObject.set(x, "tableCell", js.undefined)
    }
  }
  
  type IGrid = IButtonGrid
  
  type IGridProps = IButtonGridProps
  
  type IGridStyleProps = IButtonGridStyleProps
  
  type IGridStyles = IButtonGridStyles
}
