package typings.passportAzureAd

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import typings.passportAzureAd.commonMod.IBaseStrategyOption
import typings.passportAzureAd.commonMod.ITokenPayload
import typings.passportAzureAd.commonMod.VerifyCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bearerStrategyMod {
  
  @JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
  @js.native
  class BearerStrategy protected () extends Strategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_BearerStrategy: String = js.native
  }
  
  @js.native
  trait IBearerStrategyOption extends IBaseStrategyOption {
    
    var allowMultiAudiencesInToken: js.UndefOr[Boolean] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var policyName: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[js.Array[String]] = js.native
  }
  object IBearerStrategyOption {
    
    @scala.inline
    def apply(clientID: String, identityMetadata: String): IBearerStrategyOption = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBearerStrategyOption]
    }
    
    @scala.inline
    implicit class IBearerStrategyOptionMutableBuilder[Self <: IBearerStrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMultiAudiencesInToken(value: Boolean): Self = StObject.set(x, "allowMultiAudiencesInToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiAudiencesInTokenUndefined: Self = StObject.set(x, "allowMultiAudiencesInToken", js.undefined)
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IBearerStrategyOptionWithRequest extends IBearerStrategyOption {
    
    var passReqToCallback: Boolean = js.native
  }
  object IBearerStrategyOptionWithRequest {
    
    @scala.inline
    def apply(clientID: String, identityMetadata: String, passReqToCallback: Boolean): IBearerStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBearerStrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class IBearerStrategyOptionWithRequestMutableBuilder[Self <: IBearerStrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyBearerFunction = js.Function2[/* token */ ITokenPayload, /* done */ VerifyCallback, Unit]
  
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ ITokenPayload, 
    /* done */ VerifyCallback, 
    Unit
  ]
}
