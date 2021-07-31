package typings.passportAuthToken

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportAuthToken.passportAuthTokenBooleans.`false`
import typings.passportAuthToken.passportAuthTokenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-auth-token", JSImport.Namespace)
  @js.native
  class ^ protected () extends Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @js.native
  trait Strategy
    extends typings.passportStrategy.mod.Strategy
  
  trait StrategyOptions extends StObject {
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var headerFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var params: js.UndefOr[Boolean] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var tokenFields: js.UndefOr[js.Array[String]] = js.undefined
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
      def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      @scala.inline
      def setHeaderFields(value: js.Array[String]): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      @scala.inline
      def setHeaderFieldsVarargs(value: String*): Self = StObject.set(x, "headerFields", js.Array(value :_*))
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setTokenFields(value: js.Array[String]): Self = StObject.set(x, "tokenFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldsUndefined: Self = StObject.set(x, "tokenFields", js.undefined)
      
      @scala.inline
      def setTokenFieldsVarargs(value: String*): Self = StObject.set(x, "tokenFields", js.Array(value :_*))
    }
  }
  
  trait StrategyOptionsWithRequest extends StObject {
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var headerFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var params: js.UndefOr[Boolean] = js.undefined
    
    var passReqToCallback: `true`
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var tokenFields: js.UndefOr[js.Array[String]] = js.undefined
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
      def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      @scala.inline
      def setHeaderFields(value: js.Array[String]): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      @scala.inline
      def setHeaderFieldsVarargs(value: String*): Self = StObject.set(x, "headerFields", js.Array(value :_*))
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setTokenFields(value: js.Array[String]): Self = StObject.set(x, "tokenFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldsUndefined: Self = StObject.set(x, "tokenFields", js.undefined)
      
      @scala.inline
      def setTokenFieldsVarargs(value: String*): Self = StObject.set(x, "tokenFields", js.Array(value :_*))
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
