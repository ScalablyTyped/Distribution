package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.assigned
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.comments
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.mentioned
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repos
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.subscribed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orgs extends StObject {
  
  var collab: js.UndefOr[Boolean] = js.undefined
  
  /** The direction to sort the results by. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. */
  var filter: js.UndefOr[assigned | created_ | mentioned | subscribed | repos | all] = js.undefined
  
  /** A list of comma separated label names. Example: `bug,ui,@high` */
  var labels: js.UndefOr[String] = js.undefined
  
  var orgs: js.UndefOr[Boolean] = js.undefined
  
  var owned: js.UndefOr[Boolean] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var pulls: js.UndefOr[Boolean] = js.undefined
  
  /** Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var since: js.UndefOr[String] = js.undefined
  
  /** What to sort results by. */
  var sort: js.UndefOr[created_ | updated | comments] = js.undefined
  
  /** Indicates the state of the issues to return. */
  var state: js.UndefOr[open | closed | all] = js.undefined
}
object Orgs {
  
  inline def apply(): Orgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orgs]
  }
  
  extension [Self <: Orgs](x: Self) {
    
    inline def setCollab(value: Boolean): Self = StObject.set(x, "collab", value.asInstanceOf[js.Any])
    
    inline def setCollabUndefined: Self = StObject.set(x, "collab", js.undefined)
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFilter(value: assigned | created_ | mentioned | subscribed | repos | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOrgs(value: Boolean): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
    
    inline def setOrgsUndefined: Self = StObject.set(x, "orgs", js.undefined)
    
    inline def setOwned(value: Boolean): Self = StObject.set(x, "owned", value.asInstanceOf[js.Any])
    
    inline def setOwnedUndefined: Self = StObject.set(x, "owned", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPulls(value: Boolean): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
    
    inline def setPullsUndefined: Self = StObject.set(x, "pulls", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setSort(value: created_ | updated | comments): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setState(value: open | closed | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
