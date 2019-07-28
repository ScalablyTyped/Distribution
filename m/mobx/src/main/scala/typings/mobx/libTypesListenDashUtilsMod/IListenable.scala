package typings.mobx.libTypesListenDashUtilsMod

import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListenable extends js.Object {
  var changeListeners: js.UndefOr[js.Array[js.Function]] = js.native
  def observe(handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit]): Lambda = js.native
  def observe(
    handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
}

