package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnterDragLeaveDragOver extends js.Object {
  var dataTypes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ stdLib.Event, /* param1 */ Anon_Item, scala.Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ stdLib.Event, /* param1 */ Anon_Item, scala.Unit]] = js.undefined
  var dragOver: js.UndefOr[js.Function2[/* param0 */ stdLib.Event, /* param1 */ Anon_Item, scala.Unit]] = js.undefined
  var drop: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.Event, 
      /* param1 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemsDropContext, 
      scala.Unit
    ]
  ] = js.undefined
}

