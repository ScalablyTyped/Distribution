package typings.mongodbMemoryServerCore.getosMod

import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodbMemoryServerCore.getosMod.AnyOS because Already inherited */ @js.native
trait LinuxOS extends OtherOS {
  var codename: js.UndefOr[String] = js.native
  var dist: String = js.native
  @JSName("os")
  var os_LinuxOS: linux = js.native
  var release: String = js.native
}

object LinuxOS {
  @scala.inline
  def apply(dist: String, os: linux, release: String): LinuxOS = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxOS]
  }
  @scala.inline
  implicit class LinuxOSOps[Self <: LinuxOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDist(value: String): Self = this.set("dist", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: linux): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodename(value: String): Self = this.set("codename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodename: Self = this.set("codename", js.undefined)
  }
  
}

