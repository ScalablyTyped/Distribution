package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRange extends StObject {
  
  /** If the end is closed, then the range includes all rows whose first `len(end_closed)` key columns exactly match `end_closed`. */
  var endClosed: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** If the end is open, then the range excludes rows whose first `len(end_open)` key columns exactly match `end_open`. */
  var endOpen: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** If the start is closed, then the range includes all rows whose first `len(start_closed)` key columns exactly match `start_closed`. */
  var startClosed: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** If the start is open, then the range excludes rows whose first `len(start_open)` key columns exactly match `start_open`. */
  var startOpen: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object KeyRange {
  
  @scala.inline
  def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  
  @scala.inline
  implicit class KeyRangeMutableBuilder[Self <: KeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndClosed(value: js.Array[js.Any]): Self = StObject.set(x, "endClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndClosedUndefined: Self = StObject.set(x, "endClosed", js.undefined)
    
    @scala.inline
    def setEndClosedVarargs(value: js.Any*): Self = StObject.set(x, "endClosed", js.Array(value :_*))
    
    @scala.inline
    def setEndOpen(value: js.Array[js.Any]): Self = StObject.set(x, "endOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOpenUndefined: Self = StObject.set(x, "endOpen", js.undefined)
    
    @scala.inline
    def setEndOpenVarargs(value: js.Any*): Self = StObject.set(x, "endOpen", js.Array(value :_*))
    
    @scala.inline
    def setStartClosed(value: js.Array[js.Any]): Self = StObject.set(x, "startClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartClosedUndefined: Self = StObject.set(x, "startClosed", js.undefined)
    
    @scala.inline
    def setStartClosedVarargs(value: js.Any*): Self = StObject.set(x, "startClosed", js.Array(value :_*))
    
    @scala.inline
    def setStartOpen(value: js.Array[js.Any]): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    
    @scala.inline
    def setStartOpenVarargs(value: js.Any*): Self = StObject.set(x, "startOpen", js.Array(value :_*))
  }
}
