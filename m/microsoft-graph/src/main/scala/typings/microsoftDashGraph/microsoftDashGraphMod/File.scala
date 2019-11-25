package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  // Hashes of the file's binary content, if available. Read-only.
  var hashes: js.UndefOr[Hashes] = js.undefined
  /**
    * The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file
    * was uploaded. Read-only.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  var processingMetadata: js.UndefOr[Boolean] = js.undefined
}

object File {
  @scala.inline
  def apply(
    hashes: Hashes = null,
    mimeType: String = null,
    processingMetadata: js.UndefOr[Boolean] = js.undefined
  ): File = {
    val __obj = js.Dynamic.literal()
    if (hashes != null) __obj.updateDynamic("hashes")(hashes.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(processingMetadata)) __obj.updateDynamic("processingMetadata")(processingMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

