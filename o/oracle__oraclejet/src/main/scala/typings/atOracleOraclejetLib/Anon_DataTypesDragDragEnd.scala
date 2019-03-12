package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragDragEnd extends js.Object {
  var dataTypes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ stdLib.Event, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ stdLib.Event, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[
    js.Function2[/* param0 */ stdLib.Event, /* param1 */ Anon_ItemsArray, scala.Unit]
  ] = js.undefined
}

object Anon_DataTypesDragDragEnd {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String] = null,
    drag: /* param0 */ stdLib.Event => scala.Unit = null,
    dragEnd: /* param0 */ stdLib.Event => scala.Unit = null,
    dragStart: (/* param0 */ stdLib.Event, /* param1 */ Anon_ItemsArray) => scala.Unit = null
  ): Anon_DataTypesDragDragEnd = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[Anon_DataTypesDragDragEnd]
  }
}

