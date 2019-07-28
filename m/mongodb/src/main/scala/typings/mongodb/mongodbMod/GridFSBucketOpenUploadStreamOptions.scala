package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketOpenUploadStreamOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
}

object GridFSBucketOpenUploadStreamOptions {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    chunkSizeBytes: Int | scala.Double = null,
    contentType: String = null,
    metadata: js.Object = null
  ): GridFSBucketOpenUploadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[GridFSBucketOpenUploadStreamOptions]
  }
}

