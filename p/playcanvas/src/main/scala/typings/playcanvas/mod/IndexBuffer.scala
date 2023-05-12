package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An index buffer stores index values into a {@link VertexBuffer}. Indexed graphical primitives
  * can normally utilize less memory that unindexed primitives (if vertices are shared).
  *
  * Typically, index buffers are set on {@link Mesh} objects.
  */
@JSImport("playcanvas", "IndexBuffer")
@js.native
open class IndexBuffer protected () extends StObject {
  /**
    * Create a new IndexBuffer instance.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used to manage this index buffer.
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
    * const indices = new UInt16Array([0, 1, 2]);
    * const indexBuffer = new pc.IndexBuffer(graphicsDevice,
    *                                        pc.INDEXFORMAT_UINT16,
    *                                        3,
    *                                        pc.BUFFER_STATIC,
    *                                        indices);
    */
  def this(graphicsDevice: GraphicsDevice, format: Double, numIndices: Double) = this()
  def this(graphicsDevice: GraphicsDevice, format: Double, numIndices: Double, usage: Double) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Unit,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  
  /**
    * Get the appropriate typed array from an index buffer.
    *
    * @returns {Uint8Array|Uint16Array|Uint32Array} The typed array containing the index data.
    * @private
    */
  /* private */ var _lockTypedArray: Any = js.native
  
  def adjustVramSizeTracking(vram: Any, size: Any): Unit = js.native
  
  var bytesPerIndex: Double = js.native
  
  /**
    * Frees resources associated with this index buffer.
    */
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  var format: Double = js.native
  
  /**
    * Returns the data format of the specified index buffer.
    *
    * @returns {number} The data format of the specified index buffer. Can be:
    *
    * - {@link INDEXFORMAT_UINT8}
    * - {@link INDEXFORMAT_UINT16}
    * - {@link INDEXFORMAT_UINT32}
    */
  def getFormat(): Double = js.native
  
  /**
    * Returns the number of indices stored in the specified index buffer.
    *
    * @returns {number} The number of indices stored in the specified index buffer.
    */
  def getNumIndices(): Double = js.native
  
  var id: Double = js.native
  
  var impl: Any = js.native
  
  /**
    * Gives access to the block of memory that stores the buffer's indices.
    *
    * @returns {ArrayBuffer} A contiguous block of memory where index data can be written to.
    */
  def lock(): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Called when the rendering context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  var numBytes: Double = js.native
  
  var numIndices: Double = js.native
  
  def readData(data: js.Array[Double]): Double = js.native
  def readData(data: js.typedarray.Uint16Array): Double = js.native
  def readData(data: js.typedarray.Uint32Array): Double = js.native
  /**
    * Copies index data from index buffer into provided data array.
    *
    * @param {Uint8Array|Uint16Array|Uint32Array|number[]} data - The data array to write to.
    * @returns {number} The number of indices read.
    * @ignore
    */
  def readData(data: js.typedarray.Uint8Array): Double = js.native
  
  /**
    * Set preallocated data on the index buffer.
    *
    * @param {ArrayBuffer} data - The index data to set.
    * @returns {boolean} True if the data was set successfully, false otherwise.
    * @ignore
    */
  def setData(data: js.typedarray.ArrayBuffer): Boolean = js.native
  
  var storage: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Signals that the block of memory returned by a call to the lock function is ready to be
    * given to the graphics hardware. Only unlocked index buffers can be set on the currently
    * active device.
    */
  def unlock(): Unit = js.native
  
  var usage: Double = js.native
  
  def writeData(data: js.Array[Double], count: Double): Unit = js.native
  def writeData(data: js.typedarray.Uint16Array, count: Double): Unit = js.native
  def writeData(data: js.typedarray.Uint32Array, count: Double): Unit = js.native
  /**
    * Copies the specified number of elements from data into index buffer. Optimized for
    * performance from both typed array as well as array.
    *
    * @param {Uint8Array|Uint16Array|Uint32Array|number[]} data - The data to write.
    * @param {number} count - The number of indices to write.
    * @ignore
    */
  def writeData(data: js.typedarray.Uint8Array, count: Double): Unit = js.native
}
