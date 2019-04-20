package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketOptions extends js.Object {
  var bucketName: js.UndefOr[java.lang.String] = js.undefined
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object GridFSBucketOptions {
  @scala.inline
  def apply(
    bucketName: java.lang.String = null,
    chunkSizeBytes: scala.Int | scala.Double = null,
    readPreference: ReadPreference | java.lang.String = null,
    writeConcern: WriteConcern = null
  ): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern)
    __obj.asInstanceOf[GridFSBucketOptions]
  }
}

