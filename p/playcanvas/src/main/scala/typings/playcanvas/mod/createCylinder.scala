package typings.playcanvas.mod

import typings.playcanvas.AnonCapSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "createCylinder")
@js.native
object createCylinder extends js.Object {
  /**
    * @function
    * @name pc.createCylinder
    * @description Creates a procedural cylinder-shaped mesh.
    *
    * The size, shape and tesselation properties of the cylinder can be controlled via function parameters.
    * By default, the function will create a cylinder standing vertically centred on the XZ-plane with a radius
    * of 0.5, a height of 1.0, 1 height segment and 20 cap segments.
    *
    * Note that the cylinder is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the cylinder's mesh.
    * @param {pc.GraphicsDevice} device - The graphics device used to manage the mesh.
    * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
    * @param {number} [opts.radius] - The radius of the tube forming the body of the cylinder (defaults to 0.5).
    * @param {number} [opts.height] - The length of the body of the cylinder (defaults to 1.0).
    * @param {number} [opts.heightSegments] - The number of divisions along the length of the cylinder (defaults to 5).
    * @param {number} [opts.capSegments] - The number of divisions around the tubular body of the cylinder (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, opts: AnonCapSegments): typings.playcanvas.pc.Mesh = js.native
}

