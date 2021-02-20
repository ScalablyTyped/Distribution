package typings.octokitAuthToken

import typings.octokitAuthToken.octokitAuthTokenStrings.app
import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyResponse = OctokitResponse[js.Any]
  
  @js.native
  trait AppAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: app = js.native
    
    var `type`: token = js.native
  }
  object AppAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: app, `type`: token): AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAuthentication]
    }
    
    @scala.inline
    implicit class AppAuthenticationMutableBuilder[Self <: AppAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: app): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.octokitAuthToken.typesMod.OAuthTokenAuthentication
    - typings.octokitAuthToken.typesMod.InstallationTokenAuthentication
    - typings.octokitAuthToken.typesMod.AppAuthentication
  */
  trait Authentication extends StObject
  object Authentication {
    
    @scala.inline
    def AppAuthentication(token: Token, tokenType: app, `type`: token): typings.octokitAuthToken.typesMod.AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.AppAuthentication]
    }
    
    @scala.inline
    def InstallationTokenAuthentication(token: Token, tokenType: installation, `type`: token): typings.octokitAuthToken.typesMod.InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.InstallationTokenAuthentication]
    }
    
    @scala.inline
    def OAuthTokenAuthentication(token: Token, tokenType: oauth, `type`: token): typings.octokitAuthToken.typesMod.OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.octokitAuthToken.typesMod.OAuthTokenAuthentication]
    }
  }
  
  type EndpointDefaults = typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typings.octokitTypes.endpointOptionsMod.EndpointOptions
  
  @js.native
  trait InstallationTokenAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: installation = js.native
    
    var `type`: token = js.native
  }
  object InstallationTokenAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: installation, `type`: token): InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationTokenAuthentication]
    }
    
    @scala.inline
    implicit class InstallationTokenAuthenticationMutableBuilder[Self <: InstallationTokenAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: installation): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuthTokenAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: oauth = js.native
    
    var `type`: token = js.native
  }
  object OAuthTokenAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: oauth, `type`: token): OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthTokenAuthentication]
    }
    
    @scala.inline
    implicit class OAuthTokenAuthenticationMutableBuilder[Self <: OAuthTokenAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: oauth): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestInterface = typings.octokitTypes.requestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typings.octokitTypes.requestParametersMod.RequestParameters
  
  type Route = typings.octokitTypes.routeMod.Route
  
  type StrategyInterface = typings.octokitTypes.strategyInterfaceMod.StrategyInterface[js.Array[Token], js.Array[js.Any], Authentication]
  
  type Token = String
}
