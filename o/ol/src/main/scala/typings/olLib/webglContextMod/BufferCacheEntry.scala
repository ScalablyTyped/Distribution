package typings
package olLib.webglContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferCacheEntry extends js.Object {
  var buf: olLib.webglBufferMod.default
  var buffer: olLib.webglBufferMod.default
}

object BufferCacheEntry {
  @scala.inline
  def apply(buf: olLib.webglBufferMod.default, buffer: olLib.webglBufferMod.default): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buf = buf, buffer = buffer)
  
    __obj.asInstanceOf[BufferCacheEntry]
  }
}

