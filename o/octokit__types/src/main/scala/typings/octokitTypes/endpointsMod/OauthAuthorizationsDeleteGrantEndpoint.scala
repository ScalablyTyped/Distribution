package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsDeleteGrantEndpoint extends StObject {
  
  var grant_id: Double = js.native
}
object OauthAuthorizationsDeleteGrantEndpoint {
  
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsDeleteGrantEndpoint = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteGrantEndpoint]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsDeleteGrantEndpointMutableBuilder[Self <: OauthAuthorizationsDeleteGrantEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrant_id(value: Double): Self = StObject.set(x, "grant_id", value.asInstanceOf[js.Any])
  }
}
