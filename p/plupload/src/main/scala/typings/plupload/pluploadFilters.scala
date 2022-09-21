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
  
  inline def apply(): pluploadFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadFilters]
  }
  
  extension [Self <: pluploadFilters](x: Self) {
    
    inline def setMax_file_size(value: Double | String): Self = StObject.set(x, "max_file_size", value.asInstanceOf[js.Any])
    
    inline def setMax_file_sizeUndefined: Self = StObject.set(x, "max_file_size", js.undefined)
    
    inline def setMime_types(value: js.Array[pluploadFiltersMimeTypes]): Self = StObject.set(x, "mime_types", value.asInstanceOf[js.Any])
    
    inline def setMime_typesUndefined: Self = StObject.set(x, "mime_types", js.undefined)
    
    inline def setMime_typesVarargs(value: pluploadFiltersMimeTypes*): Self = StObject.set(x, "mime_types", js.Array(value*))
    
    inline def setPrevent_duplicates(value: Boolean): Self = StObject.set(x, "prevent_duplicates", value.asInstanceOf[js.Any])
    
    inline def setPrevent_duplicatesUndefined: Self = StObject.set(x, "prevent_duplicates", js.undefined)
  }
}
