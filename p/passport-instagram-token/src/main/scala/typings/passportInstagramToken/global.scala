package typings.passportInstagramToken

import typings.express.mod.Request_
import typings.passportInstagramToken.mod.Profile
import typings.passportInstagramToken.mod.StrategyOption
import typings.passportInstagramToken.mod.StrategyOptionWithRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Strategy {
    
    @JSGlobal("Strategy.Strategy")
    @js.native
    open class Strategy protected ()
      extends typings.passportInstagramToken.mod.Strategy {
      def this(
        options: StrategyOptionWithRequest,
        verify: js.Function5[
                /* req */ Request_[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                  Any, 
                  Any, 
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                  Record[String, Any]
                ], 
                /* accessToken */ String, 
                /* refreshToken */ String, 
                /* profile */ Profile, 
                /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
                Unit
              ]
      ) = this()
      def this(
        options: StrategyOption,
        verify: js.Function4[
                /* accessToken */ String, 
                /* refreshToken */ String, 
                /* profile */ Profile, 
                /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
                Unit
              ]
      ) = this()
    }
  }
}
