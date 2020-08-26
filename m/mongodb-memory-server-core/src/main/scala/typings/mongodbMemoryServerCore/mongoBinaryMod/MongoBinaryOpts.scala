package typings.mongodbMemoryServerCore.mongoBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryOpts extends js.Object {
  var arch: js.UndefOr[String] = js.native
  var downloadDir: js.UndefOr[String] = js.native
  var platform: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object MongoBinaryOpts {
  @scala.inline
  def apply(): MongoBinaryOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoBinaryOpts]
  }
  @scala.inline
  implicit class MongoBinaryOptsOps[Self <: MongoBinaryOpts] (val x: Self) extends AnyVal {
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
    def deleteArch: Self = this.set("arch", js.undefined)
    @scala.inline
    def setDownloadDir(value: String): Self = this.set("downloadDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadDir: Self = this.set("downloadDir", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

