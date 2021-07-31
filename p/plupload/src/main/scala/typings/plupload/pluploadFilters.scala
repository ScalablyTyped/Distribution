package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadFilters extends StObject {
  
  var max_file_size: js.UndefOr[Double | String] = js.undefined
  
  var mime_types: js.UndefOr[js.Array[pluploadFiltersMimeTypes]] = js.undefined
  
  var prevent_duplicates: js.UndefOr[Boolean] = js.undefined
}
object pluploadFilters {
  
  @scala.inline
  def apply(): pluploadFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadFilters]
  }
  
  @scala.inline
  implicit class pluploadFiltersMutableBuilder[Self <: pluploadFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax_file_size(value: Double | String): Self = StObject.set(x, "max_file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_file_sizeUndefined: Self = StObject.set(x, "max_file_size", js.undefined)
    
    @scala.inline
    def setMime_types(value: js.Array[pluploadFiltersMimeTypes]): Self = StObject.set(x, "mime_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime_typesUndefined: Self = StObject.set(x, "mime_types", js.undefined)
    
    @scala.inline
    def setMime_typesVarargs(value: pluploadFiltersMimeTypes*): Self = StObject.set(x, "mime_types", js.Array(value :_*))
    
    @scala.inline
    def setPrevent_duplicates(value: Boolean): Self = StObject.set(x, "prevent_duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevent_duplicatesUndefined: Self = StObject.set(x, "prevent_duplicates", js.undefined)
  }
}
