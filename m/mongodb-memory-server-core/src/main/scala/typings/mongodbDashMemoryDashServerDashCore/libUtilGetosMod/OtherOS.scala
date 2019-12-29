package typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod

import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.aix
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.android
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.cygwin
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.darwin
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.freebsd
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.openbsd
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.sunos
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOS extends AnyOS {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String
}

object OtherOS {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOS]
  }
}

