package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  key :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
@js.native
trait CodesOfConductGetConductCodeEndpoint extends StObject {
  
  var key: String = js.native
  
  var mediaType: `3` = js.native
}
object CodesOfConductGetConductCodeEndpoint {
  
  @scala.inline
  def apply(key: String, mediaType: `3`): CodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetConductCodeEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetConductCodeEndpointMutableBuilder[Self <: CodesOfConductGetConductCodeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `3`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
