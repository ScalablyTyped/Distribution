package typings
package parseDashPasswdLib.parseDashPasswdMod.parsePasswdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswdEntry extends js.Object {
  var gecos: java.lang.String
  var gid: java.lang.String
  var homedir: java.lang.String
  var password: java.lang.String
  var shell: java.lang.String
  var uid: java.lang.String
  var username: java.lang.String
}

object PasswdEntry {
  @scala.inline
  def apply(
    gecos: java.lang.String,
    gid: java.lang.String,
    homedir: java.lang.String,
    password: java.lang.String,
    shell: java.lang.String,
    uid: java.lang.String,
    username: java.lang.String
  ): PasswdEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gecos")(gecos)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("homedir")(homedir)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("shell")(shell)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[PasswdEntry]
  }
}

