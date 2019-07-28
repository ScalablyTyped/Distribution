package typings.minio.minioMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "CopyConditions")
@js.native
class CopyConditions () extends js.Object {
  def setMatchETag(etag: String): Unit = js.native
  def setMatchETagExcept(etag: String): Unit = js.native
  def setModified(date: Date): Unit = js.native
  def setUnmodified(date: Date): Unit = js.native
}

