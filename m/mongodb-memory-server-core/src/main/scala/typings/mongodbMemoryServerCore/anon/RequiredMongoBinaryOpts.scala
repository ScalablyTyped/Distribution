package typings.mongodbMemoryServerCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoBinary.MongoBinaryOpts> */
@js.native
trait RequiredMongoBinaryOpts extends js.Object {
  var arch: String = js.native
  var downloadDir: String = js.native
  var platform: String = js.native
  var version: String = js.native
}

object RequiredMongoBinaryOpts {
  @scala.inline
  def apply(arch: String, downloadDir: String, platform: String, version: String): RequiredMongoBinaryOpts = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], downloadDir = downloadDir.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredMongoBinaryOpts]
  }
  @scala.inline
  implicit class RequiredMongoBinaryOptsOps[Self <: RequiredMongoBinaryOpts] (val x: Self) extends AnyVal {
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadDir(value: String): Self = this.set("downloadDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

