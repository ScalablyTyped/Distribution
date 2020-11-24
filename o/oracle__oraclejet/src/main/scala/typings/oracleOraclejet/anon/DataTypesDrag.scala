package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import typings.std.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypesDrag[K, D] extends js.Object {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.native
}
object DataTypesDrag {
  
  @scala.inline
  def apply[K, D](): DataTypesDrag[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypesDrag[K, D]]
  }
  
  @scala.inline
  implicit class DataTypesDragOps[Self <: DataTypesDrag[_, _], K, D] (val x: Self with (DataTypesDrag[K, D])) extends AnyVal {
    
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
    def setDrag(value: /* param0 */ DragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragEnd(value: /* param0 */ DragEvent => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
  }
}
