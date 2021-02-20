package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentEntityFilter extends StObject {
  
  /** Required. File types that will be returned. */
  var fileType: js.UndefOr[js.Array[String]] = js.native
  
  /** The IDs of the specified filter type. This is used to filter entities to fetch. If filter type is not `FILTER_TYPE_NONE`, at least one ID must be specified. */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Filter type used to filter fetched entities. */
  var filterType: js.UndefOr[String] = js.native
}
object ParentEntityFilter {
  
  @scala.inline
  def apply(): ParentEntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentEntityFilter]
  }
  
  @scala.inline
  implicit class ParentEntityFilterMutableBuilder[Self <: ParentEntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: js.Array[String]): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setFileTypeVarargs(value: String*): Self = StObject.set(x, "fileType", js.Array(value :_*))
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
  }
}
