package typings.nodePgMigrate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilenameFormat extends js.Object {
  var filenameFormat: js.UndefOr[typings.nodePgMigrate.migrationMod.FilenameFormat] = js.native
}

object FilenameFormat {
  @scala.inline
  def apply(): FilenameFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilenameFormat]
  }
  @scala.inline
  implicit class FilenameFormatOps[Self <: FilenameFormat] (val x: Self) extends AnyVal {
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
    def setFilenameFormat(value: typings.nodePgMigrate.migrationMod.FilenameFormat): Self = this.set("filenameFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameFormat: Self = this.set("filenameFormat", js.undefined)
  }
  
}

