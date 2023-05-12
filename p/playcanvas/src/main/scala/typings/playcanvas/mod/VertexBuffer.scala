package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex buffer is the mechanism via which the application specifies vertex data to the graphics
  * hardware.
  */
@JSImport("playcanvas", "VertexBuffer")
@js.native
open class VertexBuffer protected () extends StObject {
  /**
    * Create a new VertexBuffer instance.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used to manage this vertex buffer.
    * @param {import('./vertex-format.js').VertexFormat} format - The vertex format of this vertex
    * buffer.
    * @param {number} numVertices - The number of vertices that this vertex buffer will hold.
    * @param {number} [usage] - The usage type of the vertex buffer (see BUFFER_*). Defaults to BUFFER_STATIC.
    * @param {ArrayBuffer} [initialData] - Initial data.
    */
  def this(graphicsDevice: GraphicsDevice, format: VertexFormat, numVertices: Double) = this()
  def this(graphicsDevice: GraphicsDevice, format: VertexFormat, numVertices: Double, usage: Double) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: VertexFormat,
    numVertices: Double,
    usage: Unit,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  
  def adjustVramSizeTracking(vram: Any, size: Any): Unit = js.native
  
  /**
    * Frees resources associated with this vertex buffer.
    */
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  var format: VertexFormat = js.native
  
  /**
    * Returns the data format of the specified vertex buffer.
    *
    * @returns {import('./vertex-format.js').VertexFormat} The data format of the specified vertex
    * buffer.
    */
  def getFormat(): VertexFormat = js.native
  
  /**
    * Returns the number of vertices stored in the specified vertex buffer.
    *
    * @returns {number} The number of vertices stored in the vertex buffer.
    */
  def getNumVertices(): Double = js.native
  
  /**
    * Returns the usage type of the specified vertex buffer. This indicates whether the buffer can
    * be modified once and used many times {@link BUFFER_STATIC}, modified repeatedly and used
    * many times {@link BUFFER_DYNAMIC} or modified once and used at most a few times
    * {@link BUFFER_STREAM}.
    *
    * @returns {number} The usage type of the vertex buffer (see BUFFER_*).
    */
  def getUsage(): Double = js.native
  
  var id: Double = js.native
  
  var impl: Any = js.native
  
  /**
    * Returns a mapped memory block representing the content of the vertex buffer.
    *
    * @returns {ArrayBuffer} An array containing the byte data stored in the vertex buffer.
    */
  def lock(): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Called when the rendering context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  var numBytes: Double = js.native
  
  var numVertices: Double = js.native
  
  /**
    * Copies data into vertex buffer's memory.
    *
    * @param {ArrayBuffer} [data] - Source data to copy.
    * @returns {boolean} True if function finished successfully, false otherwise.
    */
  def setData(): Boolean = js.native
  def setData(data: js.typedarray.ArrayBuffer): Boolean = js.native
  
  var storage: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Notifies the graphics engine that the client side copy of the vertex buffer's memory can be
    * returned to the control of the graphics driver.
    */
  def unlock(): Unit = js.native
  
  var usage: Double = js.native
}
