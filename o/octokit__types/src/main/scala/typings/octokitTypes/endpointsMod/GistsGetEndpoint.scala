package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsGetEndpoint extends StObject {
  
  var gist_id: String = js.native
}
object GistsGetEndpoint {
  
  @scala.inline
  def apply(gist_id: String): GistsGetEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetEndpoint]
  }
  
  @scala.inline
  implicit class GistsGetEndpointMutableBuilder[Self <: GistsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
