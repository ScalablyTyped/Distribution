package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo[T] extends js.Object {
  var gid: scala.Double
  var homedir: T
  var shell: T
  var uid: scala.Double
  var username: T
}

object UserInfo {
  @scala.inline
  def apply[T](gid: scala.Double, homedir: T, shell: T, uid: scala.Double, username: T): UserInfo[T] = {
    val __obj = js.Dynamic.literal(gid = gid, homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid, username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo[T]]
  }
}

