package typings.oracleOraclejet.ojfilepickerMod

import typings.oracleOraclejet.ojprogresslistMod.ProgressItem
import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadTransport extends js.Object {
  def flush(): Unit
  def queue(fileList: FileList): js.Array[ProgressItem]
}

object FileUploadTransport {
  @scala.inline
  def apply(flush: () => Unit, queue: FileList => js.Array[ProgressItem]): FileUploadTransport = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), queue = js.Any.fromFunction1(queue))
  
    __obj.asInstanceOf[FileUploadTransport]
  }
}

