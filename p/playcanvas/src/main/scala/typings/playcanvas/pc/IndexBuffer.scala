package typings.playcanvas.pc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  // The buffer is marked as static, hinting that the buffer will never be modified
  var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param graphicsDevice - The graphics device used to manage this index buffer.
  * @param format - The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param numIndices - The number of indices to be stored in the index buffer.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
  */
trait IndexBuffer extends js.Object {
  /**
    * Frees resources associated with this index buffer.
    */
  def destroy(): Unit
  /**
    * Returns the data format of the specified index buffer.
    * @returns The data format of the specified index buffer (see pc.INDEXFORMAT_*).
    */
  def getFormat(): Double
  /**
    * Returns the number of indices stored in the specified index buffer.
    * @returns The number of indices stored in the specified index buffer.
    */
  def getNumIndices(): Double
  /**
    * Gives access to the block of memory that stores the buffer's indices.
    * @returns A contiguous block of memory where index data can be written to.
    */
  def lock(): ArrayBuffer
  /**
    * Signals that the block of memory returned by a call to the lock function is
    ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    currently active device.
    */
  def unlock(): Unit
}

object IndexBuffer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getFormat: () => Double,
    getNumIndices: () => Double,
    lock: () => ArrayBuffer,
    unlock: () => Unit
  ): IndexBuffer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormat = js.Any.fromFunction0(getFormat), getNumIndices = js.Any.fromFunction0(getNumIndices), lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[IndexBuffer]
  }
}

