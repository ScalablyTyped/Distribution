package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ObjectCreatedAll: java.lang.String = js.native
  val ObjectCreatedCompleteMultipartUpload: java.lang.String = js.native
  val ObjectCreatedCopy: java.lang.String = js.native
  val ObjectCreatedPost: java.lang.String = js.native
  val ObjectCreatedPut: java.lang.String = js.native
  val ObjectReducedRedundancyLostObject: java.lang.String = js.native
  val ObjectRemovedAll: java.lang.String = js.native
  val ObjectRemovedDelete: java.lang.String = js.native
  val ObjectRemovedDeleteMarkerCreated: java.lang.String = js.native
  def buildARN(
    partition: java.lang.String,
    service: java.lang.String,
    region: java.lang.String,
    accountId: java.lang.String,
    resource: java.lang.String
  ): java.lang.String = js.native
}

