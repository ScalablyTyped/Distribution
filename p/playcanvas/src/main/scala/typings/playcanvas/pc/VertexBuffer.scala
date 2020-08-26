package typings.playcanvas.pc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new vertex buffer object.
  * @param graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param format - The vertex format of this vertex buffer.
  * @param numVertices - The number of vertices that this vertex buffer will hold.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
  */
@js.native
trait VertexBuffer extends js.Object {
  /**
    * Frees resources associated with this vertex buffer.
    */
  def destroy(): Unit = js.native
  /**
    * Returns the data format of the specified vertex buffer.
    * @returns The data format of the specified vertex buffer.
    */
  def getFormat(): VertexFormat = js.native
  /**
    * Returns the number of vertices stored in the specified vertex buffer.
    * @returns The number of vertices stored in the vertex buffer.
    */
  def getNumVertices(): Double = js.native
  /**
    * Returns the usage type of the specified vertex buffer. This indicates
    * whether the buffer can be modified once and used many times (pc.BUFFER_STATIC),
    * modified repeatedly and used many times (pc.BUFFER_DYNAMIC) or modified once
    * and used at most a few times (pc.BUFFER_STREAM).
    * @returns The usage type of the vertex buffer (see pc.BUFFER_*).
    */
  def getUsage(): Double = js.native
  /**
    * Returns a mapped memory block representing the content of the vertex buffer.
    * @returns An array containing the byte data stored in the vertex buffer.
    */
  def lock(): ArrayBuffer = js.native
  /**
    * Copies data into vertex buffer's memory.
    * @param [data] - Source data to copy.
    * @returns True if function finished successfuly, false otherwise.
    */
  def setData(): Boolean = js.native
  def setData(data: ArrayBuffer): Boolean = js.native
  /**
    * Notifies the graphics engine that the client side copy of the vertex buffer's
    * memory can be returned to the control of the graphics driver.
    */
  def unlock(): Unit = js.native
}

