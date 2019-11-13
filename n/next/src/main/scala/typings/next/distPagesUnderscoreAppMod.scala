package typings.next

import typings.next.distClientRouterMod.Router
import typings.next.distNextDashServerLibUtilsMod.AppContextType
import typings.next.distNextDashServerLibUtilsMod.AppInitialProps
import typings.next.distNextDashServerLibUtilsMod.AppPropsType
import typings.next.distPagesUnderscoreAppMod.App
import typings.next.distPagesUnderscoreAppMod.AppContext
import typings.next.distPagesUnderscoreAppMod.AppProps
import typings.react.reactMod.Component
import typings.react.reactMod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/pages/_app", JSImport.Namespace)
@js.native
object distPagesUnderscoreAppMod extends js.Object {
  @js.native
  trait App[P, CP, S]
    extends Component[P with AppProps[CP], S, js.Any] {
    @JSName("componentDidCatch")
    def componentDidCatch_MApp(error: Error, _errorInfo: ErrorInfo): Unit = js.native
  }
  
  @js.native
  class default[P, CP, S] () extends App[P, CP, S]
  
  def Container(p: js.Any): js.Any = js.native
  def createUrl(router: Router): Anon_As = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var getInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps]] = js.native
    var origGetInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps]] = js.native
  }
  
  type AppContext = AppContextType[Router]
  type AppProps[P] = AppPropsType[Router, P]
}

