package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "CopyConditions")
@js.native
class CopyConditions () extends js.Object {
  def setMatchETag(etag: java.lang.String): scala.Unit = js.native
  def setMatchETagExcept(etag: java.lang.String): scala.Unit = js.native
  def setModified(date: stdLib.Date): scala.Unit = js.native
  def setUnmodified(date: stdLib.Date): scala.Unit = js.native
}

