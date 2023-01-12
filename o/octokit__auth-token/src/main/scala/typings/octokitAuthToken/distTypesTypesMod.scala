package typings.octokitAuthToken

import typings.octokitAuthToken.octokitAuthTokenStrings.`user-to-server`
import typings.octokitAuthToken.octokitAuthTokenStrings.app
import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppAuthentication] (val x: Self) extends AnyVal {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: app): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication
    - typings.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication
    - typings.octokitAuthToken.distTypesTypesMod.AppAuthentication
    - typings.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication
  */
  trait Authentication extends StObject
  object Authentication {
    
    inline def AppAuthentication(token: Token): typings.octokitAuthToken.distTypesTypesMod.AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "app")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.distTypesTypesMod.AppAuthentication]
    }
    
    inline def InstallationTokenAuthentication(token: Token): typings.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "installation")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication]
    }
    
    inline def OAuthTokenAuthentication(token: Token): typings.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "oauth")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication]
    }
    
    inline def UserToServerAuthentication(token: Token): typings.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "user-to-server")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typings.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication]
    }
  }
  
  type EndpointDefaults = typings.octokitTypes.distTypesEndpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typings.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallationTokenAuthentication] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuthTokenAuthentication] (val x: Self) extends AnyVal {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: oauth): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestInterface = typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
  
  type Route = typings.octokitTypes.distTypesRouteMod.Route
  
  type StrategyInterface = typings.octokitTypes.distTypesStrategyInterfaceMod.StrategyInterface[js.Array[Token], js.Array[Any], Authentication]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserToServerAuthentication] (val x: Self) extends AnyVal {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: `user-to-server`): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
