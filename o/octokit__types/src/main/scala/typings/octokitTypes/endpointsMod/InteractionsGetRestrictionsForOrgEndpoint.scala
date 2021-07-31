package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.sombra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionsGetRestrictionsForOrgEndpoint
  extends StObject
     with RequiredPreview[sombra] {
  
  @JSName("org")
  var org_ : String
}
object InteractionsGetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[sombra], org_ : String): InteractionsGetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class InteractionsGetRestrictionsForOrgEndpointMutableBuilder[Self <: InteractionsGetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
