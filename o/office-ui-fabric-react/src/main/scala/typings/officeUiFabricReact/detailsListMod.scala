package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CheckboxVisibility
import typings.officeUiFabricReact.anon.CollapseAllVisibility
import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typings.officeUiFabricReact.detailsListBaseMod.IDetailsListState
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowBaseMod.IDetailsRowState
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyles
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CheckboxVisibility")
  @js.native
  object CheckboxVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility & Double] = js.native
    
    /* 1 */ val always: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always & Double = js.native
    
    /* 2 */ val hidden: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden & Double = js.native
    
    /* 0 */ val onHover: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility & Double] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden & Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnActionsMode")
  @js.native
  object ColumnActionsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode & Double] = js.native
    
    /* 1 */ val clickable: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable & Double = js.native
    
    /* 0 */ val disabled: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled & Double = js.native
    
    /* 2 */ val hasDropdown: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnDragEndLocation")
  @js.native
  object ColumnDragEndLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation & Double] = js.native
    
    /* 2 */ val header: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header & Double = js.native
    
    /* 0 */ val outside: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside & Double = js.native
    
    /* 1 */ val surface: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ConstrainMode")
  @js.native
  object ConstrainMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode & Double] = js.native
    
    /* 1 */ val horizontalConstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained & Double = js.native
    
    /* 0 */ val unconstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DEFAULT_CELL_STYLE_PROPS")
  @js.native
  val DEFAULT_CELL_STYLE_PROPS: ICellStyleProps = js.native
  
  object DEFAULT_ROW_HEIGHTS {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DEFAULT_ROW_HEIGHTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DEFAULT_ROW_HEIGHTS.compactRowHeight")
    @js.native
    def compactRowHeight: Double = js.native
    inline def compactRowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DEFAULT_ROW_HEIGHTS.rowHeight")
    @js.native
    def rowHeight: Double = js.native
    inline def rowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsColumnBase")
  @js.native
  class DetailsColumnBase protected ()
    extends typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeader")
  @js.native
  val DetailsHeader: FunctionComponent[typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeaderBase")
  @js.native
  class DetailsHeaderBase protected ()
    extends typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase {
    def this(props: typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps) = this()
  }
  /* static members */
  object DetailsHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeaderBase.defaultProps")
    @js.native
    def defaultProps: CollapseAllVisibility = js.native
    inline def defaultProps_=(x: CollapseAllVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsList")
  @js.native
  val DetailsList: FunctionComponent[typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase")
  @js.native
  class DetailsListBase protected ()
    extends typings.officeUiFabricReact.detailsListBaseMod.DetailsListBase {
    def this(props: typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps) = this()
  }
  /* static members */
  object DetailsListBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase.defaultProps")
    @js.native
    def defaultProps: CheckboxVisibility = js.native
    inline def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(
      nextProps: typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps,
      previousState: IDetailsListState
    ): IDetailsListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsListState]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListLayoutMode")
  @js.native
  object DetailsListLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode & Double] = js.native
    
    /* 0 */ val fixedColumns: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns & Double = js.native
    
    /* 1 */ val justified: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRow")
  @js.native
  val DetailsRow: FunctionComponent[typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase")
  @js.native
  class DetailsRowBase protected ()
    extends typings.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase {
    def this(props: typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps) = this()
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(
      nextProps: typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps,
      previousState: IDetailsRowState
    ): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowCheck")
  @js.native
  val DetailsRowCheck: FunctionComponent[IDetailsRowCheckProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowFields")
  @js.native
  val DetailsRowFields: FunctionComponent[IDetailsRowFieldsProps] = js.native
  
  object DetailsRowGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cell")
    @js.native
    def cell: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cellAnimation")
    @js.native
    def cellAnimation: String = js.native
    inline def cellAnimation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cellCheck")
    @js.native
    def cellCheck: String = js.native
    inline def cellCheck_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellCheck")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cellMeasurer")
    @js.native
    def cellMeasurer: String = js.native
    inline def cellMeasurer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(x.asInstanceOf[js.Any])
    
    inline def cell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cell")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.check")
    @js.native
    def check: String = js.native
    inline def check_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.compact")
    @js.native
    def compact: String = js.native
    inline def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.fields")
    @js.native
    def fields: String = js.native
    inline def fields_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isCheckVisible")
    @js.native
    def isCheckVisible: String = js.native
    inline def isCheckVisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isContentUnselectable")
    @js.native
    def isContentUnselectable: String = js.native
    inline def isContentUnselectable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContentUnselectable")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isRowHeader")
    @js.native
    def isRowHeader: String = js.native
    inline def isRowHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isSelected")
    @js.native
    def isSelected: String = js.native
    inline def isSelected_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.listCellFirstChild")
    @js.native
    def listCellFirstChild: String = js.native
    inline def listCellFirstChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listCellFirstChild")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectAllVisibility")
  @js.native
  object SelectAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility & Double] = js.native
    
    /* 1 */ val hidden: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden & Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none & Double = js.native
    
    /* 2 */ val visible: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "Selection")
  @js.native
  class Selection[TItem] protected ()
    extends typings.officeUiFabricReact.selectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection & Double] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode & Double] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionZone")
  @js.native
  class SelectionZone protected ()
    extends typings.officeUiFabricReact.selectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    inline def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
  
  inline def buildColumns(
    items: js.Array[js.Any],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumns")(items.asInstanceOf[js.Any], canResizeColumns.asInstanceOf[js.Any], onColumnClick.asInstanceOf[js.Any], sortedColumnKey.asInstanceOf[js.Any], isSortedDescending.asInstanceOf[js.Any], groupedColumnKey.asInstanceOf[js.Any], isMultiline.asInstanceOf[js.Any])).asInstanceOf[js.Array[IColumn]]
  
  inline def getDetailsRowStyles(props: IDetailsRowStyleProps): IDetailsRowStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsRowStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowStyles]
  
  trait IDetailsFooterBaseProps
    extends StObject
       with IDetailsItemProps
  object IDetailsFooterBaseProps {
    
    inline def apply(): IDetailsFooterBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsFooterBaseProps]
    }
  }
  
  trait IDetailsHeaderBaseProps
    extends StObject
       with typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
  object IDetailsHeaderBaseProps {
    
    inline def apply(layoutMode: DetailsListLayoutMode): IDetailsHeaderBaseProps = {
      val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsHeaderBaseProps]
    }
  }
  
  trait IDetailsHeaderProps
    extends StObject
       with typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
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
  }
  
  trait IDetailsListProps
    extends StObject
       with typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
  object IDetailsListProps {
    
    inline def apply(items: js.Array[js.Any]): IDetailsListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsListProps]
    }
  }
  
  trait IDetailsRowBaseProps
    extends StObject
       with typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
  object IDetailsRowBaseProps {
    
    inline def apply(item: js.Any, itemIndex: Double): IDetailsRowBaseProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowBaseProps]
    }
  }
  
  trait IDetailsRowProps
    extends StObject
       with typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
  object IDetailsRowProps {
    
    inline def apply(
      columns: js.Array[IColumn],
      item: js.Any,
      itemIndex: Double,
      selection: ISelection[IObjectWithKey],
      selectionMode: SelectionMode
    ): IDetailsRowProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowProps]
    }
  }
}
