package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.DropLocation
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typings.react.mod.ClassAttributes
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsHeaderTypesMod {
  
  @js.native
  sealed trait SelectAllVisibility extends StObject
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types", "SelectAllVisibility")
  @js.native
  object SelectAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectAllVisibility & Double] = js.native
    
    @js.native
    sealed trait hidden
      extends StObject
         with SelectAllVisibility
    /* 1 */ val hidden: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden & Double = js.native
    
    @js.native
    sealed trait none
      extends StObject
         with SelectAllVisibility
    /* 0 */ val none: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none & Double = js.native
    
    @js.native
    sealed trait visible
      extends StObject
         with SelectAllVisibility
    /* 2 */ val visible: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible & Double = js.native
  }
  
  trait IColumnReorderHeaderProps
    extends StObject
       with IColumnReorderOptions {
    
    /** Callback to notify the column dragEnd event to List
      * Need this to check whether the dragEnd has happened on
      * corresponding list or outside of the list
      */
    var onColumnDragEnd: js.UndefOr[js.Function2[/* props */ DropLocation, /* event */ MouseEvent, Unit]] = js.undefined
  }
  object IColumnReorderHeaderProps {
    
    inline def apply(): IColumnReorderHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnReorderHeaderProps]
    }
    
    extension [Self <: IColumnReorderHeaderProps](x: Self) {
      
      inline def setOnColumnDragEnd(value: (/* props */ DropLocation, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onColumnDragEnd", js.Any.fromFunction2(value))
      
      inline def setOnColumnDragEndUndefined: Self = StObject.set(x, "onColumnDragEnd", js.undefined)
    }
  }
  
  trait IColumnResizeDetails extends StObject {
    
    var columnIndex: Double
    
    var columnMinWidth: Double
    
    var originX: js.UndefOr[Double] = js.undefined
  }
  object IColumnResizeDetails {
    
    inline def apply(columnIndex: Double, columnMinWidth: Double): IColumnResizeDetails = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumnResizeDetails]
    }
    
    extension [Self <: IColumnResizeDetails](x: Self) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    }
  }
  
  trait IDetailsHeader extends StObject {
    
    /** sets focus into the header */
    def focus(): Boolean
  }
  object IDetailsHeader {
    
    inline def apply(focus: () => Boolean): IDetailsHeader = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IDetailsHeader]
    }
    
    extension [Self <: IDetailsHeader](x: Self) {
      
      inline def setFocus(value: () => Boolean): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IDetailsHeaderBaseProps
    extends StObject
       with ClassAttributes[DetailsHeaderBase]
       with IDetailsItemProps {
    
    /** ariaLabel for the entire header */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** ariaLabel for the header checkbox that selects or deselects everything */
    var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.undefined
    
    /** ariaLabel for the selection column */
    var ariaLabelForSelectionColumn: js.UndefOr[String] = js.undefined
    
    /** ariaLabel for expand/collapse group button */
    var ariaLabelForToggleAllGroupsButton: js.UndefOr[String] = js.undefined
    
    /** Overriding class name */
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether to collapse for all visibility */
    var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
    
    /** Column reordering options */
    var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
    
    /** Column reordering options */
    var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.undefined
    
    /** Ref to the component itself */
    var componentRef: js.UndefOr[IRefObject[IDetailsHeader]] = js.undefined
    
    /** Whether or not all is collapsed */
    var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Layout mode - fixedColumns or justified */
    var layoutMode: DetailsListLayoutMode
    
    /** Minimum pixels to be moved before dragging is registered */
    var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
    
    /** Callback for when column is automatically resized */
    var onColumnAutoResized: js.UndefOr[js.Function2[/* column */ IColumn, /* columnIndex */ Double, Unit]] = js.undefined
    
    /** Callback for when the column is clicked */
    var onColumnClick: js.UndefOr[
        js.Function2[
          /* ev */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], 
          /* column */ IColumn, 
          Unit
        ]
      ] = js.undefined
    
    /** Callback for when the column needs to show a context menu */
    var onColumnContextMenu: js.UndefOr[
        js.Function2[
          /* column */ IColumn, 
          /* ev */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    /** Callback for when column sizing has changed */
    var onColumnIsSizingChanged: js.UndefOr[js.Function2[/* column */ IColumn, /* isSizing */ Boolean, Unit]] = js.undefined
    
    /** Callback for when column is resized */
    var onColumnResized: js.UndefOr[
        js.Function3[/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double, Unit]
      ] = js.undefined
    
    /** Callback to render a tooltip for the column header */
    var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.undefined
    
    /** If provided, can be used to render a custom checkbox */
    var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
    
    /** Callback for when collapse all is toggled */
    var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.undefined
    
    /** Select all button visibility */
    var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.undefined
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]] = js.undefined
    
    /** Theme from the Higher Order Component */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.undefined
  }
  object IDetailsHeaderBaseProps {
    
    inline def apply(layoutMode: DetailsListLayoutMode): IDetailsHeaderBaseProps = {
      val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsHeaderBaseProps]
    }
    
    extension [Self <: IDetailsHeaderBaseProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForSelectAllCheckbox(value: String): Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForSelectAllCheckboxUndefined: Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", js.undefined)
      
      inline def setAriaLabelForSelectionColumn(value: String): Self = StObject.set(x, "ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForSelectionColumnUndefined: Self = StObject.set(x, "ariaLabelForSelectionColumn", js.undefined)
      
      inline def setAriaLabelForToggleAllGroupsButton(value: String): Self = StObject.set(x, "ariaLabelForToggleAllGroupsButton", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForToggleAllGroupsButtonUndefined: Self = StObject.set(x, "ariaLabelForToggleAllGroupsButton", js.undefined)
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseAllVisibility(value: CollapseAllVisibility): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
      
      inline def setCollapseAllVisibilityUndefined: Self = StObject.set(x, "collapseAllVisibility", js.undefined)
      
      inline def setColumnReorderOptions(value: IColumnReorderOptions): Self = StObject.set(x, "columnReorderOptions", value.asInstanceOf[js.Any])
      
      inline def setColumnReorderOptionsUndefined: Self = StObject.set(x, "columnReorderOptions", js.undefined)
      
      inline def setColumnReorderProps(value: IColumnReorderHeaderProps): Self = StObject.set(x, "columnReorderProps", value.asInstanceOf[js.Any])
      
      inline def setColumnReorderPropsUndefined: Self = StObject.set(x, "columnReorderProps", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDetailsHeader]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDetailsHeader | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setIsAllCollapsed(value: Boolean): Self = StObject.set(x, "isAllCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsAllCollapsedUndefined: Self = StObject.set(x, "isAllCollapsed", js.undefined)
      
      inline def setLayoutMode(value: DetailsListLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setMinimumPixelsForDrag(value: Double): Self = StObject.set(x, "minimumPixelsForDrag", value.asInstanceOf[js.Any])
      
      inline def setMinimumPixelsForDragUndefined: Self = StObject.set(x, "minimumPixelsForDrag", js.undefined)
      
      inline def setOnColumnAutoResized(value: (/* column */ IColumn, /* columnIndex */ Double) => Unit): Self = StObject.set(x, "onColumnAutoResized", js.Any.fromFunction2(value))
      
      inline def setOnColumnAutoResizedUndefined: Self = StObject.set(x, "onColumnAutoResized", js.undefined)
      
      inline def setOnColumnClick(
        value: (/* ev */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit
      ): Self = StObject.set(x, "onColumnClick", js.Any.fromFunction2(value))
      
      inline def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
      
      inline def setOnColumnContextMenu(
        value: (/* column */ IColumn, /* ev */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onColumnContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnColumnContextMenuUndefined: Self = StObject.set(x, "onColumnContextMenu", js.undefined)
      
      inline def setOnColumnIsSizingChanged(value: (/* column */ IColumn, /* isSizing */ Boolean) => Unit): Self = StObject.set(x, "onColumnIsSizingChanged", js.Any.fromFunction2(value))
      
      inline def setOnColumnIsSizingChangedUndefined: Self = StObject.set(x, "onColumnIsSizingChanged", js.undefined)
      
      inline def setOnColumnResized(value: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit): Self = StObject.set(x, "onColumnResized", js.Any.fromFunction3(value))
      
      inline def setOnColumnResizedUndefined: Self = StObject.set(x, "onColumnResized", js.undefined)
      
      inline def setOnRenderColumnHeaderTooltip(
        value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
              js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
      
      inline def setOnRenderColumnHeaderTooltipUndefined: Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.undefined)
      
      inline def setOnRenderDetailsCheckbox(
        value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDetailsCheckbox", js.Any.fromFunction2(value))
      
      inline def setOnRenderDetailsCheckboxUndefined: Self = StObject.set(x, "onRenderDetailsCheckbox", js.undefined)
      
      inline def setOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = StObject.set(x, "onToggleCollapseAll", js.Any.fromFunction1(value))
      
      inline def setOnToggleCollapseAllUndefined: Self = StObject.set(x, "onToggleCollapseAll", js.undefined)
      
      inline def setSelectAllVisibility(value: SelectAllVisibility): Self = StObject.set(x, "selectAllVisibility", value.asInstanceOf[js.Any])
      
      inline def setSelectAllVisibilityUndefined: Self = StObject.set(x, "selectAllVisibility", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDetailsHeaderStyleProps => DeepPartial[IDetailsHeaderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  trait IDetailsHeaderProps
    extends StObject
       with IDetailsHeaderBaseProps {
    
    /**
      * Column metadata
      */
    @JSName("columns")
    var columns_IDetailsHeaderProps: js.Array[IColumn]
    
    /**
      * Selection mode
      */
    @JSName("selectionMode")
    var selectionMode_IDetailsHeaderProps: SelectionMode
    
    /**
      * Selection from utilities
      */
    @JSName("selection")
    var selection_IDetailsHeaderProps: ISelection[IObjectWithKey]
  }
  object IDetailsHeaderProps {
    
    inline def apply(
      columns: js.Array[IColumn],
      layoutMode: DetailsListLayoutMode,
      selection: ISelection[IObjectWithKey],
      selectionMode: SelectionMode
    ): IDetailsHeaderProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsHeaderProps]
    }
    
    extension [Self <: IDetailsHeaderProps](x: Self) {
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsHeaderState extends StObject {
    
    var columnResizeDetails: js.UndefOr[IColumnResizeDetails] = js.undefined
    
    var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var isAllSelected: js.UndefOr[Boolean] = js.undefined
    
    var isSizing: js.UndefOr[Boolean] = js.undefined
  }
  object IDetailsHeaderState {
    
    inline def apply(): IDetailsHeaderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsHeaderState]
    }
    
    extension [Self <: IDetailsHeaderState](x: Self) {
      
      inline def setColumnResizeDetails(value: IColumnResizeDetails): Self = StObject.set(x, "columnResizeDetails", value.asInstanceOf[js.Any])
      
      inline def setColumnResizeDetailsUndefined: Self = StObject.set(x, "columnResizeDetails", js.undefined)
      
      inline def setIsAllCollapsed(value: Boolean): Self = StObject.set(x, "isAllCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsAllCollapsedUndefined: Self = StObject.set(x, "isAllCollapsed", js.undefined)
      
      inline def setIsAllSelected(value: Boolean): Self = StObject.set(x, "isAllSelected", value.asInstanceOf[js.Any])
      
      inline def setIsAllSelectedUndefined: Self = StObject.set(x, "isAllSelected", js.undefined)
      
      inline def setIsSizing(value: Boolean): Self = StObject.set(x, "isSizing", value.asInstanceOf[js.Any])
      
      inline def setIsSizingUndefined: Self = StObject.set(x, "isSizing", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'className'> & {  isSelectAllHidden :boolean | undefined,   isAllSelected :boolean | undefined,   isResizingColumn :boolean | undefined,   isAllCollapsed :boolean | undefined,   isSizing :boolean | undefined,   isCheckboxHidden :boolean | undefined,   cellStyleProps :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps | undefined} */
  trait IDetailsHeaderStyleProps extends StObject {
    
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Are all columns collapsed */
    var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the "select all" checkbox is checked */
    var isAllSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Whether checkbox is hidden  */
    var isCheckboxHidden: js.UndefOr[Boolean] = js.undefined
    
    /** Is column being resized */
    var isResizingColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to hide select all checkbox */
    var isSelectAllHidden: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the header is sizing */
    var isSizing: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IDetailsHeaderStyleProps {
    
    inline def apply(theme: ITheme): IDetailsHeaderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsHeaderStyleProps]
    }
    
    extension [Self <: IDetailsHeaderStyleProps](x: Self) {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsAllCollapsed(value: Boolean): Self = StObject.set(x, "isAllCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsAllCollapsedUndefined: Self = StObject.set(x, "isAllCollapsed", js.undefined)
      
      inline def setIsAllSelected(value: Boolean): Self = StObject.set(x, "isAllSelected", value.asInstanceOf[js.Any])
      
      inline def setIsAllSelectedUndefined: Self = StObject.set(x, "isAllSelected", js.undefined)
      
      inline def setIsCheckboxHidden(value: Boolean): Self = StObject.set(x, "isCheckboxHidden", value.asInstanceOf[js.Any])
      
      inline def setIsCheckboxHiddenUndefined: Self = StObject.set(x, "isCheckboxHidden", js.undefined)
      
      inline def setIsResizingColumn(value: Boolean): Self = StObject.set(x, "isResizingColumn", value.asInstanceOf[js.Any])
      
      inline def setIsResizingColumnUndefined: Self = StObject.set(x, "isResizingColumn", js.undefined)
      
      inline def setIsSelectAllHidden(value: Boolean): Self = StObject.set(x, "isSelectAllHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSelectAllHiddenUndefined: Self = StObject.set(x, "isSelectAllHidden", js.undefined)
      
      inline def setIsSizing(value: Boolean): Self = StObject.set(x, "isSizing", value.asInstanceOf[js.Any])
      
      inline def setIsSizingUndefined: Self = StObject.set(x, "isSizing", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsHeaderStyles extends StObject {
    
    var accessibleLabel: IStyle
    
    /**
      * @deprecated Not used
      */
    var cellIsActionable: IStyle
    
    var cellIsCheck: IStyle
    
    /**
      * @deprecated Not used
      */
    var cellIsEmpty: IStyle
    
    var cellIsGroupExpander: IStyle
    
    var cellIsResizing: IStyle
    
    var cellSizer: IStyle
    
    var cellSizerEnd: IStyle
    
    var cellSizerStart: IStyle
    
    /**
      * @deprecated Not used
      */
    var cellWrapperPadded: IStyle
    
    var check: IStyle
    
    var checkTooltip: IStyle
    
    var collapseButton: IStyle
    
    var dropHintCaretStyle: IStyle
    
    var dropHintCircleStyle: IStyle
    
    var dropHintLineStyle: IStyle
    
    var dropHintStyle: IStyle
    
    var root: IStyle
    
    var sizingOverlay: IStyle
  }
  object IDetailsHeaderStyles {
    
    inline def apply(): IDetailsHeaderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsHeaderStyles]
    }
    
    extension [Self <: IDetailsHeaderStyles](x: Self) {
      
      inline def setAccessibleLabel(value: IStyle): Self = StObject.set(x, "accessibleLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibleLabelNull: Self = StObject.set(x, "accessibleLabel", null)
      
      inline def setAccessibleLabelUndefined: Self = StObject.set(x, "accessibleLabel", js.undefined)
      
      inline def setCellIsActionable(value: IStyle): Self = StObject.set(x, "cellIsActionable", value.asInstanceOf[js.Any])
      
      inline def setCellIsActionableNull: Self = StObject.set(x, "cellIsActionable", null)
      
      inline def setCellIsActionableUndefined: Self = StObject.set(x, "cellIsActionable", js.undefined)
      
      inline def setCellIsCheck(value: IStyle): Self = StObject.set(x, "cellIsCheck", value.asInstanceOf[js.Any])
      
      inline def setCellIsCheckNull: Self = StObject.set(x, "cellIsCheck", null)
      
      inline def setCellIsCheckUndefined: Self = StObject.set(x, "cellIsCheck", js.undefined)
      
      inline def setCellIsEmpty(value: IStyle): Self = StObject.set(x, "cellIsEmpty", value.asInstanceOf[js.Any])
      
      inline def setCellIsEmptyNull: Self = StObject.set(x, "cellIsEmpty", null)
      
      inline def setCellIsEmptyUndefined: Self = StObject.set(x, "cellIsEmpty", js.undefined)
      
      inline def setCellIsGroupExpander(value: IStyle): Self = StObject.set(x, "cellIsGroupExpander", value.asInstanceOf[js.Any])
      
      inline def setCellIsGroupExpanderNull: Self = StObject.set(x, "cellIsGroupExpander", null)
      
      inline def setCellIsGroupExpanderUndefined: Self = StObject.set(x, "cellIsGroupExpander", js.undefined)
      
      inline def setCellIsResizing(value: IStyle): Self = StObject.set(x, "cellIsResizing", value.asInstanceOf[js.Any])
      
      inline def setCellIsResizingNull: Self = StObject.set(x, "cellIsResizing", null)
      
      inline def setCellIsResizingUndefined: Self = StObject.set(x, "cellIsResizing", js.undefined)
      
      inline def setCellSizer(value: IStyle): Self = StObject.set(x, "cellSizer", value.asInstanceOf[js.Any])
      
      inline def setCellSizerEnd(value: IStyle): Self = StObject.set(x, "cellSizerEnd", value.asInstanceOf[js.Any])
      
      inline def setCellSizerEndNull: Self = StObject.set(x, "cellSizerEnd", null)
      
      inline def setCellSizerEndUndefined: Self = StObject.set(x, "cellSizerEnd", js.undefined)
      
      inline def setCellSizerNull: Self = StObject.set(x, "cellSizer", null)
      
      inline def setCellSizerStart(value: IStyle): Self = StObject.set(x, "cellSizerStart", value.asInstanceOf[js.Any])
      
      inline def setCellSizerStartNull: Self = StObject.set(x, "cellSizerStart", null)
      
      inline def setCellSizerStartUndefined: Self = StObject.set(x, "cellSizerStart", js.undefined)
      
      inline def setCellSizerUndefined: Self = StObject.set(x, "cellSizer", js.undefined)
      
      inline def setCellWrapperPadded(value: IStyle): Self = StObject.set(x, "cellWrapperPadded", value.asInstanceOf[js.Any])
      
      inline def setCellWrapperPaddedNull: Self = StObject.set(x, "cellWrapperPadded", null)
      
      inline def setCellWrapperPaddedUndefined: Self = StObject.set(x, "cellWrapperPadded", js.undefined)
      
      inline def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckNull: Self = StObject.set(x, "check", null)
      
      inline def setCheckTooltip(value: IStyle): Self = StObject.set(x, "checkTooltip", value.asInstanceOf[js.Any])
      
      inline def setCheckTooltipNull: Self = StObject.set(x, "checkTooltip", null)
      
      inline def setCheckTooltipUndefined: Self = StObject.set(x, "checkTooltip", js.undefined)
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCollapseButton(value: IStyle): Self = StObject.set(x, "collapseButton", value.asInstanceOf[js.Any])
      
      inline def setCollapseButtonNull: Self = StObject.set(x, "collapseButton", null)
      
      inline def setCollapseButtonUndefined: Self = StObject.set(x, "collapseButton", js.undefined)
      
      inline def setDropHintCaretStyle(value: IStyle): Self = StObject.set(x, "dropHintCaretStyle", value.asInstanceOf[js.Any])
      
      inline def setDropHintCaretStyleNull: Self = StObject.set(x, "dropHintCaretStyle", null)
      
      inline def setDropHintCaretStyleUndefined: Self = StObject.set(x, "dropHintCaretStyle", js.undefined)
      
      inline def setDropHintCircleStyle(value: IStyle): Self = StObject.set(x, "dropHintCircleStyle", value.asInstanceOf[js.Any])
      
      inline def setDropHintCircleStyleNull: Self = StObject.set(x, "dropHintCircleStyle", null)
      
      inline def setDropHintCircleStyleUndefined: Self = StObject.set(x, "dropHintCircleStyle", js.undefined)
      
      inline def setDropHintLineStyle(value: IStyle): Self = StObject.set(x, "dropHintLineStyle", value.asInstanceOf[js.Any])
      
      inline def setDropHintLineStyleNull: Self = StObject.set(x, "dropHintLineStyle", null)
      
      inline def setDropHintLineStyleUndefined: Self = StObject.set(x, "dropHintLineStyle", js.undefined)
      
      inline def setDropHintStyle(value: IStyle): Self = StObject.set(x, "dropHintStyle", value.asInstanceOf[js.Any])
      
      inline def setDropHintStyleNull: Self = StObject.set(x, "dropHintStyle", null)
      
      inline def setDropHintStyleUndefined: Self = StObject.set(x, "dropHintStyle", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSizingOverlay(value: IStyle): Self = StObject.set(x, "sizingOverlay", value.asInstanceOf[js.Any])
      
      inline def setSizingOverlayNull: Self = StObject.set(x, "sizingOverlay", null)
      
      inline def setSizingOverlayUndefined: Self = StObject.set(x, "sizingOverlay", js.undefined)
    }
  }
  
  trait IDropHintDetails extends StObject {
    
    var dropHintElementRef: HTMLElement
    
    var endX: Double
    
    var originX: Double
    
    var startX: Double
  }
  object IDropHintDetails {
    
    inline def apply(dropHintElementRef: HTMLElement, endX: Double, originX: Double, startX: Double): IDropHintDetails = {
      val __obj = js.Dynamic.literal(dropHintElementRef = dropHintElementRef.asInstanceOf[js.Any], endX = endX.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropHintDetails]
    }
    
    extension [Self <: IDropHintDetails](x: Self) {
      
      inline def setDropHintElementRef(value: HTMLElement): Self = StObject.set(x, "dropHintElementRef", value.asInstanceOf[js.Any])
      
      inline def setEndX(value: Double): Self = StObject.set(x, "endX", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    }
  }
}
