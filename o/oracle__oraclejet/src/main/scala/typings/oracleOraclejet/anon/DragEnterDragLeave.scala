package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DropRowContext
import typings.std.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEnterDragLeave extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  def drop(param0: DragEvent, param1: DropRowContext): Unit
}
object DragEnterDragLeave {
  
  inline def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropRowContext) => Unit): DragEnterDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragEnterDragLeave]
  }
  
  extension [Self <: DragEnterDragLeave](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    inline def setDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    inline def setDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    inline def setDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    inline def setDrop(value: (DragEvent, DropRowContext) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
  }
}
