package typings.mobx.internalMod

import typings.mobx.listenUtilsMod.IListenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "notifyListeners")
@js.native
object notifyListeners extends js.Object {
  def apply[T](listenable: IListenable, change: T): Unit = js.native
}

