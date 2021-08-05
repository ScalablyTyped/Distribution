package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ItemIndex
import typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsColumnTypesMod {
  
  trait IDetailsColumnProps
    extends StObject
       with ClassAttributes[DetailsColumnBase] {
    
    /**
      * Custom styles for cell rendering.
      */
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    /**
      * The column definition for the component instance.
      */
    var column: IColumn
    
    /**
      * The column index for the component instance.
      */
    var columnIndex: Double
    
    /**
      * A reference to the component instance.
      */
    var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The drag and drop helper for the component instance.
      */
    var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.undefined
    
    /**
      * Whether or not the column can be re-ordered via drag and drop.
      */
    var isDraggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the column has been dropped via drag and drop.
      */
    var isDropped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback fired when click event occurs.
      */
    var onColumnClick: js.UndefOr[
        js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
      ] = js.undefined
    
    /**
      * Callback fired on contextual menu event to provide contextual menu UI.
      */
    var onColumnContextMenu: js.UndefOr[
        js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /**
      * Render function for providing a column header tooltip.
      */
    var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.undefined
    
    /**
      * Parent ID used for accessibility label(s).
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated use `updateDragInfo`
      */
    var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
    
    /**
      * The component styles to respect during render.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.undefined
    
    /**
      * The theme object to respect during render.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Callback on drag and drop event.
      */
    var updateDragInfo: js.UndefOr[
        js.Function2[/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent], Unit]
      ] = js.undefined
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.undefined
  }
  object IDetailsColumnProps {
    
    inline def apply(column: IColumn, columnIndex: Double): IDetailsColumnProps = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsColumnProps]
    }
    
    extension [Self <: IDetailsColumnProps](x: Self) {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: () => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction0(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDragDropHelper(value: IDragDropHelper): Self = StObject.set(x, "dragDropHelper", value.asInstanceOf[js.Any])
      
      inline def setDragDropHelperNull: Self = StObject.set(x, "dragDropHelper", null)
      
      inline def setDragDropHelperUndefined: Self = StObject.set(x, "dragDropHelper", js.undefined)
      
      inline def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      inline def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      inline def setIsDropped(value: Boolean): Self = StObject.set(x, "isDropped", value.asInstanceOf[js.Any])
      
      inline def setIsDroppedUndefined: Self = StObject.set(x, "isDropped", js.undefined)
      
      inline def setOnColumnClick(value: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit): Self = StObject.set(x, "onColumnClick", js.Any.fromFunction2(value))
      
      inline def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
      
      inline def setOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onColumnContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnColumnContextMenuUndefined: Self = StObject.set(x, "onColumnContextMenu", js.undefined)
      
      inline def setOnRenderColumnHeaderTooltip(
        value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
              js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
      
      inline def setOnRenderColumnHeaderTooltipUndefined: Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setSetDraggedItemIndex(value: /* itemIndex */ Double => Unit): Self = StObject.set(x, "setDraggedItemIndex", js.Any.fromFunction1(value))
      
      inline def setSetDraggedItemIndexUndefined: Self = StObject.set(x, "setDraggedItemIndex", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUpdateDragInfo(value: (/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent]) => Unit): Self = StObject.set(x, "updateDragInfo", js.Any.fromFunction2(value))
      
      inline def setUpdateDragInfoUndefined: Self = StObject.set(x, "updateDragInfo", js.undefined)
      
      inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  trait IDetailsColumnRenderTooltipProps
    extends StObject
       with ITooltipHostProps {
    
    /**
      * Information about the column for which the tooltip is being rendered.
      * Use this to format status information about the column, such as its filter or sort state.
      */
    var column: js.UndefOr[IColumn] = js.undefined
  }
  object IDetailsColumnRenderTooltipProps {
    
    inline def apply(): IDetailsColumnRenderTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsColumnRenderTooltipProps]
    }
    
    extension [Self <: IDetailsColumnRenderTooltipProps](x: Self) {
      
      inline def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.types.IDetailsColumnProps, 'theme' | 'cellStyleProps'>> & {  headerClassName :string | undefined,   isActionable :boolean | undefined,   isEmpty :boolean | undefined,   isIconVisible :boolean | undefined,   isPadded :boolean | undefined,   isIconOnly :boolean | undefined,   iconClassName :string | undefined,   transitionDurationDrag :number | undefined,   transitionDurationDrop :number | undefined} */
  trait IDetailsColumnStyleProps extends StObject {
    
    var cellStyleProps: ICellStyleProps
    
    /**
      * Classname to provide for header region.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Classname to provide for the header's icon region.
      */
    var iconClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the column is actionable.
      */
    var isActionable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the column contains contents.
      */
    var isEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the column has icon only content/
      */
    var isIconOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the column has a visible icon.
      */
    var isIconVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the column is padded.
      */
    var isPadded: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
    
    /**
      * CSS transition duration on drag event.
      */
    var transitionDurationDrag: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS transition duration on drop event.
      */
    var transitionDurationDrop: js.UndefOr[Double] = js.undefined
  }
  object IDetailsColumnStyleProps {
    
    inline def apply(cellStyleProps: ICellStyleProps, theme: ITheme): IDetailsColumnStyleProps = {
      val __obj = js.Dynamic.literal(cellStyleProps = cellStyleProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsColumnStyleProps]
    }
    
    extension [Self <: IDetailsColumnStyleProps](x: Self) {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setIsActionable(value: Boolean): Self = StObject.set(x, "isActionable", value.asInstanceOf[js.Any])
      
      inline def setIsActionableUndefined: Self = StObject.set(x, "isActionable", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsIconOnly(value: Boolean): Self = StObject.set(x, "isIconOnly", value.asInstanceOf[js.Any])
      
      inline def setIsIconOnlyUndefined: Self = StObject.set(x, "isIconOnly", js.undefined)
      
      inline def setIsIconVisible(value: Boolean): Self = StObject.set(x, "isIconVisible", value.asInstanceOf[js.Any])
      
      inline def setIsIconVisibleUndefined: Self = StObject.set(x, "isIconVisible", js.undefined)
      
      inline def setIsPadded(value: Boolean): Self = StObject.set(x, "isPadded", value.asInstanceOf[js.Any])
      
      inline def setIsPaddedUndefined: Self = StObject.set(x, "isPadded", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationDrag(value: Double): Self = StObject.set(x, "transitionDurationDrag", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationDragUndefined: Self = StObject.set(x, "transitionDurationDrag", js.undefined)
      
      inline def setTransitionDurationDrop(value: Double): Self = StObject.set(x, "transitionDurationDrop", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationDropUndefined: Self = StObject.set(x, "transitionDurationDrop", js.undefined)
    }
  }
  
  trait IDetailsColumnStyles extends StObject {
    
    /**
      * Styleable label region.
      */
    var accessibleLabel: IStyle
    
    /**
      * Styleable border region after drag & drop.
      */
    var borderAfterDropping: IStyle
    
    /**
      * Styleable border while drag & drop occurs.
      */
    var borderWhileDragging: IStyle
    
    /**
      * Styleable cell name region.
      */
    var cellName: IStyle
    
    /**
      * Styleable cell title region.
      */
    var cellTitle: IStyle
    
    /**
      * Styleable cell tooltip region.
      */
    var cellTooltip: IStyle
    
    /**
      * Styleable filter glyph.
      */
    var filterChevron: IStyle
    
    /**
      * Styleable resize glyph region.
      */
    var gripperBarVerticalStyle: IStyle
    
    /**
      * Styleable icon region.
      */
    var iconClassName: IStyle
    
    /**
      * Styleable margin by icon region.
      */
    var nearIcon: IStyle
    
    /**
      * Transparent no border region after drag & drop to avoid content shift.
      */
    var noBorderAfterDropping: IStyle
    
    /**
      * Transparent no border region while drag & drop occurs to avoid content shift.
      */
    var noBorderWhileDragging: IStyle
    
    /**
      * Styleable root region.
      */
    var root: IStyle
    
    /**
      * Styleable column sort icon region.
      */
    var sortIcon: IStyle
  }
  object IDetailsColumnStyles {
    
    inline def apply(): IDetailsColumnStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsColumnStyles]
    }
    
    extension [Self <: IDetailsColumnStyles](x: Self) {
      
      inline def setAccessibleLabel(value: IStyle): Self = StObject.set(x, "accessibleLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibleLabelNull: Self = StObject.set(x, "accessibleLabel", null)
      
      inline def setAccessibleLabelUndefined: Self = StObject.set(x, "accessibleLabel", js.undefined)
      
      inline def setBorderAfterDropping(value: IStyle): Self = StObject.set(x, "borderAfterDropping", value.asInstanceOf[js.Any])
      
      inline def setBorderAfterDroppingNull: Self = StObject.set(x, "borderAfterDropping", null)
      
      inline def setBorderAfterDroppingUndefined: Self = StObject.set(x, "borderAfterDropping", js.undefined)
      
      inline def setBorderWhileDragging(value: IStyle): Self = StObject.set(x, "borderWhileDragging", value.asInstanceOf[js.Any])
      
      inline def setBorderWhileDraggingNull: Self = StObject.set(x, "borderWhileDragging", null)
      
      inline def setBorderWhileDraggingUndefined: Self = StObject.set(x, "borderWhileDragging", js.undefined)
      
      inline def setCellName(value: IStyle): Self = StObject.set(x, "cellName", value.asInstanceOf[js.Any])
      
      inline def setCellNameNull: Self = StObject.set(x, "cellName", null)
      
      inline def setCellNameUndefined: Self = StObject.set(x, "cellName", js.undefined)
      
      inline def setCellTitle(value: IStyle): Self = StObject.set(x, "cellTitle", value.asInstanceOf[js.Any])
      
      inline def setCellTitleNull: Self = StObject.set(x, "cellTitle", null)
      
      inline def setCellTitleUndefined: Self = StObject.set(x, "cellTitle", js.undefined)
      
      inline def setCellTooltip(value: IStyle): Self = StObject.set(x, "cellTooltip", value.asInstanceOf[js.Any])
      
      inline def setCellTooltipNull: Self = StObject.set(x, "cellTooltip", null)
      
      inline def setCellTooltipUndefined: Self = StObject.set(x, "cellTooltip", js.undefined)
      
      inline def setFilterChevron(value: IStyle): Self = StObject.set(x, "filterChevron", value.asInstanceOf[js.Any])
      
      inline def setFilterChevronNull: Self = StObject.set(x, "filterChevron", null)
      
      inline def setFilterChevronUndefined: Self = StObject.set(x, "filterChevron", js.undefined)
      
      inline def setGripperBarVerticalStyle(value: IStyle): Self = StObject.set(x, "gripperBarVerticalStyle", value.asInstanceOf[js.Any])
      
      inline def setGripperBarVerticalStyleNull: Self = StObject.set(x, "gripperBarVerticalStyle", null)
      
      inline def setGripperBarVerticalStyleUndefined: Self = StObject.set(x, "gripperBarVerticalStyle", js.undefined)
      
      inline def setIconClassName(value: IStyle): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameNull: Self = StObject.set(x, "iconClassName", null)
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setNearIcon(value: IStyle): Self = StObject.set(x, "nearIcon", value.asInstanceOf[js.Any])
      
      inline def setNearIconNull: Self = StObject.set(x, "nearIcon", null)
      
      inline def setNearIconUndefined: Self = StObject.set(x, "nearIcon", js.undefined)
      
      inline def setNoBorderAfterDropping(value: IStyle): Self = StObject.set(x, "noBorderAfterDropping", value.asInstanceOf[js.Any])
      
      inline def setNoBorderAfterDroppingNull: Self = StObject.set(x, "noBorderAfterDropping", null)
      
      inline def setNoBorderAfterDroppingUndefined: Self = StObject.set(x, "noBorderAfterDropping", js.undefined)
      
      inline def setNoBorderWhileDragging(value: IStyle): Self = StObject.set(x, "noBorderWhileDragging", value.asInstanceOf[js.Any])
      
      inline def setNoBorderWhileDraggingNull: Self = StObject.set(x, "noBorderWhileDragging", null)
      
      inline def setNoBorderWhileDraggingUndefined: Self = StObject.set(x, "noBorderWhileDragging", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSortIcon(value: IStyle): Self = StObject.set(x, "sortIcon", value.asInstanceOf[js.Any])
      
      inline def setSortIconNull: Self = StObject.set(x, "sortIcon", null)
      
      inline def setSortIconUndefined: Self = StObject.set(x, "sortIcon", js.undefined)
    }
  }
}
