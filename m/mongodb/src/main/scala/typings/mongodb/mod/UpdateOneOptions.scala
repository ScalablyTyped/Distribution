package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOneOptions extends ReplaceOneOptions {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
}
object UpdateOneOptions {
  
  @scala.inline
  def apply(): UpdateOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOneOptions]
  }
  
  @scala.inline
  implicit class UpdateOneOptionsMutableBuilder[Self <: UpdateOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
  }
}
