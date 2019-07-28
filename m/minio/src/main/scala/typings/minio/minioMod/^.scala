package typings.minio.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ObjectCreatedAll: String = js.native
  val ObjectCreatedCompleteMultipartUpload: String = js.native
  val ObjectCreatedCopy: String = js.native
  val ObjectCreatedPost: String = js.native
  val ObjectCreatedPut: String = js.native
  val ObjectReducedRedundancyLostObject: String = js.native
  val ObjectRemovedAll: String = js.native
  val ObjectRemovedDelete: String = js.native
  val ObjectRemovedDeleteMarkerCreated: String = js.native
  def buildARN(partition: String, service: String, region: String, accountId: String, resource: String): String = js.native
}

