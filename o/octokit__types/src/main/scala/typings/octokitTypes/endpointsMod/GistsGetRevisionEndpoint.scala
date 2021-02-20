package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsGetRevisionEndpoint extends StObject {
  
  var gist_id: String = js.native
  
  var sha: String = js.native
}
object GistsGetRevisionEndpoint {
  
  @scala.inline
  def apply(gist_id: String, sha: String): GistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionEndpoint]
  }
  
  @scala.inline
  implicit class GistsGetRevisionEndpointMutableBuilder[Self <: GistsGetRevisionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
