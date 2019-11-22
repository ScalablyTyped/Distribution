package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps extends js.Object {
  var store: Store[_, AnyAction]
}

object AppProps {
  @scala.inline
  def apply(store: Store[_, AnyAction]): AppProps = {
    val __obj = js.Dynamic.literal(store = store)
  
    __obj.asInstanceOf[AppProps]
  }
}

