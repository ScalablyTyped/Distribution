package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSwatchColorPickerColorPickerGridCellDottypesMod {
  
  trait IColorCellProps extends StObject {
    
    /**
      * The CSS-compatible string to describe the color
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Arbitrary unique string associated with this option
      */
    var id: String
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Tooltip and aria label for this item
      */
    var label: js.UndefOr[String] = js.undefined
  }
  object IColorCellProps {
    
    inline def apply(id: String): IColorCellProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorCellProps]
    }
    
    extension [Self <: IColorCellProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait IColorPickerGridCellProps extends StObject {
    
    /**
      * Width of the border that indicates a selected/hovered cell, in pixels.
      * @defaultvalue 2 if `cellWidth` is less than 24; otherwise 4
      */
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * True if this cell should be rendered as a circle, false if it should be a square.
      * @default `true` (render as circle)
      */
    var circle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The CSS-compatible string to describe the color
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this cell should be disabled
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of the cell, in pixels
      * @defaultvalue 20
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Used as a PREFIX for the cell's ID (the cell will not have this literal string as its ID).
      * @deprecated Deprecated due to misleading name. Use `idPrefix` instead.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix for this cell's ID. Will be required in a future version once `id` is removed.
      */
    var idPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Item to render
      */
    var item: IColorCellProps
    
    /**
      * Tooltip and aria label for this item
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Handler for when a color cell is clicked.
      */
    var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
    
    var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.undefined
    
    /**
      * Mouse enter handler. Returns true if the event should be processed, false otherwise.
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Mouse move handler. Returns true if the event should be processed, false otherwise.
      */
    var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Whether this cell is currently selected
      */
    var selected: Boolean
    
    /**
      * Custom styles for the component.
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
      ] = js.undefined
    
    /**
      * The theme object to use for styling.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Width of the cell, in pixels
      * @defaultvalue 20
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IColorPickerGridCellProps {
    
    inline def apply(item: IColorCellProps, selected: Boolean): IColorPickerGridCellProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerGridCellProps]
    }
    
    extension [Self <: IColorPickerGridCellProps](x: Self) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem(value: IColorCellProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: /* item */ IColorCellProps => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* item */ IColorCellProps => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHover(value: /* item */ js.UndefOr[IColorCellProps] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnKeyDown(value: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnWheel(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IColorPickerGridCellStyleProps extends StObject {
    
    /**
      * The width of the border indicating a hovered or selected cell, in pixels.
      */
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the svg color element should be rendered as a circle or not.
      */
    var circle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the component is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height of this cell, in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the color being rendered is white or not. If it is white we show a border around it.
      */
    var isWhite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the cell is currently selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme to apply to the cell.
      */
    var theme: ITheme
    
    /**
      * The width of this cell, in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IColorPickerGridCellStyleProps {
    
    inline def apply(theme: ITheme): IColorPickerGridCellStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerGridCellStyleProps]
    }
    
    extension [Self <: IColorPickerGridCellStyleProps](x: Self) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsWhite(value: Boolean): Self = StObject.set(x, "isWhite", value.asInstanceOf[js.Any])
      
      inline def setIsWhiteUndefined: Self = StObject.set(x, "isWhite", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IColorPickerGridCellStyles extends StObject {
    
    /**
      * Style to apply to a colorCell in the color picker.
      */
    var colorCell: IStyle
    
    /**
      * Style to apply to the svg element that renders the color.
      */
    var svg: IStyle
  }
  object IColorPickerGridCellStyles {
    
    inline def apply(): IColorPickerGridCellStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorPickerGridCellStyles]
    }
    
    extension [Self <: IColorPickerGridCellStyles](x: Self) {
      
      inline def setColorCell(value: IStyle): Self = StObject.set(x, "colorCell", value.asInstanceOf[js.Any])
      
      inline def setColorCellNull: Self = StObject.set(x, "colorCell", null)
      
      inline def setColorCellUndefined: Self = StObject.set(x, "colorCell", js.undefined)
      
      inline def setSvg(value: IStyle): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgNull: Self = StObject.set(x, "svg", null)
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
