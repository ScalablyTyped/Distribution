package typings.next

import typings.next.distClientRouterMod.SingletonRouter
import typings.next.distClientWithDashRouterMod.ExcludeRouterProps
import typings.next.distClientWithDashRouterMod.WithRouterProps
import typings.next.distNextDashServerLibMittMod.MittEmitter
import typings.next.distNextDashServerLibRouterRouterMod.NextRouter
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class Router protected ()
    extends typings.next.distClientRouterMod.Router {
    def this(
      pathname: String,
      query: ParsedUrlQuery,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscription: Anon_App
    ) = this()
  }
  
  val RouterContext: Context[NextRouter] = js.native
  val default: SingletonRouter = js.native
  def createRouter(pathname: String, query: ParsedUrlQuery, as: String, __3: Anon_AppComponent): typings.next.distNextDashServerLibRouterRouterMod.default = js.native
  def makePublicRouterInstance(router: typings.next.distNextDashServerLibRouterRouterMod.default): NextRouter = js.native
  def useRouter(): NextRouter = js.native
  def withRouter[P /* <: WithRouterProps */, C](ComposedComponent: NextComponentType[C, _, P]): ComponentClass[ExcludeRouterProps[P], ComponentState] = js.native
  /* static members */
  @js.native
  object Router extends js.Object {
    var events: MittEmitter = js.native
    def _rewriteUrlForNextExport(url: String): String = js.native
  }
  
}

