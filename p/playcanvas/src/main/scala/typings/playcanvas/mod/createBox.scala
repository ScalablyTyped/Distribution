package typings.playcanvas.mod

import typings.playcanvas.anon.HeightSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "createBox")
@js.native
object createBox extends js.Object {
  /**
    * Creates a procedural box-shaped mesh.
    
    The size, shape and tesselation properties of the box can be controlled via function parameters. By
    default, the function will create a box centred on the object space origin with a width, length and
    height of 1.0 unit and 10 segments in either axis (50 triangles per face).
    
    Note that the box is created with UVs in the range of 0 to 1 on each face. Additionally, tangent
    information is generated into the vertex buffer of the box's mesh.
    * @param device - The graphics device used to manage the mesh.
    * @param [opts] - An object that specifies optional inputs for the function as follows:
    * @param [opts.halfExtents] - The half dimensions of the box in each axis (defaults to [0.5, 0.5, 0.5]).
    * @param [opts.widthSegments] - The number of divisions along the X axis of the box (defaults to 1).
    * @param [opts.lengthSegments] - The number of divisions along the Z axis of the box (defaults to 1).
    * @param [opts.heightSegments] - The number of divisions along the Y axis of the box (defaults to 1).
    * @returns A new box-shaped mesh.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, opts: HeightSegments): typings.playcanvas.pc.Mesh = js.native
}

