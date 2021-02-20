package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.DropRowContext
import typings.std.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnterDragLeave extends StObject {
  
  var dataTypes: String | js.Array[String] = js.native
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.native
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.native
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.native
  
  def drop(param0: DragEvent, param1: DropRowContext): Unit = js.native
}
object DragEnterDragLeave {
  
  @scala.inline
  def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropRowContext) => Unit): DragEnterDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragEnterDragLeave]
  }
  
  @scala.inline
  implicit class DragEnterDragLeaveMutableBuilder[Self <: DragEnterDragLeave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    @scala.inline
    def setDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    @scala.inline
    def setDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    @scala.inline
    def setDrop(value: (DragEvent, DropRowContext) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
  }
}
