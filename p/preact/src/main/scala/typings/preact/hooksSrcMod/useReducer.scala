package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/hooks/src", "useReducer")
@js.native
object useReducer extends js.Object {
  def apply[S, A](reducer: Reducer[S, A], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def apply[S, A, I](reducer: Reducer[S, A], initialArg: I, init: js.Function1[/* arg */ I, S]): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
}

