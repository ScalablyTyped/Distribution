package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CheckboxVisibility
import typings.officeUiFabricReact.anon.CollapseAllVisibility
import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.anon.RequiredPickIShimmeredDet
import typings.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyles
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderBaseProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyles
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.IDetailsListState
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyles
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckStyles
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.IDetailsRowState
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowBaseProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyleProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyles
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowFieldsDottypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.libComponentsDetailsListShimmeredDetailsListDottypesMod.IShimmeredDetailsListStyles
import typings.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDetailsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CheckboxVisibility")
  @js.native
  object CheckboxVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility & Double
      ] = js.native
    
    /* 1 */ val always: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.always & Double = js.native
    
    /* 2 */ val hidden: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.hidden & Double = js.native
    
    /* 0 */ val onHover: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.onHover & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility & Double
      ] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.hidden & Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnActionsMode")
  @js.native
  object ColumnActionsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode & Double
      ] = js.native
    
    /* 1 */ val clickable: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.clickable & Double = js.native
    
    /* 0 */ val disabled: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.disabled & Double = js.native
    
    /* 2 */ val hasDropdown: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.hasDropdown & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnDragEndLocation")
  @js.native
  object ColumnDragEndLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation & Double
      ] = js.native
    
    /* 2 */ val header: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.header & Double = js.native
    
    /* 0 */ val outside: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.outside & Double = js.native
    
    /* 1 */ val surface: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.surface & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ConstrainMode")
  @js.native
  object ConstrainMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode & Double
      ] = js.native
    
    /* 1 */ val horizontalConstrained: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode.horizontalConstrained & Double = js.native
    
    /* 0 */ val unconstrained: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode.unconstrained & Double = js.native
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
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsColumn")
  @js.native
  val DetailsColumn: FunctionComponent[IDetailsColumnProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsColumnBase")
  @js.native
  open class DetailsColumnBase protected ()
    extends typings.officeUiFabricReact.libComponentsDetailsListDetailsColumnDotbaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeader")
  @js.native
  val DetailsHeader: FunctionComponent[IDetailsHeaderBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeaderBase")
  @js.native
  open class DetailsHeaderBase protected ()
    extends typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDotbaseMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
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
  val DetailsList: FunctionComponent[IDetailsListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase")
  @js.native
  open class DetailsListBase protected ()
    extends typings.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
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
    
    inline def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsListState]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListLayoutMode")
  @js.native
  object DetailsListLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode & Double
      ] = js.native
    
    /* 0 */ val fixedColumns: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode.fixedColumns & Double = js.native
    
    /* 1 */ val justified: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode.justified & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRow")
  @js.native
  val DetailsRow: FunctionComponent[IDetailsRowBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase")
  @js.native
  open class DetailsRowBase protected ()
    extends typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
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
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility & Double
      ] = js.native
    
    /* 1 */ val hidden: typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.hidden & Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.none & Double = js.native
    
    /* 2 */ val visible: typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "Selection")
  @js.native
  open class Selection[TItem] protected ()
    extends typings.officeUiFabricReact.libUtilitiesSelectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: /* import warning: importer.ImportType#apply Failed type conversion: TItem extends @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.types.IObjectWithKey ? [] | [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>] : [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptionsWithRequiredGetKey<TItem>] */ js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection & Double
      ] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode & Double
      ] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.single & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionZone")
  @js.native
  open class SelectionZone protected ()
    extends typings.officeUiFabricReact.libUtilitiesSelectionMod.SelectionZone {
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
    items: js.Array[Any],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumns")(items.asInstanceOf[js.Any], canResizeColumns.asInstanceOf[js.Any], onColumnClick.asInstanceOf[js.Any], sortedColumnKey.asInstanceOf[js.Any], isSortedDescending.asInstanceOf[js.Any], groupedColumnKey.asInstanceOf[js.Any], isMultiline.asInstanceOf[js.Any])).asInstanceOf[js.Array[IColumn]]
  
  inline def getDetailsColumnStyles(props: IDetailsColumnStyleProps): IDetailsColumnStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsColumnStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsColumnStyles]
  
  inline def getDetailsHeaderStyles(props: IDetailsHeaderStyleProps): IDetailsHeaderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsHeaderStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsHeaderStyles]
  
  inline def getDetailsListStyles(props: IDetailsListStyleProps): IDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsListStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsListStyles]
  
  inline def getDetailsRowCheckStyles(props: IDetailsRowCheckStyleProps): IDetailsRowCheckStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsRowCheckStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowCheckStyles]
  
  inline def getDetailsRowStyles(props: IDetailsRowStyleProps): IDetailsRowStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsRowStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowStyles]
  
  inline def getShimmeredDetailsListStyles(props: RequiredPickIShimmeredDet): IShimmeredDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getShimmeredDetailsListStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmeredDetailsListStyles]
}
