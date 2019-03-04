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
    flush: js.Function0[scala.Unit],
    queue: js.Function1[stdLib.FileList, js.Array[atOracleOraclejetLib.ojprogresslistMod.ProgressItem]]
  ): FileUploadTransport = {
    val __obj = js.Dynamic.literal(flush = flush, queue = queue)
  
    __obj.asInstanceOf[FileUploadTransport]
  }
}

