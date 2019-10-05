package typings.playcanvas.pc

import typings.playcanvas.Anon_BaseRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createCone")
@js.native
object createCone extends js.Object {
  /**
    * @function
    * @name pc.createCone
    * @description Creates a procedural cone-shaped mesh.</p>
    * The size, shape and tesselation properties of the cone can be controlled via function parameters.
    * By default, the function will create a cone standing vertically centred on the XZ-plane with a base radius
    * of 0.5, a height of 1.0, 5 height segments and 20 cap segments.<br />
    * Note that the cone is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the cone's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.baseRadius] The base radius of the cone (defaults to 0.5).
    * @param {Number} [opts.peakRadius] The peak radius of the cone (defaults to 0.0).
    * @param {Number} [opts.height] The length of the body of the cone (defaults to 1.0).
    * @param {Number} [opts.heightSegments] The number of divisions along the length of the cone (defaults to 5).
    * @param {Number} [opts.capSegments] The number of divisions around the tubular body of the cone (defaults to 18).
    * @returns {pc.Mesh} A new cone-shaped mesh.
    */
  def apply(device: GraphicsDevice): Mesh = js.native
  def apply(device: GraphicsDevice, opts: Anon_BaseRadius): Mesh = js.native
}

