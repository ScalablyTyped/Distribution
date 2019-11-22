package typings.nextDashReduxDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextDashReduxDashWrapperMod {
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Store

  type MakeStore = js.Function2[/* initialState */ js.Any, /* options */ MakeStoreOptions, Store[js.Any, AnyAction]]
}
