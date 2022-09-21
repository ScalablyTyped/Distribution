package typings.passportAuthToken

import typings.express.mod.Request_
import typings.passportAuthToken.passportAuthTokenBooleans.`false`
import typings.passportAuthToken.passportAuthTokenBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-auth-token", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Strategy {
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
    
    inline def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setHeaderFields(value: js.Array[String]): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      inline def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      inline def setHeaderFieldsVarargs(value: String*): Self = StObject.set(x, "headerFields", js.Array(value*))
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setTokenFields(value: js.Array[String]): Self = StObject.set(x, "tokenFields", value.asInstanceOf[js.Any])
      
      inline def setTokenFieldsUndefined: Self = StObject.set(x, "tokenFields", js.undefined)
      
      inline def setTokenFieldsVarargs(value: String*): Self = StObject.set(x, "tokenFields", js.Array(value*))
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
    
    inline def apply(): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    extension [Self <: StrategyOptionsWithRequest](x: Self) {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setHeaderFields(value: js.Array[String]): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      inline def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      inline def setHeaderFieldsVarargs(value: String*): Self = StObject.set(x, "headerFields", js.Array(value*))
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setTokenFields(value: js.Array[String]): Self = StObject.set(x, "tokenFields", value.asInstanceOf[js.Any])
      
      inline def setTokenFieldsUndefined: Self = StObject.set(x, "tokenFields", js.undefined)
      
      inline def setTokenFieldsVarargs(value: String*): Self = StObject.set(x, "tokenFields", js.Array(value*))
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ Any, 
      /* user */ js.UndefOr[Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ Any, 
      /* user */ js.UndefOr[Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  trait VerifyOptions extends StObject {
    
    var message: String
  }
  object VerifyOptions {
    
    inline def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
