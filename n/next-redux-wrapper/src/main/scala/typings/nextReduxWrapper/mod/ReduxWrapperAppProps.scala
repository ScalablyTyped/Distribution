package typings.nextReduxWrapper.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppProps<P> * / any */ trait ReduxWrapperAppProps[S, A /* <: Action[_] */, P] extends js.Object {
  var store: Store[S, A]
}

object ReduxWrapperAppProps {
  @scala.inline
  def apply[S, A /* <: Action[_] */, P](store: Store[S, A]): ReduxWrapperAppProps[S, A, P] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxWrapperAppProps[S, A, P]]
  }
}

