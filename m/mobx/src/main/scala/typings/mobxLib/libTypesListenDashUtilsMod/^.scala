package typings
package mobxLib.libTypesListenDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/listen-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasListeners(listenable: IListenable): scala.Boolean = js.native
  def notifyListeners[T](listenable: IListenable, change: T): scala.Unit = js.native
  def registerListener(listenable: IListenable, handler: js.Function): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

