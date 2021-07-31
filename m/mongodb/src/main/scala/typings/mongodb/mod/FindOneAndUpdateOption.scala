package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndUpdateOption[T]
  extends StObject
     with FindOneAndReplaceOption[T] {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object FindOneAndUpdateOption {
  
  @scala.inline
  def apply[T](): FindOneAndUpdateOption[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndUpdateOption[T]]
  }
  
  @scala.inline
  implicit class FindOneAndUpdateOptionMutableBuilder[Self <: FindOneAndUpdateOption[?], T] (val x: Self & FindOneAndUpdateOption[T]) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
  }
}
