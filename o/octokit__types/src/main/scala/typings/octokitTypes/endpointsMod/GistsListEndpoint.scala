package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsListEndpoint extends StObject {
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Only gists updated at or after this time are returned.
    */
  var since: js.UndefOr[String] = js.undefined
}
object GistsListEndpoint {
  
  @scala.inline
  def apply(): GistsListEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GistsListEndpoint]
  }
  
  @scala.inline
  implicit class GistsListEndpointMutableBuilder[Self <: GistsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
