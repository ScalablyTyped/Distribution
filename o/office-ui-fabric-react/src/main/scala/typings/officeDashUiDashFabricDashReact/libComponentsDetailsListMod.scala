package typings.officeDashUiDashFabricDashReact

import typings.atUifabricUtilities.libSelectionSelectionMod.ISelectionOptions
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowFieldsDotTypesMod.IDetailsRowFieldsProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.change
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
@js.native
object libComponentsDetailsListMod extends js.Object {
  @js.native
  class DetailsColumnBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotBaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @js.native
  class DetailsHeaderBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotBaseMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  
  @js.native
  class DetailsListBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotBaseMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  
  @js.native
  class DetailsRowBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotBaseMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  
  @js.native
  class Selection ()
    extends typings.officeDashUiDashFabricDashReact.libUtilitiesSelectionMod.Selection {
    def this(options: ISelectionOptions) = this()
  }
  
  @js.native
  class SelectionZone protected ()
    extends typings.officeDashUiDashFabricDashReact.libUtilitiesSelectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  
  val DetailsHeader: StatelessComponent[IDetailsHeaderBaseProps] = js.native
  val DetailsList: StatelessComponent[IDetailsListProps] = js.native
  val DetailsRow: StatelessComponent[IDetailsRowBaseProps] = js.native
  val DetailsRowCheck: FunctionComponent[IDetailsRowCheckProps] = js.native
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
    /* 1 */ val always: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.always with Double = js.native
    /* 2 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.hidden with Double = js.native
    /* 0 */ val onHover: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.onHover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility with Double
      ] = js.native
  }
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object ColumnActionsMode extends js.Object {
    /* 1 */ val clickable: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.clickable with Double = js.native
    /* 0 */ val disabled: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.disabled with Double = js.native
    /* 2 */ val hasDropdown: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode with Double
      ] = js.native
  }
  
  @js.native
  object ColumnDragEndLocation extends js.Object {
    /* 2 */ val header: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.header with Double = js.native
    /* 0 */ val outside: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.outside with Double = js.native
    /* 1 */ val surface: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.surface with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation with Double
      ] = js.native
  }
  
  @js.native
  object ConstrainMode extends js.Object {
    /* 1 */ val horizontalConstrained: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    /* 0 */ val unconstrained: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.unconstrained with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object DetailsHeaderBase extends js.Object {
    var defaultProps: Anon_CollapseAllVisibility = js.native
  }
  
  /* static members */
  @js.native
  object DetailsListBase extends js.Object {
    var defaultProps: Anon_CheckboxVisibility = js.native
  }
  
  @js.native
  object DetailsListLayoutMode extends js.Object {
    /* 0 */ val fixedColumns: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    /* 1 */ val justified: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.justified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode with Double
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
    /* 1 */ val hidden: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.hidden with Double = js.native
    /* 0 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.none with Double = js.native
    /* 2 */ val visible: typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection with Double
      ] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    var defaultProps: Anon_IsSelectedOnFocus = js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
}

