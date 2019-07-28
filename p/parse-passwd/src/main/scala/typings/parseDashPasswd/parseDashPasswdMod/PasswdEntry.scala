package typings.parseDashPasswd.parseDashPasswdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswdEntry extends js.Object {
  var gecos: String
  var gid: String
  var homedir: String
  var password: String
  var shell: String
  var uid: String
  var username: String
}

object PasswdEntry {
  @scala.inline
  def apply(
    gecos: String,
    gid: String,
    homedir: String,
    password: String,
    shell: String,
    uid: String,
    username: String
  ): PasswdEntry = {
    val __obj = js.Dynamic.literal(gecos = gecos, gid = gid, homedir = homedir, password = password, shell = shell, uid = uid, username = username)
  
    __obj.asInstanceOf[PasswdEntry]
  }
}

