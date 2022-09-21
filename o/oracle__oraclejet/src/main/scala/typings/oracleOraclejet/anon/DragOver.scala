package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOver extends StObject {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var drop: js.UndefOr[
    js.Function2[/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext, Unit]
  ] = js.undefined
}
object DragOver {
  
  inline def apply(): DragOver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOver]
  }
  
  extension [Self <: DragOver](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    inline def setDragLeave(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    inline def setDragOver(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    inline def setDrop(value: (/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
  }
}
