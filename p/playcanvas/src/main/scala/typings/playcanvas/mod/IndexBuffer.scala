package typings.playcanvas.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.IndexBuffer
  * @classdesc An index buffer is the mechanism via which the application specifies primitive
  * index data to the graphics hardware.
  * @description Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  * // The buffer is marked as static, hinting that the buffer will never be modified
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this index buffer.
  * @param {number} format - The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param {number} numIndices - The number of indices to be stored in the index buffer.
  * @param {number} [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] - Initial data.
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
}

