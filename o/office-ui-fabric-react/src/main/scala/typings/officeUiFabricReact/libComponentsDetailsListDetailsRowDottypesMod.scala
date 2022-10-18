package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.EventName
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsCheckboxProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowFieldsDottypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility
import typings.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typings.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDetailsListDetailsRowDottypesMod {
  
  trait ICellStyleProps extends StObject {
    
    var cellExtraRightPadding: Double
    
    var cellLeftPadding: Double
    
    var cellRightPadding: Double
  }
  object ICellStyleProps {
    
    inline def apply(cellExtraRightPadding: Double, cellLeftPadding: Double, cellRightPadding: Double): ICellStyleProps = {
      val __obj = js.Dynamic.literal(cellExtraRightPadding = cellExtraRightPadding.asInstanceOf[js.Any], cellLeftPadding = cellLeftPadding.asInstanceOf[js.Any], cellRightPadding = cellRightPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellStyleProps]
    }
    
    extension [Self <: ICellStyleProps](x: Self) {
      
      inline def setCellExtraRightPadding(value: Double): Self = StObject.set(x, "cellExtraRightPadding", value.asInstanceOf[js.Any])
      
      inline def setCellLeftPadding(value: Double): Self = StObject.set(x, "cellLeftPadding", value.asInstanceOf[js.Any])
      
      inline def setCellRightPadding(value: Double): Self = StObject.set(x, "cellRightPadding", value.asInstanceOf[js.Any])
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
    
    inline def apply(): IDetailsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsItemProps]
    }
    
    extension [Self <: IDetailsItemProps](x: Self) {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
      
      inline def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
      
      inline def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
      
      inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      inline def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
      
      inline def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
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
    
    /** whether or not row should be rendered in disabled state */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
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
    
    /**
      * Offset used to calculate the aria-rowindex value based on itemIndex
      * @defaultvalue 2
      */
    var flatIndexOffset: js.UndefOr[Double] = js.undefined
    
    var getCellValueKey: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          String
        ]
      ] = js.undefined
    
    /**
      * Callback for getting the row aria-describedby
      */
    var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
    
    /**
      * Callback for getting the row aria description
      */
    var getRowAriaDescription: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
    
    /**
      * Callback for getting the row aria label
      */
    var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
    
    /**
      * Nesting depth of a grouping
      */
    var groupNestingDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Id for row
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * How much to indent
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Data source for this component
      */
    var item: Any
    
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
          /* item */ js.UndefOr[Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * Callback for will mount for parent
      */
    var onWillUnmount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
    
    /** Role for the row. */
    var role: js.UndefOr[String] = js.undefined
    
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
    
    inline def apply(item: Any, itemIndex: Double): IDetailsRowBaseProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowBaseProps]
    }
    
    extension [Self <: IDetailsRowBaseProps](x: Self) {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setCellsByColumn(value: StringDictionary[ReactNode]): Self = StObject.set(x, "cellsByColumn", value.asInstanceOf[js.Any])
      
      inline def setCellsByColumnUndefined: Self = StObject.set(x, "cellsByColumn", js.undefined)
      
      inline def setCheckButtonAriaLabel(value: String): Self = StObject.set(x, "checkButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCheckButtonAriaLabelUndefined: Self = StObject.set(x, "checkButtonAriaLabel", js.undefined)
      
      inline def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
      
      inline def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
      
      inline def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseAllVisibility(value: CollapseAllVisibility): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
      
      inline def setCollapseAllVisibilityUndefined: Self = StObject.set(x, "collapseAllVisibility", js.undefined)
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDetailsRow]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDetailsRow | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragDropEvents(value: IDragDropEvents): Self = StObject.set(x, "dragDropEvents", value.asInstanceOf[js.Any])
      
      inline def setDragDropEventsUndefined: Self = StObject.set(x, "dragDropEvents", js.undefined)
      
      inline def setDragDropHelper(value: IDragDropHelper): Self = StObject.set(x, "dragDropHelper", value.asInstanceOf[js.Any])
      
      inline def setDragDropHelperUndefined: Self = StObject.set(x, "dragDropHelper", js.undefined)
      
      inline def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
      
      inline def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
      
      inline def setEventsToRegister(value: js.Array[EventName]): Self = StObject.set(x, "eventsToRegister", value.asInstanceOf[js.Any])
      
      inline def setEventsToRegisterUndefined: Self = StObject.set(x, "eventsToRegister", js.undefined)
      
      inline def setEventsToRegisterVarargs(value: EventName*): Self = StObject.set(x, "eventsToRegister", js.Array(value*))
      
      inline def setFlatIndexOffset(value: Double): Self = StObject.set(x, "flatIndexOffset", value.asInstanceOf[js.Any])
      
      inline def setFlatIndexOffsetUndefined: Self = StObject.set(x, "flatIndexOffset", js.undefined)
      
      inline def setGetCellValueKey(
        value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
      ): Self = StObject.set(x, "getCellValueKey", js.Any.fromFunction3(value))
      
      inline def setGetCellValueKeyUndefined: Self = StObject.set(x, "getCellValueKey", js.undefined)
      
      inline def setGetRowAriaDescribedBy(value: /* item */ Any => String): Self = StObject.set(x, "getRowAriaDescribedBy", js.Any.fromFunction1(value))
      
      inline def setGetRowAriaDescribedByUndefined: Self = StObject.set(x, "getRowAriaDescribedBy", js.undefined)
      
      inline def setGetRowAriaDescription(value: /* item */ Any => String): Self = StObject.set(x, "getRowAriaDescription", js.Any.fromFunction1(value))
      
      inline def setGetRowAriaDescriptionUndefined: Self = StObject.set(x, "getRowAriaDescription", js.undefined)
      
      inline def setGetRowAriaLabel(value: /* item */ Any => String): Self = StObject.set(x, "getRowAriaLabel", js.Any.fromFunction1(value))
      
      inline def setGetRowAriaLabelUndefined: Self = StObject.set(x, "getRowAriaLabel", js.undefined)
      
      inline def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
      
      inline def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setOnDidMount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = StObject.set(x, "onDidMount", js.Any.fromFunction1(value))
      
      inline def setOnDidMountUndefined: Self = StObject.set(x, "onDidMount", js.undefined)
      
      inline def setOnRenderCheck(value: /* props */ IDetailsRowCheckProps => Element): Self = StObject.set(x, "onRenderCheck", js.Any.fromFunction1(value))
      
      inline def setOnRenderCheckUndefined: Self = StObject.set(x, "onRenderCheck", js.undefined)
      
      inline def setOnRenderDetailsCheckbox(
        value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDetailsCheckbox", js.Any.fromFunction2(value))
      
      inline def setOnRenderDetailsCheckboxUndefined: Self = StObject.set(x, "onRenderDetailsCheckbox", js.undefined)
      
      inline def setOnRenderItemColumn(
        value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
      ): Self = StObject.set(x, "onRenderItemColumn", js.Any.fromFunction3(value))
      
      inline def setOnRenderItemColumnUndefined: Self = StObject.set(x, "onRenderItemColumn", js.undefined)
      
      inline def setOnWillUnmount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = StObject.set(x, "onWillUnmount", js.Any.fromFunction1(value))
      
      inline def setOnWillUnmountUndefined: Self = StObject.set(x, "onWillUnmount", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowFieldsAs(value: ComponentType[IDetailsRowFieldsProps]): Self = StObject.set(x, "rowFieldsAs", value.asInstanceOf[js.Any])
      
      inline def setRowFieldsAsUndefined: Self = StObject.set(x, "rowFieldsAs", js.undefined)
      
      inline def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
      
      inline def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDetailsRowStyleProps => DeepPartial[IDetailsRowStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
      
      inline def setUseReducedRowRenderer(value: Boolean): Self = StObject.set(x, "useReducedRowRenderer", value.asInstanceOf[js.Any])
      
      inline def setUseReducedRowRendererUndefined: Self = StObject.set(x, "useReducedRowRenderer", js.undefined)
      
      inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
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
    
    inline def apply(
      columns: js.Array[IColumn],
      item: Any,
      itemIndex: Double,
      selection: ISelection[IObjectWithKey],
      selectionMode: SelectionMode
    ): IDetailsRowProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowProps]
    }
    
    extension [Self <: IDetailsRowProps](x: Self) {
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'disabled'> & {  isSelected :boolean | undefined,   anySelected :boolean | undefined,   canSelect :boolean | undefined,   droppingClassName :string | undefined,   isCheckVisible :boolean | undefined,   isRowHeader :boolean | undefined,   checkboxCellClassName :string | undefined,   className :string | undefined,   compact :boolean | undefined,   cellStyleProps :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps | undefined,   enableUpdateAnimations :boolean | undefined} */
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
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(theme: ITheme): IDetailsRowStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowStyleProps]
    }
    
    extension [Self <: IDetailsRowStyleProps](x: Self) {
      
      inline def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      inline def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      inline def setCanSelectUndefined: Self = StObject.set(x, "canSelect", js.undefined)
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDroppingClassName(value: String): Self = StObject.set(x, "droppingClassName", value.asInstanceOf[js.Any])
      
      inline def setDroppingClassNameUndefined: Self = StObject.set(x, "droppingClassName", js.undefined)
      
      inline def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
      
      inline def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
      
      inline def setIsCheckVisible(value: Boolean): Self = StObject.set(x, "isCheckVisible", value.asInstanceOf[js.Any])
      
      inline def setIsCheckVisibleUndefined: Self = StObject.set(x, "isCheckVisible", js.undefined)
      
      inline def setIsRowHeader(value: Boolean): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
      
      inline def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
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
    
    inline def apply(): IDetailsRowStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsRowStyles]
    }
    
    extension [Self <: IDetailsRowStyles](x: Self) {
      
      inline def setCell(value: IStyle): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellAnimation(value: IStyle): Self = StObject.set(x, "cellAnimation", value.asInstanceOf[js.Any])
      
      inline def setCellAnimationNull: Self = StObject.set(x, "cellAnimation", null)
      
      inline def setCellAnimationUndefined: Self = StObject.set(x, "cellAnimation", js.undefined)
      
      inline def setCellMeasurer(value: IStyle): Self = StObject.set(x, "cellMeasurer", value.asInstanceOf[js.Any])
      
      inline def setCellMeasurerNull: Self = StObject.set(x, "cellMeasurer", null)
      
      inline def setCellMeasurerUndefined: Self = StObject.set(x, "cellMeasurer", js.undefined)
      
      inline def setCellNull: Self = StObject.set(x, "cell", null)
      
      inline def setCellPadded(value: IStyle): Self = StObject.set(x, "cellPadded", value.asInstanceOf[js.Any])
      
      inline def setCellPaddedNull: Self = StObject.set(x, "cellPadded", null)
      
      inline def setCellPaddedUndefined: Self = StObject.set(x, "cellPadded", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellUnpadded(value: IStyle): Self = StObject.set(x, "cellUnpadded", value.asInstanceOf[js.Any])
      
      inline def setCellUnpaddedNull: Self = StObject.set(x, "cellUnpadded", null)
      
      inline def setCellUnpaddedUndefined: Self = StObject.set(x, "cellUnpadded", js.undefined)
      
      inline def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckCell(value: IStyle): Self = StObject.set(x, "checkCell", value.asInstanceOf[js.Any])
      
      inline def setCheckCellNull: Self = StObject.set(x, "checkCell", null)
      
      inline def setCheckCellUndefined: Self = StObject.set(x, "checkCell", js.undefined)
      
      inline def setCheckCover(value: IStyle): Self = StObject.set(x, "checkCover", value.asInstanceOf[js.Any])
      
      inline def setCheckCoverNull: Self = StObject.set(x, "checkCover", null)
      
      inline def setCheckCoverUndefined: Self = StObject.set(x, "checkCover", js.undefined)
      
      inline def setCheckNull: Self = StObject.set(x, "check", null)
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setFields(value: IStyle): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setIsMultiline(value: IStyle): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      inline def setIsMultilineNull: Self = StObject.set(x, "isMultiline", null)
      
      inline def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      inline def setIsRowHeader(value: IStyle): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
      
      inline def setIsRowHeaderNull: Self = StObject.set(x, "isRowHeader", null)
      
      inline def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
