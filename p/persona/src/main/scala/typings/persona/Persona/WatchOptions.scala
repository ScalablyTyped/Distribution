package typings.persona.Persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var loggedInUser: String
  var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
  def onlogin(s: String): Unit
  def onlogout(): Unit
}

object WatchOptions {
  @scala.inline
  def apply(loggedInUser: String, onlogin: String => Unit, onlogout: () => Unit, onready: () => Unit = null): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
    if (onready != null) __obj.updateDynamic("onready")(js.Any.fromFunction0(onready))
    __obj.asInstanceOf[WatchOptions]
  }
}

