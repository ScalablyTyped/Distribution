package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScaleSession extends js.Object {
  var scale: Double
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_ScaleSession {
  @scala.inline
  def apply(scale: Double, session: ClientSession = null): Anon_ScaleSession = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScaleSession]
  }
}

