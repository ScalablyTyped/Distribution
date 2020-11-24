package typings.nextReduxWrapper.mod

import typings.nextReduxWrapper.anon.FunctionComponentWrapperP
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-redux-wrapper", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = js.native
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A], config: Config[_]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = js.native
}
