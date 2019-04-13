package typings
package minioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minioMod {
  type ItemBucketMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NoResultCallback = js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - minioLib.minioLibStrings.`us-east-1`
    - minioLib.minioLibStrings.`us-west-1`
    - minioLib.minioLibStrings.`us-west-2`
    - minioLib.minioLibStrings.`eu-west-1`
    - minioLib.minioLibStrings.`eu-central-1`
    - minioLib.minioLibStrings.`ap-southeast-1`
    - minioLib.minioLibStrings.`ap-northeast-1`
    - minioLib.minioLibStrings.`ap-southeast-2`
    - minioLib.minioLibStrings.`sa-east-1`
    - minioLib.minioLibStrings.`cn-north-1`
    - java.lang.String
  */
  type Region = _Region | java.lang.String
  type ResultCallback[T] = js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ T, scala.Unit]
}
