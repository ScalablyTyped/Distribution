package typings.multerS3.mod._Global_.Express.MulterS3

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File
  extends typings.multer.mod._Global_.Express.Multer.File {
  var acl: String
  var bucket: String
  var contentDisposition: Null
  var contentType: String
  var etag: String
  var key: String
  var location: String
  var metadata: js.Any
  var serverSideEncryption: Null
  var storageClass: String
}

object File {
  @scala.inline
  def apply(
    acl: String,
    bucket: String,
    buffer: Buffer,
    contentDisposition: Null,
    contentType: String,
    destination: String,
    encoding: String,
    etag: String,
    fieldname: String,
    filename: String,
    key: String,
    location: String,
    metadata: js.Any,
    mimetype: String,
    originalname: String,
    path: String,
    serverSideEncryption: Null,
    size: Double,
    storageClass: String,
    stream: Readable
  ): File = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

