package typings.passportOauth2ClientPassword

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2-client-password", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequestInterface, verify: VerifyFunctionWithRequest) = this()
    
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
  
  trait StrategyOptionsWithRequestInterface extends StObject {
    
    var passReqToCallback: Boolean
  }
  object StrategyOptionsWithRequestInterface {
    
    inline def apply(passReqToCallback: Boolean): StrategyOptionsWithRequestInterface = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequestInterface]
    }
    
    extension [Self <: StrategyOptionsWithRequestInterface](x: Self) {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function3[
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[/* error */ Any, /* client */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[/* error */ Any, /* client */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit], 
    Unit
  ]
}
