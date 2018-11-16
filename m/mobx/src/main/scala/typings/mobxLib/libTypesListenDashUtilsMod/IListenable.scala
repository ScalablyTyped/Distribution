package typings
package mobxLib.libTypesListenDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListenable extends js.Object {
  var changeListeners: js.UndefOr[js.Array[js.Function]] = js.native
  def observe(handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

