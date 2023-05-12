package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.latest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageStatus extends StObject {
  
  var app_id: js.UndefOr[Double] = js.undefined
  
  var check_name: js.UndefOr[String] = js.undefined
  
  /** @description Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs. */
  var filter: js.UndefOr[latest | all] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[queued_ | in_progress | completed] = js.undefined
}
object PerpageStatus {
  
  inline def apply(): PerpageStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerpageStatus] (val x: Self) extends AnyVal {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    inline def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    inline def setFilter(value: latest | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
