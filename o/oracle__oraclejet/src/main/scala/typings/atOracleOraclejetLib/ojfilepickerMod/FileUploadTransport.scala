package typings
package atOracleOraclejetLib.ojfilepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadTransport extends js.Object {
  def flush(): scala.Unit
  def queue(fileList: stdLib.FileList): js.Array[atOracleOraclejetLib.ojprogresslistMod.ProgressItem]
}

object FileUploadTransport {
  @scala.inline
  def apply(
    flush: () => scala.Unit,
    queue: stdLib.FileList => js.Array[atOracleOraclejetLib.ojprogresslistMod.ProgressItem]
  ): FileUploadTransport = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), queue = js.Any.fromFunction1(queue))
  
    __obj.asInstanceOf[FileUploadTransport]
  }
}

