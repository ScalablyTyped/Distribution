package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext * / any */ trait NextJSAppContext extends js.Object {
  var ctx: NextJSContext[_, AnyAction]
}

object NextJSAppContext {
  @scala.inline
  def apply(ctx: NextJSContext[_, AnyAction]): NextJSAppContext = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NextJSAppContext]
  }
}

