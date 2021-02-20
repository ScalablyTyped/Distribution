package typings.playcanvas.global.pc

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("pc.IndexBuffer")
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
    usage: js.UndefOr[scala.Nothing],
    initialData: ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: ArrayBuffer
  ) = this()
}
