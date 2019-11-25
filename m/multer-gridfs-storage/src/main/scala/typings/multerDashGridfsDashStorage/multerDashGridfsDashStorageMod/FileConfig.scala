package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var bucketName: js.UndefOr[String] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var disableMD5: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
}

object FileConfig {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    bucketName: String = null,
    chunkSize: Int | Double = null,
    contentType: String = null,
    disableMD5: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    id: js.Any = null,
    metadata: js.Object = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMD5)) __obj.updateDynamic("disableMD5")(disableMD5.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
}

