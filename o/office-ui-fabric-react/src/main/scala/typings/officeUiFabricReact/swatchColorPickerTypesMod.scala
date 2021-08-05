package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typings.officeUiFabricReact.officeUiFabricReactStrings.circle
import typings.officeUiFabricReact.officeUiFabricReactStrings.square
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchColorPickerTypesMod {
  
  trait ISwatchColorPickerProps extends StObject {
    
    /**
      * Position this grid is in the parent set (index in a parent menu, for example)
      */
    var ariaPosInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the parent set (size of parent menu, for example)
      */
    var ariaSetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the border indicating a hovered/selected cell, in pixels
      * @defaultvalue If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
      */
    var cellBorderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of an individual cell, in pixels
      * @defaultvalue 20
      */
    var cellHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The distance between cells, in pixels
      * @defaultvalue 10
      */
    var cellMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * The shape of the color cells.
      * @default 'circle'
      */
    var cellShape: js.UndefOr[circle | square] = js.undefined
    
    /**
      * Width of an individual cell, in pixels
      * @defaultvalue 20
      */
    var cellWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional class name to provide on the root element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color cells that will be made available to the user.
      *
      * Note: When the reference to this prop changes, regardless of how many color cells change,
      * all of the color cells will be re-rendered (potentially bad perf) because we memoize
      * based on this prop's reference.
      */
    var colorCells: js.Array[IColorCellProps]
    
    /**
      * Number of columns for the swatch color picker
      */
    var columnCount: Double
    
    /**
      * Whether the control is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false (the default), the grid is contained inside a FocusZone.
      * If true, a FocusZone is not used.
      * @default false
      */
    var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to update focus when a cell is hovered.
      * @defaultvalue false
      */
    var focusOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Styles for the grid cells.
      */
    var getColorGridCellStyles: js.UndefOr[
        IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
      ] = js.undefined
    
    /**
      * ID for the swatch color picker's root element. Also used as a prefix for the IDs of color cells.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether the SwatchColorPicker is fully controlled.
      * When true, the component will not set its internal state to track the selected color.
      * Instead, the parent component will be responsible for handling state in the callbacks like
      * `onColorChanged`.
      *
      * NOTE: This property is a temporary workaround to force the component to be fully controllable
      * without breaking existing behavior
      */
    var isControlled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selector to focus on mouse leave. Should only be used in conjunction with `focusOnHover`.
      */
    var mouseLeaveParentSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Callback for when the user focuses a color cell.
      * If `id` and `color` are unspecified, cells are no longer being focused.
      */
    var onCellFocused: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * Callback for when the user hovers over a color cell.
      * If `id` and `color` are unspecified, cells are no longer being hovered.
      */
    var onCellHovered: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * Callback for when the user changes the color.
      * If `id` and `color` are unspecified, there is no selected cell.
      * (e.g. the user executed the currently selected cell to unselect it)
      */
    var onColorChanged: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * Custom render function for the color cell
      */
    var onRenderColorCell: js.UndefOr[IRenderFunction[IColorCellProps]] = js.undefined
    
    /**
      * @deprecated Use `ariaPosInSet`
      */
    var positionInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID of color cell that is currently selected
      */
    var selectedId: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use `ariaSetSize`
      */
    var setSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
      * Only relevant if `doNotContainWithinFocusZone` is not true.
      * @defaultvalue true
      */
    var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]] = js.undefined
    
    /**
      * Theme to apply to the component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ISwatchColorPickerProps {
    
    inline def apply(colorCells: js.Array[IColorCellProps], columnCount: Double): ISwatchColorPickerProps = {
      val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISwatchColorPickerProps]
    }
    
    extension [Self <: ISwatchColorPickerProps](x: Self) {
      
      inline def setAriaPosInSet(value: Double): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      inline def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      inline def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      inline def setCellBorderWidth(value: Double): Self = StObject.set(x, "cellBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setCellBorderWidthUndefined: Self = StObject.set(x, "cellBorderWidth", js.undefined)
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      inline def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      inline def setCellShape(value: circle | square): Self = StObject.set(x, "cellShape", value.asInstanceOf[js.Any])
      
      inline def setCellShapeUndefined: Self = StObject.set(x, "cellShape", js.undefined)
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColorCells(value: js.Array[IColorCellProps]): Self = StObject.set(x, "colorCells", value.asInstanceOf[js.Any])
      
      inline def setColorCellsVarargs(value: IColorCellProps*): Self = StObject.set(x, "colorCells", js.Array(value :_*))
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDoNotContainWithinFocusZone(value: Boolean): Self = StObject.set(x, "doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
      
      inline def setDoNotContainWithinFocusZoneUndefined: Self = StObject.set(x, "doNotContainWithinFocusZone", js.undefined)
      
      inline def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
      
      inline def setFocusOnHoverUndefined: Self = StObject.set(x, "focusOnHover", js.undefined)
      
      inline def setGetColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "getColorGridCellStyles", value.asInstanceOf[js.Any])
      
      inline def setGetColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "getColorGridCellStyles", js.Any.fromFunction1(value))
      
      inline def setGetColorGridCellStylesUndefined: Self = StObject.set(x, "getColorGridCellStyles", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      inline def setIsControlledUndefined: Self = StObject.set(x, "isControlled", js.undefined)
      
      inline def setMouseLeaveParentSelector(value: String): Self = StObject.set(x, "mouseLeaveParentSelector", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveParentSelectorUndefined: Self = StObject.set(x, "mouseLeaveParentSelector", js.undefined)
      
      inline def setOnCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onCellFocused", js.Any.fromFunction2(value))
      
      inline def setOnCellFocusedUndefined: Self = StObject.set(x, "onCellFocused", js.undefined)
      
      inline def setOnCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onCellHovered", js.Any.fromFunction2(value))
      
      inline def setOnCellHoveredUndefined: Self = StObject.set(x, "onCellHovered", js.undefined)
      
      inline def setOnColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onColorChanged", js.Any.fromFunction2(value))
      
      inline def setOnColorChangedUndefined: Self = StObject.set(x, "onColorChanged", js.undefined)
      
      inline def setOnRenderColorCell(
        value: (/* props */ js.UndefOr[IColorCellProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IColorCellProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderColorCell", js.Any.fromFunction2(value))
      
      inline def setOnRenderColorCellUndefined: Self = StObject.set(x, "onRenderColorCell", js.undefined)
      
      inline def setPositionInSet(value: Double): Self = StObject.set(x, "positionInSet", value.asInstanceOf[js.Any])
      
      inline def setPositionInSetUndefined: Self = StObject.set(x, "positionInSet", js.undefined)
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setShouldFocusCircularNavigate(value: Boolean): Self = StObject.set(x, "shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusCircularNavigateUndefined: Self = StObject.set(x, "shouldFocusCircularNavigate", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ISwatchColorPickerStyleProps => DeepPartial[ISwatchColorPickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ISwatchColorPickerStyleProps extends StObject {
    
    /**
      * The distance between cells
      */
    var cellMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom className to apply to the container.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Theme to apply to the container
      */
    var theme: ITheme
  }
  object ISwatchColorPickerStyleProps {
    
    inline def apply(theme: ITheme): ISwatchColorPickerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISwatchColorPickerStyleProps]
    }
    
    extension [Self <: ISwatchColorPickerStyleProps](x: Self) {
      
      inline def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      inline def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISwatchColorPickerStyles extends StObject {
    
    /**
      * Style for the FocusZone container for the grid.
      */
    var focusedContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style applied to the container grid.
      */
    var root: IStyle
    
    /**
      * Style for the table cells of the grid.
      */
    var tableCell: IStyle
  }
  object ISwatchColorPickerStyles {
    
    inline def apply(): ISwatchColorPickerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwatchColorPickerStyles]
    }
    
    extension [Self <: ISwatchColorPickerStyles](x: Self) {
      
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
}
