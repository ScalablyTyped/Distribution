package typings.mongodbMemoryServerCore.getosMod

import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodbMemoryServerCore.getosMod.AnyOS because Already inherited */ trait LinuxOS extends OtherOS {
  var codename: js.UndefOr[String] = js.undefined
  var dist: String
  @JSName("os")
  var os_LinuxOS: linux
  var release: String
}

object LinuxOS {
  @scala.inline
  def apply(dist: String, os: linux, release: String, codename: String = null): LinuxOS = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxOS]
  }
}

