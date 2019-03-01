package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketOptions extends js.Object {
  var ReadPreference: js.UndefOr[js.Object] = js.undefined
  var bucketName: js.UndefOr[java.lang.String] = js.undefined
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  var writeConcern: js.UndefOr[js.Object] = js.undefined
}

object GridFSBucketOptions {
  @scala.inline
  def apply(
    ReadPreference: js.Object = null,
    bucketName: java.lang.String = null,
    chunkSizeBytes: scala.Int | scala.Double = null,
    writeConcern: js.Object = null
  ): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (ReadPreference != null) __obj.updateDynamic("ReadPreference")(ReadPreference)
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern)
    __obj.asInstanceOf[GridFSBucketOptions]
  }
}

