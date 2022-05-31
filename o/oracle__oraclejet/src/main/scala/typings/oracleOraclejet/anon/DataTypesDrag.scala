package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import typings.std.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypesDrag[K, D] extends StObject {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.undefined
}
object DataTypesDrag {
  
  inline def apply[K, D](): DataTypesDrag[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypesDrag[K, D]]
  }
  
  extension [Self <: DataTypesDrag[?, ?], K, D](x: Self & (DataTypesDrag[K, D])) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    inline def setDrag(value: /* param0 */ DragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragEnd(value: /* param0 */ DragEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
  }
}
