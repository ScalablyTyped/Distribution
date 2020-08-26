package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragOver extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.native
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  var dragOver: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  var drop: js.UndefOr[
    js.Function2[/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext, Unit]
  ] = js.native
}

object DragOver {
  @scala.inline
  def apply(): DragOver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOver]
  }
  @scala.inline
  implicit class DragOverOps[Self <: DragOver] (val x: Self) extends AnyVal {
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
    def deleteDataTypes: Self = this.set("dataTypes", js.undefined)
    @scala.inline
    def setDragEnter(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = this.set("dragEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragEnter: Self = this.set("dragEnter", js.undefined)
    @scala.inline
    def setDragLeave(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = this.set("dragLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragLeave: Self = this.set("dragLeave", js.undefined)
    @scala.inline
    def setDragOver(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = this.set("dragOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
    @scala.inline
    def setDrop(value: (/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext) => Unit): Self = this.set("drop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
  }
  
}

