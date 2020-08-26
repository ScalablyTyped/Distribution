package typings.mocBetterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupOptions extends js.Object {
  def progress(info: BackupMetadata): Double = js.native
}

object BackupOptions {
  @scala.inline
  def apply(progress: BackupMetadata => Double): BackupOptions = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
    __obj.asInstanceOf[BackupOptions]
  }
  @scala.inline
  implicit class BackupOptionsOps[Self <: BackupOptions] (val x: Self) extends AnyVal {
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
    def setProgress(value: BackupMetadata => Double): Self = this.set("progress", js.Any.fromFunction1(value))
  }
  
}

