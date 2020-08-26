package typings.poi.mod.ConfigLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var files: js.UndefOr[js.Array[String]] = js.native
  var packageKey: js.UndefOr[String] = js.native
  var parseJSON: js.UndefOr[js.Function1[/* str */ String, _]] = js.native
  var stopDir: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setPackageKey(value: String): Self = this.set("packageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageKey: Self = this.set("packageKey", js.undefined)
    @scala.inline
    def setParseJSON(value: /* str */ String => _): Self = this.set("parseJSON", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseJSON: Self = this.set("parseJSON", js.undefined)
    @scala.inline
    def setStopDir(value: String): Self = this.set("stopDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopDir: Self = this.set("stopDir", js.undefined)
  }
  
}

