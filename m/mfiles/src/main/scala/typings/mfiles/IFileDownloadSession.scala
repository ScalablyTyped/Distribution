package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileDownloadSession extends js.Object {
  val DownloadID: Double = js.native
  val FileSize: Double = js.native
  val FileSize32: Double = js.native
}

object IFileDownloadSession {
  @scala.inline
  def apply(DownloadID: Double, FileSize: Double, FileSize32: Double): IFileDownloadSession = {
    val __obj = js.Dynamic.literal(DownloadID = DownloadID.asInstanceOf[js.Any], FileSize = FileSize.asInstanceOf[js.Any], FileSize32 = FileSize32.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadSession]
  }
  @scala.inline
  implicit class IFileDownloadSessionOps[Self <: IFileDownloadSession] (val x: Self) extends AnyVal {
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
    def setDownloadID(value: Double): Self = this.set("DownloadID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("FileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize32(value: Double): Self = this.set("FileSize32", value.asInstanceOf[js.Any])
  }
  
}

