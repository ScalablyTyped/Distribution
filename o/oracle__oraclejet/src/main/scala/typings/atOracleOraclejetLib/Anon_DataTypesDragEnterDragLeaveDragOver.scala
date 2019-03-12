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

object Anon_DataTypesDragEnterDragLeaveDragOver {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String] = null,
    dragEnter: (/* param0 */ stdLib.Event, /* param1 */ Anon_Item) => scala.Unit = null,
    dragLeave: (/* param0 */ stdLib.Event, /* param1 */ Anon_Item) => scala.Unit = null,
    dragOver: (/* param0 */ stdLib.Event, /* param1 */ Anon_Item) => scala.Unit = null,
    drop: (/* param0 */ stdLib.Event, /* param1 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemsDropContext) => scala.Unit = null
  ): Anon_DataTypesDragEnterDragLeaveDragOver = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    __obj.asInstanceOf[Anon_DataTypesDragEnterDragLeaveDragOver]
  }
}

