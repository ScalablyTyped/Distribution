package typings.playcanvas.pc

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices. The buffer is marked as
  * // static, hinting that the buffer will never be modified.
  * var indices = new UInt16Array([0, 1, 2]);
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice,
  *                                      pc.INDEXFORMAT_UINT16,
  *                                      3,
  *                                      pc.BUFFER_STATIC,
  *                                      indices);
  * @param graphicsDevice - The graphics device used to
  * manage this index buffer.
  * @param format - The type of each index to be stored in the index
  * buffer. Can be:
  *
  * * {@link pc.INDEXFORMAT_UINT8}
  * * {@link pc.INDEXFORMAT_UINT16}
  * * {@link pc.INDEXFORMAT_UINT32}
  * @param numIndices - The number of indices to be stored in the index
  * buffer.
  * @param [usage] - The usage type of the vertex buffer. Can be:
  *
  * * {@link pc.BUFFER_DYNAMIC}
  * * {@link pc.BUFFER_STATIC}
  * * {@link pc.BUFFER_STREAM}
  *
  * Defaults to pc.BUFFER_STATIC.
  * @param [initialData] - Initial data. If left unspecified, the
  * index buffer will be initialized to zeros.
  */
trait IndexBuffer extends StObject {
  
  /**
    * Frees resources associated with this index buffer.
    */
  def destroy(): Unit
  
  /**
    * Returns the data format of the specified index buffer.
    * @returns The data format of the specified index buffer. Can be:
    *
    * * {@link pc.INDEXFORMAT_UINT8}
    * * {@link pc.INDEXFORMAT_UINT16}
    * * {@link pc.INDEXFORMAT_UINT32}
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
    * ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    * currently active device.
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
  
  @scala.inline
  implicit class IndexBufferMutableBuilder[Self <: IndexBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormat(value: () => Double): Self = StObject.set(x, "getFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumIndices(value: () => Double): Self = StObject.set(x, "getNumIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLock(value: () => ArrayBuffer): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
  }
}
