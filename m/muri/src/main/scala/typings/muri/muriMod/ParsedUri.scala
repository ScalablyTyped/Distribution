package typings.muri.muriMod

import typings.muri.Anon_Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUri extends js.Object {
  var auth: js.UndefOr[Anon_Pass] = js.undefined
  var db: String
  var hosts: js.Array[Host]
  var options: js.Any
}

object ParsedUri {
  @scala.inline
  def apply(db: String, hosts: js.Array[Host], options: js.Any, auth: Anon_Pass = null): ParsedUri = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUri]
  }
}

