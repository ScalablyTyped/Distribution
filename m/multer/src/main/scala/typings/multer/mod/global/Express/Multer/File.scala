package typings.multer.mod.global.Express.Multer

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing file metadata and access information. */
trait File extends js.Object {
  /** `MemoryStorage` only: A Buffer containing the entire file. */
  var buffer: Buffer
  /** `DiskStorage` only: Directory to which this file has been uploaded. */
  var destination: String
  /**
    * Value of the `Content-Transfer-Encoding` header for this file.
    * @deprecated since July 2015
    * @see RFC 7578, Section 4.7
    */
  var encoding: String
  /** Name of the form field associated with this file. */
  var fieldname: String
  /** `DiskStorage` only: Name of this file within `destination`. */
  var filename: String
  /** Value of the `Content-Type` header for this file. */
  var mimetype: String
  /** Name of the file on the uploader's computer. */
  var originalname: String
  /** `DiskStorage` only: Full path to the uploaded file. */
  var path: String
  /** Size of the file in bytes. */
  var size: Double
  /**
    * A readable stream of this file. Only available to the `_handleFile`
    * callback for custom `StorageEngine`s.
    */
  var stream: Readable
}

object File {
  @scala.inline
  def apply(
    buffer: Buffer,
    destination: String,
    encoding: String,
    fieldname: String,
    filename: String,
    mimetype: String,
    originalname: String,
    path: String,
    size: Double,
    stream: Readable
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

