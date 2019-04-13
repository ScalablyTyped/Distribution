package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends StatusData {
  var bugfix: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var version: java.lang.String
}

object VersionData {
  @scala.inline
  def apply(
    bugfix: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    version: java.lang.String,
    server: java.lang.String = null
  ): VersionData = {
    val __obj = js.Dynamic.literal(bugfix = bugfix, major = major, minor = minor, version = version)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[VersionData]
  }
}

