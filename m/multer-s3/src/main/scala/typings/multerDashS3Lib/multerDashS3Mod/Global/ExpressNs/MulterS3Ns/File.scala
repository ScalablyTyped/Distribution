package typings
package multerDashS3Lib.multerDashS3Mod.Global.ExpressNs.MulterS3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File
  extends multerLib.multerMod.Global.ExpressNs.MulterNs.File {
  var acl: java.lang.String
  var bucket: java.lang.String
  var contentDisposition: scala.Null
  var contentType: java.lang.String
  var etag: java.lang.String
  var key: java.lang.String
  var location: java.lang.String
  var metadata: js.Any
  var serverSideEncryption: scala.Null
  var storageClass: java.lang.String
}

object File {
  @scala.inline
  def apply(
    acl: java.lang.String,
    bucket: java.lang.String,
    buffer: nodeLib.Buffer,
    contentDisposition: scala.Null,
    contentType: java.lang.String,
    destination: java.lang.String,
    encoding: java.lang.String,
    etag: java.lang.String,
    fieldname: java.lang.String,
    filename: java.lang.String,
    key: java.lang.String,
    location: java.lang.String,
    metadata: js.Any,
    mimetype: java.lang.String,
    originalname: java.lang.String,
    path: java.lang.String,
    serverSideEncryption: scala.Null,
    size: scala.Double,
    storageClass: java.lang.String
  ): File = {
    val __obj = js.Dynamic.literal(acl = acl, bucket = bucket, buffer = buffer, contentDisposition = contentDisposition, contentType = contentType, destination = destination, encoding = encoding, etag = etag, fieldname = fieldname, filename = filename, key = key, location = location, metadata = metadata, mimetype = mimetype, originalname = originalname, path = path, serverSideEncryption = serverSideEncryption, size = size, storageClass = storageClass)
  
    __obj.asInstanceOf[File]
  }
}

