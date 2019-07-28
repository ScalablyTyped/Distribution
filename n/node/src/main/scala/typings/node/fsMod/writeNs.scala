package typings.node.fsMod

import typings.node.Anon_BufferBytesWritten
import typings.node.Anon_BufferBytesWrittenFloat32Array
import typings.node.Anon_BufferBytesWrittenFloat64Array
import typings.node.Anon_BufferBytesWrittenInt16Array
import typings.node.Anon_BufferBytesWrittenInt32Array
import typings.node.Anon_BufferBytesWrittenInt8Array
import typings.node.Anon_BufferBytesWrittenNumber
import typings.node.Anon_BufferBytesWrittenNumberString
import typings.node.Anon_BufferBytesWrittenNumberUint16Array
import typings.node.Anon_BufferBytesWrittenNumberUint32Array
import typings.node.Anon_BufferBytesWrittenNumberUint8ClampedArray
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "write")
@js.native
object writeNs extends js.Object {
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def __promisify__(fd: Double): js.Promise[Anon_BufferBytesWritten] = js.native
  def __promisify__(fd: Double, buffer: DataView): js.Promise[Anon_BufferBytesWritten] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double): js.Promise[Anon_BufferBytesWritten] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[Anon_BufferBytesWritten] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWritten] = js.native
  def __promisify__(fd: Double, buffer: Float32Array): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def __promisify__(fd: Double, string: js.Any): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def __promisify__(fd: Double, string: js.Any, position: Double): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def __promisify__(fd: Double, string: js.Any, position: Double, encoding: java.lang.String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def __promisify__(fd: Double, string: js.Any, position: Null, encoding: java.lang.String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
}

