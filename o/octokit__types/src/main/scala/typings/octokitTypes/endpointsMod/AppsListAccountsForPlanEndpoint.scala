package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsListAccountsForPlanEndpoint extends StObject {
  
  /**
    * To return the oldest accounts first, set to `asc`. Can be one of `asc` or `desc`. Ignored without the `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var plan_id: Double
  
  /**
    * Sorts the GitHub accounts by the date they were created or last updated. Can be one of `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}
object AppsListAccountsForPlanEndpoint {
  
  inline def apply(plan_id: Double): AppsListAccountsForPlanEndpoint = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsForPlanEndpoint]
  }
  
  extension [Self <: AppsListAccountsForPlanEndpoint](x: Self) {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPlan_id(value: Double): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    inline def setSort(value: created | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
