package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerGridCellTypesMod {
  
  @js.native
  trait IColorCellProps extends StObject {
    
    /**
      * The CSS-compatible string to describe the color
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Arbitrary unique string associated with this option
      */
    var id: String = js.native
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Tooltip and aria label for this item
      */
    var label: js.UndefOr[String] = js.native
  }
  object IColorCellProps {
    
    @scala.inline
    def apply(id: String): IColorCellProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorCellProps]
    }
    
    @scala.inline
    implicit class IColorCellPropsMutableBuilder[Self <: IColorCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait IColorPickerGridCellProps extends StObject {
    
    /**
      * Width of the border that indicates a selected/hovered cell, in pixels.
      * @defaultvalue 2 if `cellWidth` is less than 24; otherwise 4
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /**
      * True if this cell should be rendered as a circle, false if it should be a square.
      * @default `true` (render as circle)
      */
    var circle: js.UndefOr[Boolean] = js.native
    
    /**
      * The CSS-compatible string to describe the color
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Whether this cell should be disabled
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Height of the cell, in pixels
      * @defaultvalue 20
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Used as a PREFIX for the cell's ID (the cell will not have this literal string as its ID).
      * @deprecated Deprecated due to misleading name. Use `idPrefix` instead.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Prefix for this cell's ID. Will be required in a future version once `id` is removed.
      */
    var idPrefix: js.UndefOr[String] = js.native
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Item to render
      */
    var item: IColorCellProps = js.native
    
    /**
      * Tooltip and aria label for this item
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Handler for when a color cell is clicked.
      */
    var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.native
    
    var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.native
    
    /**
      * Mouse enter handler. Returns true if the event should be processed, false otherwise.
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
    
    /**
      * Mouse move handler. Returns true if the event should be processed, false otherwise.
      */
    var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
    
    var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
    
    /**
      * Whether this cell is currently selected
      */
    var selected: Boolean = js.native
    
    /**
      * Custom styles for the component.
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
      ] = js.native
    
    /**
      * The theme object to use for styling.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Width of the cell, in pixels
      * @defaultvalue 20
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IColorPickerGridCellProps {
    
    @scala.inline
    def apply(item: IColorCellProps, selected: Boolean): IColorPickerGridCellProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerGridCellProps]
    }
    
    @scala.inline
    implicit class IColorPickerGridCellPropsMutableBuilder[Self <: IColorPickerGridCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItem(value: IColorCellProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* item */ IColorCellProps => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* item */ IColorCellProps => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* item */ js.UndefOr[IColorCellProps] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IColorPickerGridCellStyleProps extends StObject {
    
    /**
      * The width of the border indicating a hovered or selected cell, in pixels.
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /**
      * Whether the svg color element should be rendered as a circle or not.
      */
    var circle: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The height of this cell, in pixels.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Whether the color being rendered is white or not. If it is white we show a border around it.
      */
    var isWhite: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the cell is currently selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.native
    
    /**
      * Theme to apply to the cell.
      */
    var theme: ITheme = js.native
    
    /**
      * The width of this cell, in pixels.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IColorPickerGridCellStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IColorPickerGridCellStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerGridCellStyleProps]
    }
    
    @scala.inline
    implicit class IColorPickerGridCellStylePropsMutableBuilder[Self <: IColorPickerGridCellStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsWhite(value: Boolean): Self = StObject.set(x, "isWhite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWhiteUndefined: Self = StObject.set(x, "isWhite", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IColorPickerGridCellStyles extends StObject {
    
    /**
      * Style to apply to a colorCell in the color picker.
      */
    var colorCell: IStyle = js.native
    
    /**
      * Style to apply to the svg element that renders the color.
      */
    var svg: IStyle = js.native
  }
  object IColorPickerGridCellStyles {
    
    @scala.inline
    def apply(): IColorPickerGridCellStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorPickerGridCellStyles]
    }
    
    @scala.inline
    implicit class IColorPickerGridCellStylesMutableBuilder[Self <: IColorPickerGridCellStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorCell(value: IStyle): Self = StObject.set(x, "colorCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCellNull: Self = StObject.set(x, "colorCell", null)
      
      @scala.inline
      def setColorCellUndefined: Self = StObject.set(x, "colorCell", js.undefined)
      
      @scala.inline
      def setSvg(value: IStyle): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgNull: Self = StObject.set(x, "svg", null)
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
