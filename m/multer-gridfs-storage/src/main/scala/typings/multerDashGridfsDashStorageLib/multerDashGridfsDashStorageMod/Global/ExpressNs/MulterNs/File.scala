package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var bucketName: java.lang.String
  var chunkSize: scala.Double
  var contentType: java.lang.String
  var filename: java.lang.String
  var id: js.Any
  var md5: java.lang.String
  var metadata: js.Any
  var size: scala.Double
  var uploadDate: stdLib.Date
}

object File {
  @scala.inline
  def apply(
    bucketName: java.lang.String,
    chunkSize: scala.Double,
    contentType: java.lang.String,
    filename: java.lang.String,
    id: js.Any,
    md5: java.lang.String,
    metadata: js.Any,
    size: scala.Double,
    uploadDate: stdLib.Date
  ): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName)
    __obj.updateDynamic("chunkSize")(chunkSize)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("md5")(md5)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uploadDate")(uploadDate)
    __obj.asInstanceOf[File]
  }
}

