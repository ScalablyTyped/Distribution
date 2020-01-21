package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaleSession extends js.Object {
  var scale: Double
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonScaleSession {
  @scala.inline
  def apply(scale: Double, session: ClientSession = null): AnonScaleSession = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScaleSession]
  }
}

