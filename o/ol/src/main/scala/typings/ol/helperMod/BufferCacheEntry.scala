package typings.ol.helperMod

import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferCacheEntry extends js.Object {
  
  var buffer: typings.ol.bufferMod.default = js.native
  
  var webGlBuffer: WebGLBuffer = js.native
}
object BufferCacheEntry {
  
  @scala.inline
  def apply(buffer: typings.ol.bufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferCacheEntry]
  }
  
  @scala.inline
  implicit class BufferCacheEntryOps[Self <: BufferCacheEntry] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: typings.ol.bufferMod.default): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebGlBuffer(value: WebGLBuffer): Self = this.set("webGlBuffer", value.asInstanceOf[js.Any])
  }
}
