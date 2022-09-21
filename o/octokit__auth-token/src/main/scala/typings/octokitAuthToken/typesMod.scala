package typings.octokitAuthToken

import typings.octokitAuthToken.octokitAuthTokenStrings.`user-to-server`
import typings.octokitAuthToken.octokitAuthTokenStrings.app
import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyResponse = OctokitResponse[Any, Double]
  
  trait AppAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: app
    
    var `type`: token
  }
  object AppAuthentication {
    
    inline def apply(token: Token): AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "app")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[AppAuthentication]
    }
    
    extension [Self <: AppAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: app): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.octokitAuthToken.typesMod.OAuthTokenAuthentication
    - typings.octokitAuthToken.typesMod.InstallationTokenAuthentication
    - typings.octokitAuthToken.typesMod.AppAuthentication
    - typings.octokitAuthToken.typesMod.UserToServerAuthentication
  */
  trait Authentication extends StObject
  object Authentication {
    
    inline def AppAuthentication(token: Token): typings.octokitAuthToken.typesMod.AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "app")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.AppAuthentication]
    }
    
    inline def InstallationTokenAuthentication(token: Token): typings.octokitAuthToken.typesMod.InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "installation")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.InstallationTokenAuthentication]
    }
    
    inline def OAuthTokenAuthentication(token: Token): typings.octokitAuthToken.typesMod.OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "oauth")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.OAuthTokenAuthentication]
    }
    
    inline def UserToServerAuthentication(token: Token): typings.octokitAuthToken.typesMod.UserToServerAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "user-to-server")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.UserToServerAuthentication]
    }
  }
  
  type EndpointDefaults = typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typings.octokitTypes.endpointOptionsMod.EndpointOptions
  
  trait InstallationTokenAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: installation
    
    var `type`: token
  }
  object InstallationTokenAuthentication {
    
    inline def apply(token: Token): InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "installation")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[InstallationTokenAuthentication]
    }
    
    extension [Self <: InstallationTokenAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: installation): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuthTokenAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: oauth
    
    var `type`: token
  }
  object OAuthTokenAuthentication {
    
    inline def apply(token: Token): OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "oauth")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[OAuthTokenAuthentication]
    }
    
    extension [Self <: OAuthTokenAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: oauth): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestInterface = typings.octokitTypes.requestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typings.octokitTypes.requestParametersMod.RequestParameters
  
  type Route = typings.octokitTypes.routeMod.Route
  
  type StrategyInterface = typings.octokitTypes.strategyInterfaceMod.StrategyInterface[js.Array[Token], js.Array[Any], Authentication]
  
  type Token = String
  
  trait UserToServerAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: `user-to-server`
    
    var `type`: token
  }
  object UserToServerAuthentication {
    
    inline def apply(token: Token): UserToServerAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "user-to-server")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[UserToServerAuthentication]
    }
    
    extension [Self <: UserToServerAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: `user-to-server`): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
