package typings.passportRememberMe

import typings.express.mod.CookieOptions
import typings.express.mod.Request_
import typings.passport.mod.AuthenticateOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-remember-me", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction, issue: IssueFunction) = this()
    def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: AuthenticateOptions
    ): Unit = js.native
  }
  
  type IssueFunction = js.Function2[
    /* user */ Any, 
    /* done */ js.Function2[/* err */ Any, /* token */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  type IssueFunctionWithRequest = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* user */ Any, 
    /* done */ js.Function2[/* err */ Any, /* token */ js.UndefOr[Any], Unit], 
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
  
  type VerifyFunction = js.Function2[
    /* token */ Any, 
    /* done */ js.Function3[/* err */ Any, /* user */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit], 
    Unit
  ]
}
