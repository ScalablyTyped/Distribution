package typings.parseDataUrl.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataUrl extends js.Object {
  
  var base64: Boolean = js.native
  
  var charset: String = js.native
  
  var contentType: String = js.native
  
  var data: String = js.native
  
  var mediaType: String = js.native
  
  def toBuffer(): Buffer = js.native
}
object DataUrl {
  
  @scala.inline
  def apply(
    base64: Boolean,
    charset: String,
    contentType: String,
    data: String,
    mediaType: String,
    toBuffer: () => Buffer
  ): DataUrl = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[DataUrl]
  }
  
  @scala.inline
  implicit class DataUrlOps[Self <: DataUrl] (val x: Self) extends AnyVal {
    
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
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
  }
}
