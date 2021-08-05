package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthorizationsGetGrantEndpoint extends StObject {
  
  var grant_id: Double
}
object OauthAuthorizationsGetGrantEndpoint {
  
  inline def apply(grant_id: Double): OauthAuthorizationsGetGrantEndpoint = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetGrantEndpoint]
  }
  
  extension [Self <: OauthAuthorizationsGetGrantEndpoint](x: Self) {
    
    inline def setGrant_id(value: Double): Self = StObject.set(x, "grant_id", value.asInstanceOf[js.Any])
  }
}
