package typings.ol.webglHelperMod

import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferCacheEntry extends js.Object {
  var buffer: typings.ol.webglBufferMod.default
  var webGlBuffer: WebGLBuffer
}

object BufferCacheEntry {
  @scala.inline
  def apply(buffer: typings.ol.webglBufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferCacheEntry]
  }
}

