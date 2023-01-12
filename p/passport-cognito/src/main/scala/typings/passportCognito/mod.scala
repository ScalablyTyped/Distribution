package typings.passportCognito

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-cognito", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
    
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
  
  trait CognitoStrategyOptions extends StObject {
    
    var clientId: String
    
    var region: String
    
    var userPoolId: String
  }
  object CognitoStrategyOptions {
    
    inline def apply(clientId: String, region: String, userPoolId: String): CognitoStrategyOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoStrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  type CognitoVerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* idToken */ String, 
    /* refreshToken */ String, 
    /* user */ js.Object, 
    /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
    Any
  ]
}
