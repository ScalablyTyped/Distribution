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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bearerStrategyMod {
  
  @JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
  @js.native
  class BearerStrategy protected ()
    extends StObject
       with Strategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_BearerStrategy: String = js.native
  }
  
  trait IBearerStrategyOption
    extends StObject
       with IBaseStrategyOption {
    
    var allowMultiAudiencesInToken: js.UndefOr[Boolean] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var policyName: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IBearerStrategyOption {
    
    inline def apply(clientID: String, identityMetadata: String): IBearerStrategyOption = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBearerStrategyOption]
    }
    
    extension [Self <: IBearerStrategyOption](x: Self) {
      
      inline def setAllowMultiAudiencesInToken(value: Boolean): Self = StObject.set(x, "allowMultiAudiencesInToken", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiAudiencesInTokenUndefined: Self = StObject.set(x, "allowMultiAudiencesInToken", js.undefined)
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  trait IBearerStrategyOptionWithRequest
    extends StObject
       with IBearerStrategyOption {
    
    var passReqToCallback: Boolean
  }
  object IBearerStrategyOptionWithRequest {
    
    inline def apply(clientID: String, identityMetadata: String, passReqToCallback: Boolean): IBearerStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBearerStrategyOptionWithRequest]
    }
    
    extension [Self <: IBearerStrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
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
