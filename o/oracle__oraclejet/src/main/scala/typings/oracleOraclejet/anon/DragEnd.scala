package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnd extends js.Object {
  
  var dataTypes: String | js.Array[String] = js.native
  
  def drag(param0: typings.std.Event): Unit = js.native
  
  def dragEnd(param0: typings.std.Event): Unit = js.native
  
  def dragStart(param0: typings.std.Event, param1: js.Object): Unit = js.native
  
  def linkStyle(param0: js.Object): Unit = js.native
  
  var selector: String = js.native
}
object DragEnd {
  
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: typings.std.Event => Unit,
    dragEnd: typings.std.Event => Unit,
    dragStart: (typings.std.Event, js.Object) => Unit,
    linkStyle: js.Object => Unit,
    selector: String
  ): DragEnd = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEnd]
  }
  
  @scala.inline
  implicit class DragEndOps[Self <: DragEnd] (val x: Self) extends AnyVal {
    
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
    def setDrag(value: typings.std.Event => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: typings.std.Event => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: (typings.std.Event, js.Object) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinkStyle(value: js.Object => Unit): Self = this.set("linkStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
}
