package typings.multer.mod.global.Express.Multer

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing file metadata and access information. */
@js.native
trait File extends js.Object {
  
  /** `MemoryStorage` only: A Buffer containing the entire file. */
  var buffer: Buffer = js.native
  
  /** `DiskStorage` only: Directory to which this file has been uploaded. */
  var destination: String = js.native
  
  /**
    * Value of the `Content-Transfer-Encoding` header for this file.
    * @deprecated since July 2015
    * @see RFC 7578, Section 4.7
    */
  var encoding: String = js.native
  
  /** Name of the form field associated with this file. */
  var fieldname: String = js.native
  
  /** `DiskStorage` only: Name of this file within `destination`. */
  var filename: String = js.native
  
  /** Value of the `Content-Type` header for this file. */
  var mimetype: String = js.native
  
  /** Name of the file on the uploader's computer. */
  var originalname: String = js.native
  
  /** `DiskStorage` only: Full path to the uploaded file. */
  var path: String = js.native
  
  /** Size of the file in bytes. */
  var size: Double = js.native
  
  /**
    * A readable stream of this file. Only available to the `_handleFile`
    * callback for custom `StorageEngine`s.
    */
  var stream: Readable = js.native
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
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldname(value: String): Self = this.set("fieldname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalname(value: String): Self = this.set("originalname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: Readable): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
