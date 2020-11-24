package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typings.officeUiFabricReact.officeUiFabricReactStrings.circle
import typings.officeUiFabricReact.officeUiFabricReactStrings.square
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISwatchColorPickerProps extends js.Object {
  
  /**
    * Position this grid is in the parent set (index in a parent menu, for example)
    */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  
  /**
    * Size of the parent set (size of parent menu, for example)
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  
  /**
    * Width of the border indicating a hovered/selected cell, in pixels
    * @defaultvalue If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
    */
  var cellBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Height of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellHeight: js.UndefOr[Double] = js.native
  
  /**
    * The distance between cells, in pixels
    * @defaultvalue 10
    */
  var cellMargin: js.UndefOr[Double] = js.native
  
  /**
    * The shape of the color cells.
    * @default 'circle'
    */
  var cellShape: js.UndefOr[circle | square] = js.native
  
  /**
    * Width of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellWidth: js.UndefOr[Double] = js.native
  
  /**
    * Additional class name to provide on the root element
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The color cells that will be made available to the user.
    *
    * Note: When the reference to this prop changes, regardless of how many color cells change,
    * all of the color cells will be re-rendered (potentially bad perf) because we memoize
    * based on this prop's reference.
    */
  var colorCells: js.Array[IColorCellProps] = js.native
  
  /**
    * Number of columns for the swatch color picker
    */
  var columnCount: Double = js.native
  
  /**
    * Whether the control is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If false (the default), the grid is contained inside a FocusZone.
    * If true, a FocusZone is not used.
    * @default false
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to update focus when a cell is hovered.
    * @defaultvalue false
    */
  var focusOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Styles for the grid cells.
    */
  var getColorGridCellStyles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.native
  
  /**
    * ID for the swatch color picker's root element. Also used as a prefix for the IDs of color cells.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the SwatchColorPicker is fully controlled.
    * When true, the component will not set its internal state to track the selected color.
    * Instead, the parent component will be responsible for handling state in the callbacks like
    * `onColorChanged`.
    *
    * NOTE: This property is a temporary workaround to force the component to be fully controllable
    * without breaking existing behavior
    */
  var isControlled: js.UndefOr[Boolean] = js.native
  
  /**
    * Selector to focus on mouse leave. Should only be used in conjunction with `focusOnHover`.
    */
  var mouseLeaveParentSelector: js.UndefOr[String] = js.native
  
  /**
    * Callback for when the user focuses a color cell.
    * If `id` and `color` are unspecified, cells are no longer being focused.
    */
  var onCellFocused: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  
  /**
    * Callback for when the user hovers over a color cell.
    * If `id` and `color` are unspecified, cells are no longer being hovered.
    */
  var onCellHovered: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  
  /**
    * Callback for when the user changes the color.
    * If `id` and `color` are unspecified, there is no selected cell.
    * (e.g. the user executed the currently selected cell to unselect it)
    */
  var onColorChanged: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  
  /**
    * Custom render function for the color cell
    */
  var onRenderColorCell: js.UndefOr[IRenderFunction[IColorCellProps]] = js.native
  
  /**
    * @deprecated Use `ariaPosInSet`
    */
  var positionInSet: js.UndefOr[Double] = js.native
  
  /**
    * The ID of color cell that is currently selected
    */
  var selectedId: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use `ariaSetSize`
    */
  var setSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
    * Only relevant if `doNotContainWithinFocusZone` is not true.
    * @defaultvalue true
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.native
  
  /**
    * Styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]] = js.native
  
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object ISwatchColorPickerProps {
  
  @scala.inline
  def apply(colorCells: js.Array[IColorCellProps], columnCount: Double): ISwatchColorPickerProps = {
    val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerProps]
  }
  
  @scala.inline
  implicit class ISwatchColorPickerPropsOps[Self <: ISwatchColorPickerProps] (val x: Self) extends AnyVal {
    
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
    def setColorCellsVarargs(value: IColorCellProps*): Self = this.set("colorCells", js.Array(value :_*))
    
    @scala.inline
    def setColorCells(value: js.Array[IColorCellProps]): Self = this.set("colorCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaPosInSet(value: Double): Self = this.set("ariaPosInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaPosInSet: Self = this.set("ariaPosInSet", js.undefined)
    
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    
    @scala.inline
    def setCellBorderWidth(value: Double): Self = this.set("cellBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBorderWidth: Self = this.set("cellBorderWidth", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCellMargin(value: Double): Self = this.set("cellMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellMargin: Self = this.set("cellMargin", js.undefined)
    
    @scala.inline
    def setCellShape(value: circle | square): Self = this.set("cellShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellShape: Self = this.set("cellShape", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDoNotContainWithinFocusZone(value: Boolean): Self = this.set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotContainWithinFocusZone: Self = this.set("doNotContainWithinFocusZone", js.undefined)
    
    @scala.inline
    def setFocusOnHover(value: Boolean): Self = this.set("focusOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnHover: Self = this.set("focusOnHover", js.undefined)
    
    @scala.inline
    def setGetColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = this.set("getColorGridCellStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = this.set("getColorGridCellStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetColorGridCellStyles: Self = this.set("getColorGridCellStyles", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsControlled(value: Boolean): Self = this.set("isControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsControlled: Self = this.set("isControlled", js.undefined)
    
    @scala.inline
    def setMouseLeaveParentSelector(value: String): Self = this.set("mouseLeaveParentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseLeaveParentSelector: Self = this.set("mouseLeaveParentSelector", js.undefined)
    
    @scala.inline
    def setOnCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = this.set("onCellFocused", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellFocused: Self = this.set("onCellFocused", js.undefined)
    
    @scala.inline
    def setOnCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = this.set("onCellHovered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellHovered: Self = this.set("onCellHovered", js.undefined)
    
    @scala.inline
    def setOnColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = this.set("onColorChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColorChanged: Self = this.set("onColorChanged", js.undefined)
    
    @scala.inline
    def setOnRenderColorCell(
      value: (/* props */ js.UndefOr[IColorCellProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IColorCellProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderColorCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderColorCell: Self = this.set("onRenderColorCell", js.undefined)
    
    @scala.inline
    def setPositionInSet(value: Double): Self = this.set("positionInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionInSet: Self = this.set("positionInSet", js.undefined)
    
    @scala.inline
    def setSelectedId(value: String): Self = this.set("selectedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedId: Self = this.set("selectedId", js.undefined)
    
    @scala.inline
    def setSetSize(value: Double): Self = this.set("setSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setShouldFocusCircularNavigate(value: Boolean): Self = this.set("shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusCircularNavigate: Self = this.set("shouldFocusCircularNavigate", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ISwatchColorPickerStyleProps => DeepPartial[ISwatchColorPickerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
