package typings.nextReduxWrapper.mod

import typings.nextReduxWrapper.anon.GetServerSideProps
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-redux-wrapper", "createWrapper")
@js.native
object createWrapper extends js.Object {
  
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A]): GetServerSideProps[S, A] = js.native
  def apply[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A], config: Config[S]): GetServerSideProps[S, A] = js.native
}
