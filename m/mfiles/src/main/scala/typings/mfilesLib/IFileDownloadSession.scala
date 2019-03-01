package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDownloadSession extends js.Object {
  val DownloadID: scala.Double
  val FileSize: scala.Double
  val FileSize32: scala.Double
}

object IFileDownloadSession {
  @scala.inline
  def apply(DownloadID: scala.Double, FileSize: scala.Double, FileSize32: scala.Double): IFileDownloadSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DownloadID")(DownloadID)
    __obj.updateDynamic("FileSize")(FileSize)
    __obj.updateDynamic("FileSize32")(FileSize32)
    __obj.asInstanceOf[IFileDownloadSession]
  }
}

