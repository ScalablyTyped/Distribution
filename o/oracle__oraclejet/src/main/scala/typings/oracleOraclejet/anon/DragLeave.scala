package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragLeave extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  def dragEnter(param0: typings.std.Event, param1: js.Object): Unit
  
  def dragLeave(param0: typings.std.Event, param1: js.Object): Unit
  
  def dragOver(param0: typings.std.Event, param1: js.Object): Unit
  
  def drop(param0: typings.std.Event, param1: js.Object): Unit
  
  var selector: String
}
object DragLeave {
  
  inline def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (typings.std.Event, js.Object) => Unit,
    dragLeave: (typings.std.Event, js.Object) => Unit,
    dragOver: (typings.std.Event, js.Object) => Unit,
    drop: (typings.std.Event, js.Object) => Unit,
    selector: String
  ): DragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragLeave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragLeave] (val x: Self) extends AnyVal {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    inline def setDragLeave(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    inline def setDragOver(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    inline def setDrop(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
