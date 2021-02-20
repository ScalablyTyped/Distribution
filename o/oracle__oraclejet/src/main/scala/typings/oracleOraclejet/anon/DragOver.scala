package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragOver extends StObject {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ typings.std.Event, /* param1 */ Item, Unit]] = js.native
  
  var drop: js.UndefOr[
    js.Function2[/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext, Unit]
  ] = js.native
}
object DragOver {
  
  @scala.inline
  def apply(): DragOver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOver]
  }
  
  @scala.inline
  implicit class DragOverMutableBuilder[Self <: DragOver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDragEnter(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    @scala.inline
    def setDragLeave(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    @scala.inline
    def setDragOver(value: (/* param0 */ typings.std.Event, /* param1 */ Item) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    @scala.inline
    def setDrop(value: (/* param0 */ typings.std.Event, /* param1 */ ItemsDropContext) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
  }
}
