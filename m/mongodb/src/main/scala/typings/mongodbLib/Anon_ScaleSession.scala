package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScaleSession extends js.Object {
  var scale: scala.Double
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_ScaleSession {
  @scala.inline
  def apply(scale: scala.Double, session: mongodbLib.mongodbMod.ClientSession = null): Anon_ScaleSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale")(scale)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_ScaleSession]
  }
}

