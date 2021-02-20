package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsForkEndpoint extends StObject {
  
  var gist_id: String = js.native
}
object GistsForkEndpoint {
  
  @scala.inline
  def apply(gist_id: String): GistsForkEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsForkEndpoint]
  }
  
  @scala.inline
  implicit class GistsForkEndpointMutableBuilder[Self <: GistsForkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
