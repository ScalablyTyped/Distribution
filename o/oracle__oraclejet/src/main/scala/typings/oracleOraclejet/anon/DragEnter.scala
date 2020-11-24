package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnter extends js.Object {
  
  var dataTypes: String | js.Array[String] = js.native
  
  def dragEnter(param0: typings.std.Event, param1: js.Object): Unit = js.native
  
  def dragLeave(param0: typings.std.Event, param1: js.Object): Unit = js.native
  
  def dragOver(param0: typings.std.Event, param1: js.Object): Unit = js.native
  
  def drop(param0: typings.std.Event, param1: js.Object): Unit = js.native
}
object DragEnter {
  
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (typings.std.Event, js.Object) => Unit,
    dragLeave: (typings.std.Event, js.Object) => Unit,
    dragOver: (typings.std.Event, js.Object) => Unit,
    drop: (typings.std.Event, js.Object) => Unit
  ): DragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragEnter]
  }
  
  @scala.inline
  implicit class DragEnterOps[Self <: DragEnter] (val x: Self) extends AnyVal {
    
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
    def setDragEnter(value: (typings.std.Event, js.Object) => Unit): Self = this.set("dragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragLeave(value: (typings.std.Event, js.Object) => Unit): Self = this.set("dragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragOver(value: (typings.std.Event, js.Object) => Unit): Self = this.set("dragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrop(value: (typings.std.Event, js.Object) => Unit): Self = this.set("drop", js.Any.fromFunction2(value))
  }
}
