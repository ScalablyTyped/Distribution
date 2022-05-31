package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEnd extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  def drag(param0: typings.std.Event): Unit
  
  def dragEnd(param0: typings.std.Event): Unit
  
  def dragStart(param0: typings.std.Event, param1: js.Object): Unit
  
  def linkStyle(param0: js.Object): Unit
  
  var selector: String
}
object DragEnd {
  
  inline def apply(
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
  
  extension [Self <: DragEnd](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    inline def setDrag(value: typings.std.Event => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragEnd(value: typings.std.Event => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    inline def setDragStart(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    inline def setLinkStyle(value: js.Object => Unit): Self = StObject.set(x, "linkStyle", js.Any.fromFunction1(value))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
