package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDownloadSession extends js.Object {
  val DownloadID: Double
  val FileSize: Double
  val FileSize32: Double
}

object IFileDownloadSession {
  @scala.inline
  def apply(DownloadID: Double, FileSize: Double, FileSize32: Double): IFileDownloadSession = {
    val __obj = js.Dynamic.literal(DownloadID = DownloadID.asInstanceOf[js.Any], FileSize = FileSize.asInstanceOf[js.Any], FileSize32 = FileSize32.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadSession]
  }
}

