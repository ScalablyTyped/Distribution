package typings.officeDashUiDashFabricDashReact.libDetailsListMod

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.change
import typings.react.NativeMouseEvent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/DetailsList", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DetailsHeader: StatelessComponent[IDetailsHeaderBaseProps] = js.native
  val DetailsList: StatelessComponent[IDetailsListProps] = js.native
  val DetailsRow: StatelessComponent[IDetailsRowBaseProps] = js.native
  val DetailsRowCheck: FunctionComponent[IDetailsRowCheckProps] = js.native
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
}

