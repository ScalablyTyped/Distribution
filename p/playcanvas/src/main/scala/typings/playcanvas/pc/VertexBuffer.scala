package typings.playcanvas.pc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.VertexBuffer
  * @classdesc A vertex buffer is the mechanism via which the application specifies vertex
  * data to the graphics hardware.
  * @description Creates a new vertex buffer object.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param {pc.VertexFormat} format - The vertex format of this vertex buffer.
  * @param {number} numVertices - The number of vertices that this vertex buffer will hold.
  * @param {number} [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] - Initial data.
  */
@JSGlobal("pc.VertexBuffer")
@js.native
class VertexBuffer protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice, format: VertexFormat, numVertices: Double) = this()
  def this(graphicsDevice: GraphicsDevice, format: VertexFormat, numVertices: Double, usage: Double) = this()
  def this(
    graphicsDevice: GraphicsDevice,
    format: VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: ArrayBuffer
  ) = this()
  /**
    * @function
    * @name pc.VertexBuffer#destroy
    * @description Frees resources associated with this vertex buffer.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.VertexBuffer#getFormat
    * @description Returns the data format of the specified vertex buffer.
    * @returns {pc.VertexFormat} The data format of the specified vertex buffer.
    */
  def getFormat(): VertexFormat = js.native
  /**
    * @function
    * @name pc.VertexBuffer#getNumVertices
    * @description Returns the number of vertices stored in the specified vertex buffer.
    * @returns {number} The number of vertices stored in the vertex buffer.
    */
  def getNumVertices(): Double = js.native
  /**
    * @function
    * @name pc.VertexBuffer#getUsage
    * @description Returns the usage type of the specified vertex buffer. This indicates
    * whether the buffer can be modified once and used many times (pc.BUFFER_STATIC),
    * modified repeatedly and used many times (pc.BUFFER_DYNAMIC) or modified once
    * and used at most a few times (pc.BUFFER_STREAM).
    * @returns {number} The usage type of the vertex buffer (see pc.BUFFER_*).
    */
  def getUsage(): Double = js.native
  /**
    * @function
    * @name pc.VertexBuffer#lock
    * @description Returns a mapped memory block representing the content of the vertex buffer.
    * @returns {ArrayBuffer} An array containing the byte data stored in the vertex buffer.
    */
  def lock(): ArrayBuffer = js.native
  /**
    * @function
    * @name pc.VertexBuffer#setData
    * @description Copies data into vertex buffer's memory.
    * @param {ArrayBuffer} [data] - Source data to copy.
    * @returns {boolean} True if function finished successfuly, false otherwise.
    */
  def setData(): Boolean = js.native
  def setData(data: ArrayBuffer): Boolean = js.native
  /**
    * @function
    * @name pc.VertexBuffer#unlock
    * @description Notifies the graphics engine that the client side copy of the vertex buffer's
    * memory can be returned to the control of the graphics driver.
    */
  def unlock(): Unit = js.native
}

