package typings.minio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemBucketMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NoResultCallback = js.Function1[/* error */ typings.std.Error | scala.Null, scala.Unit]
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
  type Region = typings.minio.mod._Region | java.lang.String
  type ResultCallback[T] = js.Function2[/* error */ typings.std.Error | scala.Null, /* result */ T, scala.Unit]
}
