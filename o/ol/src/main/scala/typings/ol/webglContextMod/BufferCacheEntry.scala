package typings.ol.webglContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferCacheEntry extends js.Object {
  var buf: typings.ol.webglBufferMod.default
  var buffer: typings.ol.webglBufferMod.default
}

object BufferCacheEntry {
  @scala.inline
  def apply(buf: typings.ol.webglBufferMod.default, buffer: typings.ol.webglBufferMod.default): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buf = buf, buffer = buffer)
  
    __obj.asInstanceOf[BufferCacheEntry]
  }
}

