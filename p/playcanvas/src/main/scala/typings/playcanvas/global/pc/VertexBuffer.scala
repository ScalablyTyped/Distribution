package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex buffer is the mechanism via which the application specifies vertex data to the graphics
  * hardware.
  */
@JSGlobal("pc.VertexBuffer")
@js.native
open class VertexBuffer protected ()
  extends typings.playcanvas.mod.VertexBuffer {
  /**
    * Create a new VertexBuffer instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this vertex
    * buffer.
    * @param {VertexFormat} format - The vertex format of this vertex buffer.
    * @param {number} numVertices - The number of vertices that this vertex buffer will hold.
    * @param {number} [usage] - The usage type of the vertex buffer (see BUFFER_*). Defaults to BUFFER_STATIC.
    * @param {ArrayBuffer} [initialData] - Initial data.
    */
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: typings.playcanvas.mod.VertexFormat,
    numVertices: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: typings.playcanvas.mod.VertexFormat,
    numVertices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: typings.playcanvas.mod.VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    format: typings.playcanvas.mod.VertexFormat,
    numVertices: Double,
    usage: Unit,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
}
