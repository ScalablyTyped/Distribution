package typings
package muriLib.muriMod.MuriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUri extends js.Object {
  var auth: js.UndefOr[muriLib.Anon_Pass] = js.undefined
  var db: java.lang.String
  var hosts: js.Array[Host]
  var options: js.Any
}

object ParsedUri {
  @scala.inline
  def apply(db: java.lang.String, hosts: js.Array[Host], options: js.Any, auth: muriLib.Anon_Pass = null): ParsedUri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("hosts")(hosts)
    __obj.updateDynamic("options")(options)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[ParsedUri]
  }
}

