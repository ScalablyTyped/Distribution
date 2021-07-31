package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.mercy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTopicsEndpoint
  extends StObject
     with RequiredPreview[mercy] {
  
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String
}
object SearchTopicsEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[mercy], q: String): SearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTopicsEndpoint]
  }
  
  @scala.inline
  implicit class SearchTopicsEndpointMutableBuilder[Self <: SearchTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
