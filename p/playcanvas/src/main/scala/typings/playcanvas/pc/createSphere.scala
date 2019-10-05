package typings.playcanvas.pc

import typings.playcanvas.Anon_Radius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createSphere")
@js.native
object createSphere extends js.Object {
  /**
    * @function
    * @name pc.createSphere
    * @description Creates a procedural sphere-shaped mesh.
    * The size and tesselation properties of the sphere can be controlled via function parameters. By
    * default, the function will create a sphere centred on the object space origin with a radius of 0.5
    * and 16 segments in both longitude and latitude.<br />
    * Note that the sphere is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the sphere's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.radius] The radius of the sphere (defaults to 0.5).
    * @param {Number} [opts.segments] The number of divisions along the longitudinal and latitudinal axes of the sphere (defaults to 16).
    * @returns {pc.Mesh} A new sphere-shaped mesh.
    */
  def apply(device: GraphicsDevice): Mesh = js.native
  def apply(device: GraphicsDevice, opts: Anon_Radius): Mesh = js.native
}

