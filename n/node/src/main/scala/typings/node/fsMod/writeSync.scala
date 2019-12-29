package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "writeSync")
@js.native
object writeSync extends js.Object {
  /**
    * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  /**
    * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def apply(fd: Double, string: js.Any): Double = js.native
  def apply(fd: Double, string: js.Any, position: Double): Double = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): Double = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): Double = js.native
}

