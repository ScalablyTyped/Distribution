package typings.passportOauth2ClientPassword

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2-client-password", "Strategy")
  @js.native
  class Strategy protected ()
    extends typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequestInterface, verify: VerifyFunctionWithRequest) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  
  @js.native
  trait StrategyOptionsWithRequestInterface extends StObject {
    
    var passReqToCallback: Boolean = js.native
  }
  object StrategyOptionsWithRequestInterface {
    
    @scala.inline
    def apply(passReqToCallback: Boolean): StrategyOptionsWithRequestInterface = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequestInterface]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestInterfaceMutableBuilder[Self <: StrategyOptionsWithRequestInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function3[
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
}
