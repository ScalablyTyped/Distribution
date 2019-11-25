package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod._Global_.Express.Multer

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
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

