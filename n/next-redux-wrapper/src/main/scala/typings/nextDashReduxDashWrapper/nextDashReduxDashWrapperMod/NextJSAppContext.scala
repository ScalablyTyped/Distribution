package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.next.distClientRouterMod.Router
import typings.next.distNextDashServerLibUtilsMod.AppContextType
import typings.next.distNextDashServerLibUtilsMod.AppTreeType
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextJSAppContext extends AppContextType[Router] {
  @JSName("ctx")
  var ctx_NextJSAppContext: NextJSContext[_, AnyAction]
}

object NextJSAppContext {
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    Component: NextComponentType[NextPageContext, js.Object, js.Object],
    ctx: NextJSContext[_, AnyAction],
    router: Router
  ): NextJSAppContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NextJSAppContext]
  }
}

