package typings
package mobxLib.libTypesListenDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/listen-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasListeners(listenable: mobxLib.libTypesListenDashUtilsMod.IListenable): scala.Boolean = js.native
  def notifyListeners[T](listenable: mobxLib.libTypesListenDashUtilsMod.IListenable, change: T): scala.Unit = js.native
  def registerListener(listenable: mobxLib.libTypesListenDashUtilsMod.IListenable, handler: js.Function): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

