package typings.playcanvas.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new vertex buffer object.
  * @param graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param format - The vertex format of this vertex buffer.
  * @param numVertices - The number of vertices that this vertex buffer will hold.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
  */
@JSImport("playcanvas", "VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typings.playcanvas.pc.VertexBuffer {
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: typings.playcanvas.pc.VertexFormat,
    numVertices: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: typings.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: typings.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: js.UndefOr[scala.Nothing],
    initialData: ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice,
    format: typings.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: ArrayBuffer
  ) = this()
}
