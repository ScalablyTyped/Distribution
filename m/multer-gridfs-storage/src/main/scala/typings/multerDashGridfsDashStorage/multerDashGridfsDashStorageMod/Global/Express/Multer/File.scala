package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod.Global.Express.Multer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var bucketName: String
  var chunkSize: Double
  var contentType: String
  var filename: String
  var id: js.Any
  var md5: String
  var metadata: js.Any
  var size: Double
  var uploadDate: Date
}

object File {
  @scala.inline
  def apply(
    bucketName: String,
    chunkSize: Double,
    contentType: String,
    filename: String,
    id: js.Any,
    md5: String,
    metadata: js.Any,
    size: Double,
    uploadDate: Date
  ): File = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, chunkSize = chunkSize, contentType = contentType, filename = filename, id = id, md5 = md5, metadata = metadata, size = size, uploadDate = uploadDate)
  
    __obj.asInstanceOf[File]
  }
}

