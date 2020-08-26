package typings.playcanvas.pc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  * // The buffer is marked as static, hinting that the buffer will never be modified
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param graphicsDevice - The graphics device used to manage this index buffer.
  * @param format - The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param numIndices - The number of indices to be stored in the index buffer.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
  */
@js.native
trait IndexBuffer extends js.Object {
  /**
    * Frees resources associated with this index buffer.
    */
  def destroy(): Unit = js.native
  /**
    * Returns the data format of the specified index buffer.
    * @returns The data format of the specified index buffer (see pc.INDEXFORMAT_*).
    */
  def getFormat(): Double = js.native
  /**
    * Returns the number of indices stored in the specified index buffer.
    * @returns The number of indices stored in the specified index buffer.
    */
  def getNumIndices(): Double = js.native
  /**
    * Gives access to the block of memory that stores the buffer's indices.
    * @returns A contiguous block of memory where index data can be written to.
    */
  def lock(): ArrayBuffer = js.native
  /**
    * Signals that the block of memory returned by a call to the lock function is
    * ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    * currently active device.
    */
  def unlock(): Unit = js.native
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
  @scala.inline
  implicit class IndexBufferOps[Self <: IndexBuffer] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFormat(value: () => Double): Self = this.set("getFormat", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumIndices(value: () => Double): Self = this.set("getNumIndices", js.Any.fromFunction0(value))
    @scala.inline
    def setLock(value: () => ArrayBuffer): Self = this.set("lock", js.Any.fromFunction0(value))
    @scala.inline
    def setUnlock(value: () => Unit): Self = this.set("unlock", js.Any.fromFunction0(value))
  }
  
}

