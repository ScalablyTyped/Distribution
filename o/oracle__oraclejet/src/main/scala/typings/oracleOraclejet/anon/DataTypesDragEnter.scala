package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DropColumnContext
import typings.std.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypesDragEnter extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.undefined
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.undefined
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.undefined
  
  def drop(param0: DragEvent, param1: DropColumnContext): Unit
}
object DataTypesDragEnter {
  
  inline def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropColumnContext) => Unit): DataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DataTypesDragEnter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTypesDragEnter] (val x: Self) extends AnyVal {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    inline def setDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    inline def setDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    inline def setDrop(value: (DragEvent, DropColumnContext) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
  }
}
