package typings.multerGridfsStorage.mod.global.Express.Multer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var bucketName: String = js.native
  var chunkSize: Double = js.native
  var contentType: String = js.native
  var filename: String = js.native
  var id: js.Any = js.native
  var md5: String = js.native
  var metadata: js.Any = js.native
  var size: Double = js.native
  var uploadDate: Date = js.native
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
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDate(value: Date): Self = this.set("uploadDate", value.asInstanceOf[js.Any])
  }
  
}

