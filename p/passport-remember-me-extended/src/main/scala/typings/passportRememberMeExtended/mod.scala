package typings.passportRememberMeExtended

import typings.express.mod.CookieOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.AuthenticateOptions
import typings.passportRememberMeExtended.passportRememberMeExtendedBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-remember-me-extended", "Strategy")
  @js.native
  class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction, issue: IssueFunction) = this()
    def this(
      options: StrategyOptionWithRequest,
      verify: VerifyFunctionWithRequest,
      issue: IssueFunctionWithRequest
    ) = this()
    def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: AuthenticateOptions): Unit = js.native
  }
  
  type IssueFunction = js.Function2[
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type IssueFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  trait StrategyOption extends StObject {
    
    var cookie: js.UndefOr[CookieOptions] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object StrategyOption {
    
    inline def apply(): StrategyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOption]
    }
    
    extension [Self <: StrategyOption](x: Self) {
      
      inline def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait StrategyOptionWithRequest
    extends StObject
       with StrategyOption {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionWithRequest {
    
    inline def apply(): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    extension [Self <: StrategyOptionWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
