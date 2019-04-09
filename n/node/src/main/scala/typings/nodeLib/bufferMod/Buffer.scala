package typings
package nodeLib.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "Buffer")
@js.native
class Buffer protected ()
  extends nodeLib.Buffer {
  def this(arrayBuffer: nodeLib.SharedArrayBuffer) = this()
  /**
    * Produces a Buffer backed by the same allocated memory as
    * the given {ArrayBuffer}/{SharedArrayBuffer}.
    *
    *
    * @param arrayBuffer The ArrayBuffer with which to share memory.
    * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
    */
  def this(arrayBuffer: stdLib.ArrayBuffer) = this()
  /**
    * Allocates a new buffer containing the given {array} of octets.
    *
    * @param array The octets to store.
    * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
    */
  def this(array: js.Array[_]) = this()
  /**
    * Allocates a new buffer containing the given {array} of octets.
    *
    * @param array The octets to store.
    * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
    */
  def this(array: stdLib.Uint8Array) = this()
  /**
    * Copies the passed {buffer} data onto a new {Buffer} instance.
    *
    * @param buffer The buffer to copy.
    * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
    */
  def this(buffer: nodeLib.Buffer) = this()
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
    */
  def this(size: scala.Double) = this()
  /**
    * Allocates a new buffer containing the given {str}.
    *
    * @param str String to store in buffer.
    * @param encoding encoding to use, optional.  Default is 'utf8'
    * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
    */
  def this(str: java.lang.String) = this()
  def this(str: java.lang.String, encoding: nodeLib.BufferEncoding) = this()
}

