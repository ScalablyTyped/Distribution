package typings.passportUniqueToken

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportUniqueToken.passportUniqueTokenBooleans.`false`
import typings.passportUniqueToken.passportUniqueTokenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-unique-token", "Strategy")
  @js.native
  class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
  }
  
  trait StrategyOptions extends StObject {
    
    var failedOnMissing: js.UndefOr[Boolean] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var tokenField: js.UndefOr[String] = js.undefined
    
    var tokenHeader: js.UndefOr[String] = js.undefined
    
    var tokenParams: js.UndefOr[String] = js.undefined
    
    var tokenQuery: js.UndefOr[String] = js.undefined
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      @scala.inline
      def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      @scala.inline
      def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      @scala.inline
      def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest extends StObject {
    
    var failedOnMissing: js.UndefOr[Boolean] = js.undefined
    
    var passReqToCallback: `true`
    
    var tokenField: js.UndefOr[String] = js.undefined
    
    var tokenHeader: js.UndefOr[String] = js.undefined
    
    var tokenParams: js.UndefOr[String] = js.undefined
    
    var tokenQuery: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      @scala.inline
      def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      @scala.inline
      def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      @scala.inline
      def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  trait VerifyOptions extends StObject {
    
    var message: String
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
