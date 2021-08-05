package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthorizationsDeleteGrantEndpoint extends StObject {
  
  var grant_id: Double
}
object OauthAuthorizationsDeleteGrantEndpoint {
  
  inline def apply(grant_id: Double): OauthAuthorizationsDeleteGrantEndpoint = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteGrantEndpoint]
  }
  
  extension [Self <: OauthAuthorizationsDeleteGrantEndpoint](x: Self) {
    
    inline def setGrant_id(value: Double): Self = StObject.set(x, "grant_id", value.asInstanceOf[js.Any])
  }
}
