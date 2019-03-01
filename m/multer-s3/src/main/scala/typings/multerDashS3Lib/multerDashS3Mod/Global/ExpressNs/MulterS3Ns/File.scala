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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acl")(acl)
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("contentDisposition")(contentDisposition)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("destination")(destination)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("fieldname")(fieldname)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("mimetype")(mimetype)
    __obj.updateDynamic("originalname")(originalname)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[File]
  }
}

