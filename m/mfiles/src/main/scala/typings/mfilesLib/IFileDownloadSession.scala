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
    val __obj = js.Dynamic.literal(DownloadID = DownloadID, FileSize = FileSize, FileSize32 = FileSize32)
  
    __obj.asInstanceOf[IFileDownloadSession]
  }
}

