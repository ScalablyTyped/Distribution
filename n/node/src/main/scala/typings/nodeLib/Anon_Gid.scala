package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  var gid: scala.Double
  var homedir: java.lang.String
  var shell: js.Any
  var uid: scala.Double
  var username: java.lang.String
}

object Anon_Gid {
  @scala.inline
  def apply(
    gid: scala.Double,
    homedir: java.lang.String,
    shell: js.Any,
    uid: scala.Double,
    username: java.lang.String
  ): Anon_Gid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("homedir")(homedir)
    __obj.updateDynamic("shell")(shell)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Gid]
  }
}

