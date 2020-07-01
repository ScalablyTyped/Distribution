package typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPageContext[S, A /* <: Action[_] */] extends js.Object {
  /**
    * Provided by next-redux-wrapper: Whether the code is executed on the server or the client side
    */
  var isServer: Boolean
  /**
    * Provided by next-redux-wrapper: The redux store
    */
  var store: Store[S, A]
}

object NextPageContext {
  @scala.inline
  def apply[S, /* <: typings.redux.mod.Action[_] */ A](isServer: Boolean, store: Store[S, A]): NextPageContext[S, A] = {
    val __obj = js.Dynamic.literal(isServer = isServer.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageContext[S, A]]
  }
}

