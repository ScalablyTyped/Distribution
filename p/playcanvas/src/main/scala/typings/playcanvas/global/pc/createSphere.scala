package typings.playcanvas.global.pc

import typings.playcanvas.anon.Radius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("pc.createSphere")
@js.native
object createSphere extends js.Object {
  
  /**
    * Creates a procedural sphere-shaped mesh.
    *
    * The size and tesselation properties of the sphere can be controlled via function
    * parameters. By default, the function will create a sphere centered on the object
    * space origin with a radius of 0.5 and 16 segments in both longitude and latitude.
    *
    * Note that the sphere is created with UVs in the range of 0 to 1. Additionally, tangent
    * information is generated into the vertex buffer of the sphere's mesh.
    * @param device - The graphics device used to manage the mesh.
    * @param [opts] - An object that specifies optional inputs for the function as follows:
    * @param [opts.radius] - The radius of the sphere (defaults to 0.5).
    * @param [opts.segments] - The number of divisions along the longitudinal
    * and latitudinal axes of the sphere (defaults to 16).
    * @returns A new sphere-shaped mesh.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, opts: Radius): typings.playcanvas.pc.Mesh = js.native
}
