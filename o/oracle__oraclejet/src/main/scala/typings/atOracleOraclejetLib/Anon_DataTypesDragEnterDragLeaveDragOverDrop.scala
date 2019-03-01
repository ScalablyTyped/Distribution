package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnterDragLeaveDragOverDrop extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  var dragEnter: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragLeave: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragOver: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ]
  ] = js.undefined
  def drop(param0: stdLib.DragEvent, param1: atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext): scala.Unit
}

object Anon_DataTypesDragEnterDragLeaveDragOverDrop {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    drop: js.Function2[
      stdLib.DragEvent, 
      atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ],
    dragEnter: js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ] = null,
    dragLeave: js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ] = null,
    dragOver: js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropColumnContext, 
      scala.Unit
    ] = null
  ): Anon_DataTypesDragEnterDragLeaveDragOverDrop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("drop")(drop)
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(dragEnter)
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(dragLeave)
    if (dragOver != null) __obj.updateDynamic("dragOver")(dragOver)
    __obj.asInstanceOf[Anon_DataTypesDragEnterDragLeaveDragOverDrop]
  }
}

