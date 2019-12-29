package typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod

import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.aix
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.android
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.cygwin
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.darwin
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.freebsd
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.linux
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.openbsd
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.sunos
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.OtherOS
  - typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.LinuxOS
*/
trait AnyOS extends js.Object

object AnyOS {
  @scala.inline
  def OtherOS(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): AnyOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnyOS]
  }
  @scala.inline
  def LinuxOS(dist: String, os: linux, release: String, codename: String = null): AnyOS = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOS]
  }
}

