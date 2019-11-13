package typings.next

import typings.next.distClientRouterMod.Router
import typings.next.distNextDashServerLibUtilsMod.AppInitialProps
import typings.next.distPagesUnderscoreAppMod.AppContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/app", JSImport.Namespace)
@js.native
object appMod extends js.Object {
  @js.native
  class default[P, CP, S] ()
    extends typings.next.distPagesUnderscoreAppMod.default[P, CP, S]
  
  def Container(p: js.Any): js.Any = js.native
  def createUrl(router: Router): Anon_As = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var getInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps]] = js.native
    var origGetInitialProps: js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps]] = js.native
  }
  
}

