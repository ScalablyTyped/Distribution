package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnter extends StObject {
  
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
  implicit class DragEnterMutableBuilder[Self <: DragEnter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDragEnter(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragLeave(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragOver(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrop(value: (typings.std.Event, js.Object) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
  }
}
