package typings.mobx.libTypesListenDashUtilsMod

import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/listen-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasListeners(listenable: IListenable): Boolean = js.native
  def notifyListeners[T](listenable: IListenable, change: T): Unit = js.native
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = js.native
}

