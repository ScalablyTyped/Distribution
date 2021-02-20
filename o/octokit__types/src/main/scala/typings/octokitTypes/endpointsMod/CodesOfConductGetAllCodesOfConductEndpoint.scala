package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
@js.native
trait CodesOfConductGetAllCodesOfConductEndpoint extends StObject {
  
  var mediaType: `3` = js.native
}
object CodesOfConductGetAllCodesOfConductEndpoint {
  
  @scala.inline
  def apply(mediaType: `3`): CodesOfConductGetAllCodesOfConductEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetAllCodesOfConductEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetAllCodesOfConductEndpointMutableBuilder[Self <: CodesOfConductGetAllCodesOfConductEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `3`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
