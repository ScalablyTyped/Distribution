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

