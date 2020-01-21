package typings.playcanvas.pc

import typings.playcanvas.AnonHalfExtents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createPlane")
@js.native
object createPlane extends js.Object {
  /**
    * @function
    * @name pc.createPlane
    * @description Creates a procedural plane-shaped mesh.
    * The size and tesselation properties of the plane can be controlled via function parameters. By
    * default, the function will create a plane centred on the object space origin with a width and
    * length of 1.0 and 5 segments in either axis (50 triangles). The normal vector of the plane is aligned
    * along the positive Y axis.<br />
    * Note that the plane is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the plane's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {pc.Vec2} [opts.halfExtents] The half dimensions of the plane in the X and Z axes (defaults to [0.5, 0.5]).
    * @param {Number} [opts.widthSegments] The number of divisions along the X axis of the plane (defaults to 5).
    * @param {Number} [opts.lengthSegments] The number of divisions along the Z axis of the plane (defaults to 5).
    * @returns {pc.Mesh} A new plane-shaped mesh.
    */
  def apply(device: GraphicsDevice): Mesh = js.native
  def apply(device: GraphicsDevice, opts: AnonHalfExtents): Mesh = js.native
}

