package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsGetEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object OrgsGetEndpoint {
  
  @scala.inline
  def apply(org_ : String): OrgsGetEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetEndpoint]
  }
  
  @scala.inline
  implicit class OrgsGetEndpointMutableBuilder[Self <: OrgsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
