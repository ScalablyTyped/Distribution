package typings
package personaLib.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var loggedInUser: java.lang.String
  var onready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def onlogin(s: java.lang.String): scala.Unit
  def onlogout(): scala.Unit
}

object WatchOptions {
  @scala.inline
  def apply(
    loggedInUser: java.lang.String,
    onlogin: js.Function1[java.lang.String, scala.Unit],
    onlogout: js.Function0[scala.Unit],
    onready: js.Function0[scala.Unit] = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser, onlogin = onlogin, onlogout = onlogout)
    if (onready != null) __obj.updateDynamic("onready")(onready)
    __obj.asInstanceOf[WatchOptions]
  }
}

