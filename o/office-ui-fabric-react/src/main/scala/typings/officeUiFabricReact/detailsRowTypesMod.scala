package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.EventName
import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
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

object detailsRowTypesMod {
  
  trait ICellStyleProps extends StObject {
    
    var cellExtraRightPadding: Double
    
    var cellLeftPadding: Double
    
    var cellRightPadding: Double
  }
  object ICellStyleProps {
    
    @scala.inline
    def apply(cellExtraRightPadding: Double, cellLeftPadding: Double, cellRightPadding: Double): ICellStyleProps = {
      val __obj = js.Dynamic.literal(cellExtraRightPadding = cellExtraRightPadding.asInstanceOf[js.Any], cellLeftPadding = cellLeftPadding.asInstanceOf[js.Any], cellRightPadding = cellRightPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellStyleProps]
    }
    
    @scala.inline
    implicit class ICellStylePropsMutableBuilder[Self <: ICellStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellExtraRightPadding(value: Double): Self = StObject.set(x, "cellExtraRightPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellLeftPadding(value: Double): Self = StObject.set(x, "cellLeftPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRightPadding(value: Double): Self = StObject.set(x, "cellRightPadding", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsItemProps extends StObject {
    
    /**
      * Rules for rendering column cells.
      */
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    /**
      * Checkbox visibility
      */
    var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
    
    /**
      * Column metadata
      */
    var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
    
    /**
      * Nesting depth of a grouping
      */
    var groupNestingDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * How much to indent
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum width of the row.
      *
      * @defaultvalue 0
      */
    var rowWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Selection from utilities
      */
    var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
    
    /**
      * Selection mode
      */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    /**
      * View port of the virtualized list
      *
      * @deprecated use rowWidth instead
      */
    var viewport: js.UndefOr[IViewport] = js.undefined
  }
  object IDetailsItemProps {
    
    @scala.inline
    def apply(): IDetailsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsItemProps]
    }
    
    @scala.inline
    implicit class IDetailsItemPropsMutableBuilder[Self <: IDetailsItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      @scala.inline
      def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait IDetailsRow extends StObject
  
  /* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> */
  /* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/Utilities.IBaseProps<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRow> */
  /* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsItemProps */
  trait IDetailsRowBaseProps extends StObject {
    
    /**
      * Rules for rendering column cells.
      */
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    /**
      * Optional pre-rendered content per column. Preferred over onRender or onRenderItemColumn if provided.
      */
    var cellsByColumn: js.UndefOr[StringDictionary[ReactNode]] = js.undefined
    
    /**
      * Check button's aria label
      */
    var checkButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Class name for the checkbox cell
      */
    var checkboxCellClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Checkbox visibility
      */
    var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
    
    /**
      * Overriding class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Collapse all visibility
      */
    var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
    
    /**
      * Column metadata
      */
    var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
    
    /**
      * Whether to render in compact mode
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ref of the component
      */
    var componentRef: js.UndefOr[IRefObject[IDetailsRow]] = js.undefined
    
    /**
      * Handling drag and drop events
      */
    var dragDropEvents: js.UndefOr[IDragDropEvents] = js.undefined
    
    /**
      * Helper for the drag and drop
      */
    var dragDropHelper: js.UndefOr[IDragDropHelper] = js.undefined
    
    /** Whether to animate updates */
    var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of events to register
      */
    var eventsToRegister: js.UndefOr[js.Array[EventName]] = js.undefined
    
    var getCellValueKey: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          String
        ]
      ] = js.undefined
    
    /**
      * Callback for getting the row aria-describedby
      */
    var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
    
    /**
      * Callback for getting the row aria label
      */
    var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
    
    /**
      * Nesting depth of a grouping
      */
    var groupNestingDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * How much to indent
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Data source for this component
      */
    var item: js.Any
    
    /**
      * Index of the collection of items of the DetailsList
      */
    var itemIndex: Double
    
    /**
      * Callback for did mount for parent
      */
    var onDidMount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
    
    /**
      * Callback for rendering a checkbox
      */
    var onRenderCheck: js.UndefOr[js.Function1[/* props */ IDetailsRowCheckProps, Element]] = js.undefined
    
    /**
      * If provided, can be used to render a custom checkbox
      */
    var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
    
    var onRenderItemColumn: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * Callback for will mount for parent
      */
    var onWillUnmount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
    
    /**
      * DOM element into which to render row field
      */
    var rowFieldsAs: js.UndefOr[ComponentType[IDetailsRowFieldsProps]] = js.undefined
    
    /**
      * Minimum width of the row.
      *
      * @defaultvalue 0
      */
    var rowWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Selection from utilities
      */
    var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
    
    /**
      * Selection mode
      */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    /**
      * Overriding styles to this row
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]] = js.undefined
    
    /**
      * Theme provided by styled() function
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
      * @defaultvalue false
      */
    var useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * View port of the virtualized list
      *
      * @deprecated use rowWidth instead
      */
    var viewport: js.UndefOr[IViewport] = js.undefined
  }
  object IDetailsRowBaseProps {
    
    @scala.inline
    def apply(item: js.Any, itemIndex: Double): IDetailsRowBaseProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowBaseProps]
    }
    
    @scala.inline
    implicit class IDetailsRowBasePropsMutableBuilder[Self <: IDetailsRowBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      @scala.inline
      def setCellsByColumn(value: StringDictionary[ReactNode]): Self = StObject.set(x, "cellsByColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsByColumnUndefined: Self = StObject.set(x, "cellsByColumn", js.undefined)
      
      @scala.inline
      def setCheckButtonAriaLabel(value: String): Self = StObject.set(x, "checkButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckButtonAriaLabelUndefined: Self = StObject.set(x, "checkButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
      
      @scala.inline
      def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapseAllVisibility(value: CollapseAllVisibility): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseAllVisibilityUndefined: Self = StObject.set(x, "collapseAllVisibility", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDetailsRow]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDetailsRow | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDragDropEvents(value: IDragDropEvents): Self = StObject.set(x, "dragDropEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDropEventsUndefined: Self = StObject.set(x, "dragDropEvents", js.undefined)
      
      @scala.inline
      def setDragDropHelper(value: IDragDropHelper): Self = StObject.set(x, "dragDropHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDropHelperUndefined: Self = StObject.set(x, "dragDropHelper", js.undefined)
      
      @scala.inline
      def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
      
      @scala.inline
      def setEventsToRegister(value: js.Array[EventName]): Self = StObject.set(x, "eventsToRegister", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsToRegisterUndefined: Self = StObject.set(x, "eventsToRegister", js.undefined)
      
      @scala.inline
      def setEventsToRegisterVarargs(value: EventName*): Self = StObject.set(x, "eventsToRegister", js.Array(value :_*))
      
      @scala.inline
      def setGetCellValueKey(
        value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
      ): Self = StObject.set(x, "getCellValueKey", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetCellValueKeyUndefined: Self = StObject.set(x, "getCellValueKey", js.undefined)
      
      @scala.inline
      def setGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = StObject.set(x, "getRowAriaDescribedBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowAriaDescribedByUndefined: Self = StObject.set(x, "getRowAriaDescribedBy", js.undefined)
      
      @scala.inline
      def setGetRowAriaLabel(value: /* item */ js.Any => String): Self = StObject.set(x, "getRowAriaLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowAriaLabelUndefined: Self = StObject.set(x, "getRowAriaLabel", js.undefined)
      
      @scala.inline
      def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDidMount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = StObject.set(x, "onDidMount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidMountUndefined: Self = StObject.set(x, "onDidMount", js.undefined)
      
      @scala.inline
      def setOnRenderCheck(value: /* props */ IDetailsRowCheckProps => Element): Self = StObject.set(x, "onRenderCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderCheckUndefined: Self = StObject.set(x, "onRenderCheck", js.undefined)
      
      @scala.inline
      def setOnRenderDetailsCheckbox(
        value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDetailsCheckbox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderDetailsCheckboxUndefined: Self = StObject.set(x, "onRenderDetailsCheckbox", js.undefined)
      
      @scala.inline
      def setOnRenderItemColumn(
        value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
      ): Self = StObject.set(x, "onRenderItemColumn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRenderItemColumnUndefined: Self = StObject.set(x, "onRenderItemColumn", js.undefined)
      
      @scala.inline
      def setOnWillUnmount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = StObject.set(x, "onWillUnmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillUnmountUndefined: Self = StObject.set(x, "onWillUnmount", js.undefined)
      
      @scala.inline
      def setRowFieldsAs(value: ComponentType[IDetailsRowFieldsProps]): Self = StObject.set(x, "rowFieldsAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowFieldsAsUndefined: Self = StObject.set(x, "rowFieldsAs", js.undefined)
      
      @scala.inline
      def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDetailsRowStyleProps => DeepPartial[IDetailsRowStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
      
      @scala.inline
      def setUseReducedRowRenderer(value: Boolean): Self = StObject.set(x, "useReducedRowRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseReducedRowRendererUndefined: Self = StObject.set(x, "useReducedRowRenderer", js.undefined)
      
      @scala.inline
      def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait IDetailsRowProps
    extends StObject
       with IDetailsRowBaseProps {
    
    /**
      * Column metadata
      */
    @JSName("columns")
    var columns_IDetailsRowProps: js.Array[IColumn]
    
    /**
      * Selection mode
      */
    @JSName("selectionMode")
    var selectionMode_IDetailsRowProps: SelectionMode
    
    /**
      * Selection from utilities
      */
    @JSName("selection")
    var selection_IDetailsRowProps: ISelection[IObjectWithKey]
  }
  object IDetailsRowProps {
    
    @scala.inline
    def apply(
      columns: js.Array[IColumn],
      item: js.Any,
      itemIndex: Double,
      selection: ISelection[IObjectWithKey],
      selectionMode: SelectionMode
    ): IDetailsRowProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowProps]
    }
    
    @scala.inline
    implicit class IDetailsRowPropsMutableBuilder[Self <: IDetailsRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'theme'>> & {  isSelected :boolean | undefined,   anySelected :boolean | undefined,   canSelect :boolean | undefined,   droppingClassName :string | undefined,   isCheckVisible :boolean | undefined,   isRowHeader :boolean | undefined,   checkboxCellClassName :string | undefined,   className :string | undefined,   compact :boolean | undefined,   cellStyleProps :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps | undefined,   enableUpdateAnimations :boolean | undefined} */
  trait IDetailsRowStyleProps extends StObject {
    
    /** Whether there are any rows in the list selected */
    var anySelected: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this row can be selected */
    var canSelect: js.UndefOr[Boolean] = js.undefined
    
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    /** A class name from the checkbox cell, so proper styling can be targeted */
    var checkboxCellClassName: js.UndefOr[String] = js.undefined
    
    /** CSS class name for the component */
    var className: js.UndefOr[String] = js.undefined
    
    /** Is list in compact mode */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Class name of when this becomes a drop target. */
    var droppingClassName: js.UndefOr[String] = js.undefined
    
    /** Whether to animate updates */
    var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
    
    /** Is the checkbox visible */
    var isCheckVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Is this a row header */
    var isRowHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the row is selected  */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IDetailsRowStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDetailsRowStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowStyleProps]
    }
    
    @scala.inline
    implicit class IDetailsRowStylePropsMutableBuilder[Self <: IDetailsRowStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      @scala.inline
      def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanSelectUndefined: Self = StObject.set(x, "canSelect", js.undefined)
      
      @scala.inline
      def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      @scala.inline
      def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDroppingClassName(value: String): Self = StObject.set(x, "droppingClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppingClassNameUndefined: Self = StObject.set(x, "droppingClassName", js.undefined)
      
      @scala.inline
      def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
      
      @scala.inline
      def setIsCheckVisible(value: Boolean): Self = StObject.set(x, "isCheckVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckVisibleUndefined: Self = StObject.set(x, "isCheckVisible", js.undefined)
      
      @scala.inline
      def setIsRowHeader(value: Boolean): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsRowStyles extends StObject {
    
    var cell: IStyle
    
    var cellAnimation: IStyle
    
    var cellMeasurer: IStyle
    
    var cellPadded: IStyle
    
    var cellUnpadded: IStyle
    
    var check: IStyle
    
    var checkCell: IStyle
    
    var checkCover: IStyle
    
    var fields: IStyle
    
    var isMultiline: IStyle
    
    var isRowHeader: IStyle
    
    var root: IStyle
  }
  object IDetailsRowStyles {
    
    @scala.inline
    def apply(): IDetailsRowStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsRowStyles]
    }
    
    @scala.inline
    implicit class IDetailsRowStylesMutableBuilder[Self <: IDetailsRowStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: IStyle): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellAnimation(value: IStyle): Self = StObject.set(x, "cellAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellAnimationNull: Self = StObject.set(x, "cellAnimation", null)
      
      @scala.inline
      def setCellAnimationUndefined: Self = StObject.set(x, "cellAnimation", js.undefined)
      
      @scala.inline
      def setCellMeasurer(value: IStyle): Self = StObject.set(x, "cellMeasurer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMeasurerNull: Self = StObject.set(x, "cellMeasurer", null)
      
      @scala.inline
      def setCellMeasurerUndefined: Self = StObject.set(x, "cellMeasurer", js.undefined)
      
      @scala.inline
      def setCellNull: Self = StObject.set(x, "cell", null)
      
      @scala.inline
      def setCellPadded(value: IStyle): Self = StObject.set(x, "cellPadded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddedNull: Self = StObject.set(x, "cellPadded", null)
      
      @scala.inline
      def setCellPaddedUndefined: Self = StObject.set(x, "cellPadded", js.undefined)
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellUnpadded(value: IStyle): Self = StObject.set(x, "cellUnpadded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUnpaddedNull: Self = StObject.set(x, "cellUnpadded", null)
      
      @scala.inline
      def setCellUnpaddedUndefined: Self = StObject.set(x, "cellUnpadded", js.undefined)
      
      @scala.inline
      def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCell(value: IStyle): Self = StObject.set(x, "checkCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCellNull: Self = StObject.set(x, "checkCell", null)
      
      @scala.inline
      def setCheckCellUndefined: Self = StObject.set(x, "checkCell", js.undefined)
      
      @scala.inline
      def setCheckCover(value: IStyle): Self = StObject.set(x, "checkCover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCoverNull: Self = StObject.set(x, "checkCover", null)
      
      @scala.inline
      def setCheckCoverUndefined: Self = StObject.set(x, "checkCover", js.undefined)
      
      @scala.inline
      def setCheckNull: Self = StObject.set(x, "check", null)
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setFields(value: IStyle): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setIsMultiline(value: IStyle): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultilineNull: Self = StObject.set(x, "isMultiline", null)
      
      @scala.inline
      def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      @scala.inline
      def setIsRowHeader(value: IStyle): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRowHeaderNull: Self = StObject.set(x, "isRowHeader", null)
      
      @scala.inline
      def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
