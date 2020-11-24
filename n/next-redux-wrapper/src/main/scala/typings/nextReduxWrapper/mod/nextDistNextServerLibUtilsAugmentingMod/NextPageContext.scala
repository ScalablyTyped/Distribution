package typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextPageContext[S, A /* <: Action[_] */] extends js.Object {
  
  /**
    * Provided by next-redux-wrapper: The redux store
    */
  var store: Store[S, A] = js.native
}
object NextPageContext {
  
  @scala.inline
  def apply[S, A /* <: Action[_] */](store: Store[S, A]): NextPageContext[S, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageContext[S, A]]
  }
  
  @scala.inline
  implicit class NextPageContextOps[Self <: NextPageContext[_, _], S, A /* <: Action[_] */] (val x: Self with (NextPageContext[S, A])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStore(value: Store[S, A]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
