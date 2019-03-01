package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullSession extends js.Object {
  var full: scala.Boolean
  var session: mongodbLib.mongodbMod.ClientSession
}

object Anon_FullSession {
  @scala.inline
  def apply(full: scala.Boolean, session: mongodbLib.mongodbMod.ClientSession): Anon_FullSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_FullSession]
  }
}

