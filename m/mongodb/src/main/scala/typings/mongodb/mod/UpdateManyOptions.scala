package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateManyOptions extends CommonOptions {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object UpdateManyOptions {
  
  @scala.inline
  def apply(): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManyOptions]
  }
  
  @scala.inline
  implicit class UpdateManyOptionsMutableBuilder[Self <: UpdateManyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
