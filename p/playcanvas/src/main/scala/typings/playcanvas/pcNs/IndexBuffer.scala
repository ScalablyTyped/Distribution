package typings.playcanvas.pcNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.IndexBuffer
  * @class An index buffer is the mechanism via which the application specifies primitive
  * index data to the graphics hardware.
  * @description Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  * // The buffer is marked as static, hinting that the buffer will never be modified
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param {pc.GraphicsDevice} graphicsDevice The graphics device used to manage this index buffer.
  * @param {Number} format The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param {Number} numIndices The number of indices to be stored in the index buffer.
  * @param {Number} [usage] The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] Initial data.
  */
@JSGlobal("pc.IndexBuffer")
@js.native
class IndexBuffer protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice, format: Double, numIndices: Double) = this()
  def this(graphicsDevice: GraphicsDevice, format: Double, numIndices: Double, usage: Double) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: js.Any
  ) = this()
  /**
    * @function
    * @name pc.IndexBuffer#destroy
    * @description Frees resources associated with this index buffer.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.IndexBuffer#getFormat
    * @description Returns the data format of the specified index buffer.
    * @returns {Number} The data format of the specified index buffer (see pc.INDEXFORMAT_*).
    */
  def getFormat(): Unit = js.native
  /**
    * @function
    * @name pc.IndexBuffer#getNumIndices
    * @description Returns the number of indices stored in the specified index buffer.
    * @returns {Number} The number of indices stored in the specified index buffer.
    */
  def getNumIndices(): Double = js.native
  /**
    * @function
    * @name pc.IndexBuffer#lock
    * @description Gives access to the block of memory that stores the buffer's indices.
    * @returns {ArrayBuffer} A contiguous block of memory where index data can be written to.
    */
  def lock(): ArrayBuffer = js.native
  /**
    * @function
    * @name pc.IndexBuffer#unlock
    * @description Signals that the block of memory returned by a call to the lock function is
    * ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    * currently active device.
    */
  def unlock(): Unit = js.native
}

