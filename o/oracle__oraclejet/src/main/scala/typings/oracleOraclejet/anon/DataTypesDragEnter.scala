package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DropColumnContext
import typings.std.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypesDragEnter extends js.Object {
  var dataTypes: String | js.Array[String] = js.native
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  def drop(param0: DragEvent, param1: DropColumnContext): Unit = js.native
}

object DataTypesDragEnter {
  @scala.inline
  def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropColumnContext) => Unit): DataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DataTypesDragEnter]
  }
  @scala.inline
  implicit class DataTypesDragEnterOps[Self <: DataTypesDragEnter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = this.set("dataTypes", js.Array(value :_*))
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = this.set("dataTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrop(value: (DragEvent, DropColumnContext) => Unit): Self = this.set("drop", js.Any.fromFunction2(value))
    @scala.inline
    def setDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = this.set("dragEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragEnter: Self = this.set("dragEnter", js.undefined)
    @scala.inline
    def setDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = this.set("dragLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragLeave: Self = this.set("dragLeave", js.undefined)
    @scala.inline
    def setDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = this.set("dragOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
  }
  
}

