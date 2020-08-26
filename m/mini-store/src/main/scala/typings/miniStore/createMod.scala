package typings.miniStore

import typings.miniStore.typesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mini-store/cjs/create", JSImport.Namespace)
@js.native
object createMod extends js.Object {
  def create[S](initialState: S): Store[S] = js.native
  type Listener = js.Function0[Unit]
}

