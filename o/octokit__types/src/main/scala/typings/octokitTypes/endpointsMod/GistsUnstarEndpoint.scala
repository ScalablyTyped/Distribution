package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsUnstarEndpoint extends StObject {
  
  var gist_id: String = js.native
}
object GistsUnstarEndpoint {
  
  @scala.inline
  def apply(gist_id: String): GistsUnstarEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUnstarEndpoint]
  }
  
  @scala.inline
  implicit class GistsUnstarEndpointMutableBuilder[Self <: GistsUnstarEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
