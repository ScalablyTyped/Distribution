package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  q :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'mercy'> */
@js.native
trait SearchTopicsEndpoint extends StObject {
  
  var mediaType: `15` = js.native
  
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String = js.native
}
object SearchTopicsEndpoint {
  
  @scala.inline
  def apply(mediaType: `15`, q: String): SearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTopicsEndpoint]
  }
  
  @scala.inline
  implicit class SearchTopicsEndpointMutableBuilder[Self <: SearchTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `15`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
