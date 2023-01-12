package typings.passportUniqueToken

import typings.express.mod.Request_
import typings.passportUniqueToken.passportUniqueTokenBooleans.`false`
import typings.passportUniqueToken.passportUniqueTokenBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-unique-token", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
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
    
    inline def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      inline def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      inline def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      inline def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      inline def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      inline def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      inline def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      inline def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
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
    
    inline def apply(): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      inline def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      inline def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      inline def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      inline def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      inline def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      inline def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      inline def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      inline def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
