package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends StatusData {
  var bugfix: String
  var major: String
  var minor: String
  var version: String
}

object VersionData {
  @scala.inline
  def apply(bugfix: String, major: String, minor: String, version: String, server: String = null): VersionData = {
    val __obj = js.Dynamic.literal(bugfix = bugfix.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionData]
  }
}

