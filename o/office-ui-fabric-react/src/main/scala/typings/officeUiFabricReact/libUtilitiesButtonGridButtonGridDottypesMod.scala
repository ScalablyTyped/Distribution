package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTableElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesButtonGridButtonGridDottypesMod {
  
  trait IButtonGrid extends StObject
  
  trait IButtonGridProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement] {
    
    /**
      * Position this ButtonGrid is in the parent set (index in a parent menu, for example)
      */
    var ariaPosInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the parent set (size of parent menu, for example)
      */
    var ariaSetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of columns.
      */
    var columnCount: Double
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IButtonGrid]] = js.undefined
    
    /**
      * Class name for the FocusZone container for the ButtonGrid.
      * @deprecated Use `styles.focusedContainer` to define styling for the focus zone container
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * If false (the default), the ButtonGrid is contained inside a FocusZone.
      * If true, a FocusZone is not used.
      * @default false
      */
    var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Items to display in a ButtonGrid with the specified number of columns.
      */
    var items: js.Array[Any]
    
    /**
      * Handler for when focus leaves the ButtonGrid.
      */
    @JSName("onBlur")
    var onBlur_IButtonGridProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Custom renderer for the individual items.
      */
    def onRenderItem(item: Any, index: Double): Element
    
    /**
      * @deprecated Use `ariaPosInSet`
      */
    var positionInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use `ariaSetSize`
      */
    var setSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
      * Only relevant if `doNotContainWithinFocusZone` is not true.
      */
    var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]] = js.undefined
    
    /**
      * Theme to apply to the component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IButtonGridProps {
    
    inline def apply(columnCount: Double, items: js.Array[Any], onRenderItem: (Any, Double) => Element): IButtonGridProps = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
      __obj.asInstanceOf[IButtonGridProps]
    }
    
    extension [Self <: IButtonGridProps](x: Self) {
      
      inline def setAriaPosInSet(value: Double): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      inline def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      inline def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: IRefObject[IButtonGrid]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IButtonGrid | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDoNotContainWithinFocusZone(value: Boolean): Self = StObject.set(x, "doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
      
      inline def setDoNotContainWithinFocusZoneUndefined: Self = StObject.set(x, "doNotContainWithinFocusZone", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnRenderItem(value: (Any, Double) => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction2(value))
      
      inline def setPositionInSet(value: Double): Self = StObject.set(x, "positionInSet", value.asInstanceOf[js.Any])
      
      inline def setPositionInSetUndefined: Self = StObject.set(x, "positionInSet", js.undefined)
      
      inline def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setShouldFocusCircularNavigate(value: Boolean): Self = StObject.set(x, "shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusCircularNavigateUndefined: Self = StObject.set(x, "shouldFocusCircularNavigate", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IButtonGridStyleProps => DeepPartial[IButtonGridStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IButtonGridStyleProps extends StObject {
    
    /**
      * Theme to apply to the ButtonGrid.
      */
    var theme: ITheme
  }
  object IButtonGridStyleProps {
    
    inline def apply(theme: ITheme): IButtonGridStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IButtonGridStyleProps]
    }
    
    extension [Self <: IButtonGridStyleProps](x: Self) {
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IButtonGridStyles extends StObject {
    
    /**
      * Style for the FocusZone container for the ButtonGrid.
      */
    var focusedContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the table container of a ButtonGrid.
      */
    var root: IStyle
    
    /**
      * Style for the table cells of the ButtonGrid.
      */
    var tableCell: IStyle
  }
  object IButtonGridStyles {
    
    inline def apply(): IButtonGridStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonGridStyles]
    }
    
    extension [Self <: IButtonGridStyles](x: Self) {
      
      inline def setFocusedContainer(value: IStyle): Self = StObject.set(x, "focusedContainer", value.asInstanceOf[js.Any])
      
      inline def setFocusedContainerNull: Self = StObject.set(x, "focusedContainer", null)
      
      inline def setFocusedContainerUndefined: Self = StObject.set(x, "focusedContainer", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTableCell(value: IStyle): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
      
      inline def setTableCellNull: Self = StObject.set(x, "tableCell", null)
      
      inline def setTableCellUndefined: Self = StObject.set(x, "tableCell", js.undefined)
    }
  }
  
  type IGrid = IButtonGrid
  
  type IGridProps = IButtonGridProps
  
  type IGridStyleProps = IButtonGridStyleProps
  
  type IGridStyles = IButtonGridStyles
}
