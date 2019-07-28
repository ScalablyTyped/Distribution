package typings.multerDashS3.multerDashS3Mod.Global.ExpressNs.MulterS3Ns

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File
  extends typings.multer.multerMod.Global.ExpressNs.MulterNs.File {
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
    storageClass: String
  ): File = {
    val __obj = js.Dynamic.literal(acl = acl, bucket = bucket, buffer = buffer, contentDisposition = contentDisposition, contentType = contentType, destination = destination, encoding = encoding, etag = etag, fieldname = fieldname, filename = filename, key = key, location = location, metadata = metadata, mimetype = mimetype, originalname = originalname, path = path, serverSideEncryption = serverSideEncryption, size = size, storageClass = storageClass)
  
    __obj.asInstanceOf[File]
  }
}

