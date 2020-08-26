package typings.mocBetterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupMetadata extends js.Object {
  var remainingPages: Double = js.native
  var totalPages: Double = js.native
}

object BackupMetadata {
  @scala.inline
  def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
    val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupMetadata]
  }
  @scala.inline
  implicit class BackupMetadataOps[Self <: BackupMetadata] (val x: Self) extends AnyVal {
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
    def setRemainingPages(value: Double): Self = this.set("remainingPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
  }
  
}

