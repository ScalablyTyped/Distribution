package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  /** If the position is just before or just after the given values, relative to the sort order defined by the query. */
  var before: js.UndefOr[Boolean] = js.undefined
  
  /** The values that represent a position, in the order they appear in the order by clause of a query. Can contain fewer values than specified in the order by clause. */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}
object Cursor {
  
  @scala.inline
  def apply(): Cursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cursor]
  }
  
  @scala.inline
  implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
