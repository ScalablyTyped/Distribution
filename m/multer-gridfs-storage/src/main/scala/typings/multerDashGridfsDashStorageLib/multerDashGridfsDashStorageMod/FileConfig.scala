package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bucketName: js.UndefOr[java.lang.String] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var disableMD5: js.UndefOr[scala.Boolean] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
}

object FileConfig {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    bucketName: java.lang.String = null,
    chunkSize: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    disableMD5: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    id: js.Any = null,
    metadata: js.Object = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(disableMD5)) __obj.updateDynamic("disableMD5")(disableMD5)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[FileConfig]
  }
}

