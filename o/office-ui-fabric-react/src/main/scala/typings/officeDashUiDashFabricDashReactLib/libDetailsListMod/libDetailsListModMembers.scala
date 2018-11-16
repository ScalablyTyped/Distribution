package typings
package officeDashUiDashFabricDashReactLib.libDetailsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/DetailsList", JSImport.Namespace)
@js.native
object libDetailsListModMembers extends js.Object {
  val DetailsList: js.Function1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  val DetailsRow: js.Function1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  val DetailsRowCheck: js.Function1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  val SELECTION_CHANGE: /* change */ java.lang.String = js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[scala.Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[
        /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
        /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
        _
      ]
    ],
    sortedColumnKey: js.UndefOr[java.lang.String],
    isSortedDescending: js.UndefOr[scala.Boolean],
    groupedColumnKey: js.UndefOr[java.lang.String],
    isMultiline: js.UndefOr[scala.Boolean]
  ): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
  ] = js.native
}

