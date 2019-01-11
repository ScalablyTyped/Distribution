package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[scala.Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[
        /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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

