package typings.passportInstagramGraph

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportInstagramGraph.mod.Profile
import typings.passportInstagramGraph.mod.StrategyOption
import typings.passportInstagramGraph.mod.StrategyOptionWithRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Strategy {
    
    @JSGlobal("Strategy.Strategy")
    @js.native
    class Strategy protected ()
      extends typings.passportInstagramGraph.mod.Strategy {
      def this(
        options: StrategyOptionWithRequest,
        verify: js.Function5[
                /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
                /* accessToken */ String, 
                /* refreshToken */ String, 
                /* profile */ Profile, 
                /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
                Unit
              ]
      ) = this()
      def this(
        options: StrategyOption,
        verify: js.Function4[
                /* accessToken */ String, 
                /* refreshToken */ String, 
                /* profile */ Profile, 
                /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
                Unit
              ]
      ) = this()
    }
  }
}
