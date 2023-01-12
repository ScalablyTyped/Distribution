package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentEntityFilter extends StObject {
  
  /** Required. File types that will be returned. */
  var fileType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The IDs of the specified filter type. This is used to filter entities to fetch. If filter type is not `FILTER_TYPE_NONE`, at least one ID must be specified. */
  var filterIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Filter type used to filter fetched entities. */
  var filterType: js.UndefOr[String] = js.undefined
}
object ParentEntityFilter {
  
  inline def apply(): ParentEntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentEntityFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentEntityFilter] (val x: Self) extends AnyVal {
    
    inline def setFileType(value: js.Array[String]): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setFileTypeVarargs(value: String*): Self = StObject.set(x, "fileType", js.Array(value*))
    
    inline def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    inline def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    inline def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value*))
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
  }
}
