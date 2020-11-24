package typings.multer.anon

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<multer.multer.<global>.Express.Multer.File> */
@js.native
trait PartialFile extends js.Object {
  
  var buffer: js.UndefOr[Buffer] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var fieldname: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var mimetype: js.UndefOr[String] = js.native
  
  var originalname: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var stream: js.UndefOr[Readable] = js.native
}
object PartialFile {
  
  @scala.inline
  def apply(): PartialFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFile]
  }
  
  @scala.inline
  implicit class PartialFileOps[Self <: PartialFile] (val x: Self) extends AnyVal {
    
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
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFieldname(value: String): Self = this.set("fieldname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldname: Self = this.set("fieldname", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimetype: Self = this.set("mimetype", js.undefined)
    
    @scala.inline
    def setOriginalname(value: String): Self = this.set("originalname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalname: Self = this.set("originalname", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStream(value: Readable): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
