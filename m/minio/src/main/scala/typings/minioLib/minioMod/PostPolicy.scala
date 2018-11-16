package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "PostPolicy")
@js.native
class PostPolicy () extends js.Object {
  def setBucket(bucketName: java.lang.String): scala.Unit = js.native
  def setContentLengthRange(min: scala.Double, max: scala.Double): scala.Unit = js.native
  def setContentType(`type`: java.lang.String): scala.Unit = js.native
  def setExpires(date: stdLib.Date): scala.Unit = js.native
  def setKey(objectName: java.lang.String): scala.Unit = js.native
  def setKeyStartsWith(prefix: java.lang.String): scala.Unit = js.native
}

