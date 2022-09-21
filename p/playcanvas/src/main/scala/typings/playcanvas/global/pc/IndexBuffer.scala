package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An index buffer stores index values into a {@link VertexBuffer}. Indexed graphical primitives
  * can normally utilize less memory that unindexed primitives (if vertices are shared).
  *
  * Typically, index buffers are set on {@link Mesh} objects.
  */
@JSGlobal("pc.IndexBuffer")
@js.native
open class IndexBuffer protected ()
  extends typings.playcanvas.mod.IndexBuffer {
  /**
    * Create a new IndexBuffer instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this index
    * buffer.
    * @param {number} format - The type of each index to be stored in the index buffer. Can be:
    *
    * - {@link INDEXFORMAT_UINT8}
    * - {@link INDEXFORMAT_UINT16}
    * - {@link INDEXFORMAT_UINT32}
    * @param {number} numIndices - The number of indices to be stored in the index buffer.
    * @param {number} [usage] - The usage type of the vertex buffer. Can be:
    *
    * - {@link BUFFER_DYNAMIC}
    * - {@link BUFFER_STATIC}
    * - {@link BUFFER_STREAM}
    *
    * Defaults to {@link BUFFER_STATIC}.
    * @param {ArrayBuffer} [initialData] - Initial data. If left unspecified, the index buffer
    * will be initialized to zeros.
    * @example
    * // Create an index buffer holding 3 16-bit indices. The buffer is marked as
    * // static, hinting that the buffer will never be modified.
    * var indices = new UInt16Array([0, 1, 2]);
    * var indexBuffer = new pc.IndexBuffer(graphicsDevice,
    *                                      pc.INDEXFORMAT_UINT16,
    *                                      3,
    *                                      pc.BUFFER_STATIC,
    *                                      indices);
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice, format: Double, numIndices: Double) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Unit,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
}
