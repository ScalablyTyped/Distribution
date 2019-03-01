package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragDragEndDragStart[K, D] extends js.Object {
  var dataTypes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DragRowContext[K, D], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_DataTypesDragDragEndDragStart {
  @scala.inline
  def apply[K, D](
    dataTypes: java.lang.String | js.Array[java.lang.String] = null,
    drag: js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit] = null,
    dragEnd: js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit] = null,
    dragStart: js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DragRowContext[K, D], 
      scala.Unit
    ] = null
  ): Anon_DataTypesDragDragEndDragStart[K, D] = {
    val __obj = js.Dynamic.literal()
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(dragEnd)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    __obj.asInstanceOf[Anon_DataTypesDragDragEndDragStart[K, D]]
  }
}

