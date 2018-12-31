package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnReorderHeaderProps
  extends officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumnReorderOptions {
  /** Callback to notify the column dragEnd event to List
    * Need this to check whether the dragEnd has happened on
    * corresponding list or outside of the list
    */
  var onColumnDragEnd: js.UndefOr[
    js.Function2[
      /* props */ officeDashUiDashFabricDashReactLib.Anon_DropLocation, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
}

