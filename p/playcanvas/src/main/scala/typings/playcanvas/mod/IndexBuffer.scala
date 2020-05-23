package typings.playcanvas.mod

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
@JSImport("playcanvas", "IndexBuffer")
@js.native
class IndexBuffer protected ()
  extends typings.playcanvas.pc.IndexBuffer {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice, format: Double, numIndices: Double) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: ArrayBuffer
  ) = this()
  /**
    * Frees resources associated with this index buffer.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Returns the data format of the specified index buffer.
    * @returns The data format of the specified index buffer (see pc.INDEXFORMAT_*).
    */
  /* CompleteClass */
  override def getFormat(): Double = js.native
  /**
    * Returns the number of indices stored in the specified index buffer.
    * @returns The number of indices stored in the specified index buffer.
    */
  /* CompleteClass */
  override def getNumIndices(): Double = js.native
  /**
    * Gives access to the block of memory that stores the buffer's indices.
    * @returns A contiguous block of memory where index data can be written to.
    */
  /* CompleteClass */
  override def lock(): ArrayBuffer = js.native
  /**
    * Signals that the block of memory returned by a call to the lock function is
    ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    currently active device.
    */
  /* CompleteClass */
  override def unlock(): Unit = js.native
}

