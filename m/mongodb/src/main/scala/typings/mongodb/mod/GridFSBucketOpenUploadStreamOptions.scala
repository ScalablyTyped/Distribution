package typings.mongodb.mod

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
    chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined,
    contentType: String = null,
    metadata: js.Object = null
  ): GridFSBucketOpenUploadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSizeBytes)) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketOpenUploadStreamOptions]
  }
}

