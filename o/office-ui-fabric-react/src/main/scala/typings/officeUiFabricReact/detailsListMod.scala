package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CheckboxVisibility
import typings.officeUiFabricReact.anon.CollapseAllVisibility
import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typings.officeUiFabricReact.detailsListBaseMod.IDetailsListState
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typings.officeUiFabricReact.detailsRowBaseMod.IDetailsRowState
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CheckboxVisibility")
  @js.native
  object CheckboxVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility with Double] = js.native
    
    /* 1 */ val always: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
    
    /* 2 */ val hidden: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
    
    /* 0 */ val onHover: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnActionsMode")
  @js.native
  object ColumnActionsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode with Double] = js.native
    
    /* 1 */ val clickable: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
    
    /* 0 */ val disabled: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
    
    /* 2 */ val hasDropdown: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ColumnDragEndLocation")
  @js.native
  object ColumnDragEndLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation with Double
      ] = js.native
    
    /* 2 */ val header: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header with Double = js.native
    
    /* 0 */ val outside: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside with Double = js.native
    
    /* 1 */ val surface: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "ConstrainMode")
  @js.native
  object ConstrainMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode with Double] = js.native
    
    /* 1 */ val horizontalConstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    
    /* 0 */ val unconstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
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
    @scala.inline
    def compactRowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DEFAULT_ROW_HEIGHTS.rowHeight")
    @js.native
    def rowHeight: Double = js.native
    @scala.inline
    def rowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsColumnBase")
  @js.native
  class DetailsColumnBase protected ()
    extends typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeader")
  @js.native
  val DetailsHeader: FunctionComponent[IDetailsHeaderBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsHeaderBase")
  @js.native
  class DetailsHeaderBase protected ()
    extends typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase {
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
    @scala.inline
    def defaultProps_=(x: CollapseAllVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsList")
  @js.native
  val DetailsList: FunctionComponent[IDetailsListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase")
  @js.native
  class DetailsListBase protected ()
    extends typings.officeUiFabricReact.detailsListBaseMod.DetailsListBase {
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
    @scala.inline
    def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsListLayoutMode")
  @js.native
  object DetailsListLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode with Double
      ] = js.native
    
    /* 0 */ val fixedColumns: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    
    /* 1 */ val justified: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRow")
  @js.native
  val DetailsRow: FunctionComponent[IDetailsRowBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase")
  @js.native
  class DetailsRowBase protected ()
    extends typings.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = js.native
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
    @scala.inline
    def cellAnimation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cellCheck")
    @js.native
    def cellCheck: String = js.native
    @scala.inline
    def cellCheck_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellCheck")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.cellMeasurer")
    @js.native
    def cellMeasurer: String = js.native
    @scala.inline
    def cellMeasurer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cell")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.check")
    @js.native
    def check: String = js.native
    @scala.inline
    def check_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.compact")
    @js.native
    def compact: String = js.native
    @scala.inline
    def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.fields")
    @js.native
    def fields: String = js.native
    @scala.inline
    def fields_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isCheckVisible")
    @js.native
    def isCheckVisible: String = js.native
    @scala.inline
    def isCheckVisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isContentUnselectable")
    @js.native
    def isContentUnselectable: String = js.native
    @scala.inline
    def isContentUnselectable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContentUnselectable")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isRowHeader")
    @js.native
    def isRowHeader: String = js.native
    @scala.inline
    def isRowHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.isSelected")
    @js.native
    def isSelected: String = js.native
    @scala.inline
    def isSelected_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.listCellFirstChild")
    @js.native
    def listCellFirstChild: String = js.native
    @scala.inline
    def listCellFirstChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listCellFirstChild")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "DetailsRowGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectAllVisibility")
  @js.native
  object SelectAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility with Double
      ] = js.native
    
    /* 1 */ val hidden: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden with Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none with Double = js.native
    
    /* 2 */ val visible: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible with Double = js.native
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
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
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
    @scala.inline
    def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList", "SelectionZone.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "buildColumns")
  @js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList", "getDetailsRowStyles")
  @js.native
  def getDetailsRowStyles(props: IDetailsRowStyleProps): IDetailsRowStyles = js.native
}
