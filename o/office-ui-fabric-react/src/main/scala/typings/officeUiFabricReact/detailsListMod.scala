package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.change
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.HTMLElement
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
@js.native
object detailsListMod extends js.Object {
  @js.native
  class DetailsColumnBase protected ()
    extends typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @js.native
  class DetailsHeaderBase protected ()
    extends typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  
  @js.native
  class DetailsListBase protected ()
    extends typings.officeUiFabricReact.detailsListBaseMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  
  @js.native
  class DetailsRowBase protected ()
    extends typings.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  
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
  
  @js.native
  class SelectionZone protected ()
    extends typings.officeUiFabricReact.selectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  
  val DetailsHeader: StatelessComponent[IDetailsHeaderBaseProps] = js.native
  val DetailsList: StatelessComponent[IDetailsListProps] = js.native
  val DetailsRow: StatelessComponent[IDetailsRowBaseProps] = js.native
  val DetailsRowCheck: StatelessComponent[IDetailsRowCheckProps] = js.native
  val DetailsRowFields: FunctionComponent[IDetailsRowFieldsProps] = js.native
  val SELECTION_CHANGE: change = js.native
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
  @js.native
  object CheckboxVisibility extends js.Object {
    /* 1 */ val always: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
    /* 2 */ val hidden: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
    /* 0 */ val onHover: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility with Double] = js.native
  }
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object ColumnActionsMode extends js.Object {
    /* 1 */ val clickable: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
    /* 0 */ val disabled: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
    /* 2 */ val hasDropdown: typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode with Double] = js.native
  }
  
  @js.native
  object ColumnDragEndLocation extends js.Object {
    /* 2 */ val header: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header with Double = js.native
    /* 0 */ val outside: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside with Double = js.native
    /* 1 */ val surface: typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation with Double
      ] = js.native
  }
  
  @js.native
  object ConstrainMode extends js.Object {
    /* 1 */ val horizontalConstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    /* 0 */ val unconstrained: typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object DetailsHeaderBase extends js.Object {
    var defaultProps: AnonCollapseAllVisibility = js.native
  }
  
  /* static members */
  @js.native
  object DetailsListBase extends js.Object {
    var defaultProps: AnonCheckboxVisibility = js.native
  }
  
  @js.native
  object DetailsListLayoutMode extends js.Object {
    /* 0 */ val fixedColumns: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    /* 1 */ val justified: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode with Double
      ] = js.native
  }
  
  @js.native
  object DetailsRowGlobalClassNames extends js.Object {
    var cell: String = js.native
    var cellAnimation: String = js.native
    var cellCheck: String = js.native
    var cellMeasurer: String = js.native
    var check: String = js.native
    var compact: String = js.native
    var fields: String = js.native
    var isCheckVisible: String = js.native
    var isContentUnselectable: String = js.native
    var isRowHeader: String = js.native
    var isSelected: String = js.native
    var listCellFirstChild: String = js.native
    var root: String = js.native
  }
  
  @js.native
  object SelectAllVisibility extends js.Object {
    /* 1 */ val hidden: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden with Double = js.native
    /* 0 */ val none: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none with Double = js.native
    /* 2 */ val visible: typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    var defaultProps: AnonIsSelectedOnFocus = js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
}

