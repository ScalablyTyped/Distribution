package typings.nodeStreamZip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipEntry extends js.Object {
  
  /**
    * external file attributes
    */
  var attr: Double = js.native
  
  /**
    * file comment
    */
  var comment: String = js.native
  
  /**
    * compressed size
    */
  var compressedSize: Double = js.native
  
  /**
    * uncompressed file crc-32 value
    */
  var crc: Double = js.native
  
  /**
    * volume number start
    */
  var diskStart: Double = js.native
  
  /**
    * if the file is encrypted
    */
  var encrypted: Boolean = js.native
  
  /**
    * encrypt, decrypt flags
    */
  var flags: Double = js.native
  
  /**
    * internal file attributes
    */
  var inattr: Double = js.native
  
  /**
    * true if it's a directory entry
    */
  var isDirectory: Boolean = js.native
  
  /**
    * true if it's a file entry, see also isDirectory
    */
  var isFile: Boolean = js.native
  
  /**
    * compression method
    */
  var method: Double = js.native
  
  /**
    * file name
    */
  var name: String = js.native
  
  /**
    * LOC header offset
    */
  var offset: Double = js.native
  
  /**
    * uncompressed size
    */
  var size: Double = js.native
  
  /**
    * modification time
    */
  var time: Double = js.native
  
  /**
    * version made by
    */
  var verMade: Double = js.native
  
  /**
    * version needed to extract
    */
  var version: Double = js.native
}
object ZipEntry {
  
  @scala.inline
  def apply(
    attr: Double,
    comment: String,
    compressedSize: Double,
    crc: Double,
    diskStart: Double,
    encrypted: Boolean,
    flags: Double,
    inattr: Double,
    isDirectory: Boolean,
    isFile: Boolean,
    method: Double,
    name: String,
    offset: Double,
    size: Double,
    time: Double,
    verMade: Double,
    version: Double
  ): ZipEntry = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compressedSize = compressedSize.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], inattr = inattr.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], verMade = verMade.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipEntry]
  }
  
  @scala.inline
  implicit class ZipEntryOps[Self <: ZipEntry] (val x: Self) extends AnyVal {
    
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
    def setAttr(value: Double): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedSize(value: Double): Self = this.set("compressedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc(value: Double): Self = this.set("crc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskStart(value: Double): Self = this.set("diskStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInattr(value: Double): Self = this.set("inattr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Double): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerMade(value: Double): Self = this.set("verMade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
