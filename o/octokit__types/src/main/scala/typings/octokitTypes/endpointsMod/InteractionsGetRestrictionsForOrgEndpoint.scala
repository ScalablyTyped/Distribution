package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsGetRestrictionsForOrgEndpoint extends StObject {
  
  var mediaType: `4` = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object InteractionsGetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `4`, org_ : String): InteractionsGetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsGetRestrictionsForOrgEndpointMutableBuilder[Self <: InteractionsGetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `4`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
