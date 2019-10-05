package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/hooks/src", "useState")
@js.native
object useState extends js.Object {
  def apply[S](initialState: S): js.Tuple2[S, StateUpdater[S]] = js.native
  def apply[S](initialState: js.Function0[S]): js.Tuple2[S, StateUpdater[S]] = js.native
}

