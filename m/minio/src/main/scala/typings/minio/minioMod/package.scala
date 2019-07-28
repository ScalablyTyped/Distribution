package typings.minio

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minioMod {
  type ItemBucketMetadata = StringDictionary[js.Any]
  type NoResultCallback = js.Function1[/* error */ Error | Null, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.minio.minioStrings.`us-east-1`
    - typings.minio.minioStrings.`us-west-1`
    - typings.minio.minioStrings.`us-west-2`
    - typings.minio.minioStrings.`eu-west-1`
    - typings.minio.minioStrings.`eu-central-1`
    - typings.minio.minioStrings.`ap-southeast-1`
    - typings.minio.minioStrings.`ap-northeast-1`
    - typings.minio.minioStrings.`ap-southeast-2`
    - typings.minio.minioStrings.`sa-east-1`
    - typings.minio.minioStrings.`cn-north-1`
    - java.lang.String
  */
  type Region = _Region | String
  type ResultCallback[T] = js.Function2[/* error */ Error | Null, /* result */ T, Unit]
}
