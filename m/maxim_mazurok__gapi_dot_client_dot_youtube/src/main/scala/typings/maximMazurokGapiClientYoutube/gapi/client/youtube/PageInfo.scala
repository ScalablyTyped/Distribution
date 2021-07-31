package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInfo extends StObject {
  
  /** The number of results included in the API response. */
  var resultsPerPage: js.UndefOr[Double] = js.undefined
  
  /** The total number of results in the result set. */
  var totalResults: js.UndefOr[Double] = js.undefined
}
object PageInfo {
  
  @scala.inline
  def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsPerPageUndefined: Self = StObject.set(x, "resultsPerPage", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
