package typings.next

import typings.next.distClientRouterMod.Router
import typings.next.distSharedLibUtilsMod.AppContextType
import typings.next.distSharedLibUtilsMod.AppInitialProps
import typings.next.distSharedLibUtilsMod.AppPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPagesAppMod {
  
  @JSImport("next/dist/pages/_app", JSImport.Default)
  @js.native
  open class default[P, CP, S] () extends App[P, CP, S]
  /* static members */
  object default {
    
    @JSImport("next/dist/pages/_app", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/pages/_app", "default.getInitialProps")
    @js.native
    def getInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps[Any]]] = js.native
    inline def getInitialProps_=(x: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/pages/_app", "default.origGetInitialProps")
    @js.native
    def origGetInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps[Any]]] = js.native
    inline def origGetInitialProps_=(x: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("origGetInitialProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait App[P, CP, S] extends Component[P & AppProps[CP], S, Any]
  
  type AppContext = AppContextType[Router]
  
  type AppProps[P] = AppPropsType[Router, P]
}
