package typings.playcanvas.mod

import typings.playcanvas.AnonColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "createMesh")
@js.native
object createMesh extends js.Object {
  /**
    * @function
    * @name pc.createMesh
    * @description Creates a new mesh object from the supplied vertex information and topology.
    * @param {pc.GraphicsDevice} device - The graphics device used to manage the mesh.
    * @param {number[]} positions - An array of 3-dimensional vertex positions.
    * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
    * @param {number[]} [opts.normals] - An array of 3-dimensional vertex normals.
    * @param {number[]} [opts.tangents] - An array of 3-dimensional vertex tangents.
    * @param {number[]} [opts.colors] - An array of 4-dimensional vertex colors.
    * @param {number[]} [opts.uvs] - An array of 2-dimensional vertex texture coordinates.
    * @param {number[]} [opts.uvs1] - Same as opts.uvs, but for additional UV set
    * @param {number[]} [opts.indices] - An array of triangle indices.
    * @returns {pc.Mesh} A new Geometry constructed from the supplied vertex and triangle data.
    * @example
    * // Create a new mesh supplying optional parameters using object literal notation
    * var mesh = pc.createMesh(
    *     graphicsDevice,
    *     positions,
    *     {
    *         normals: treeNormals,
    *         uvs: treeUvs,
    *         indices: treeIndices
    *     });
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double]): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double], opts: AnonColors): typings.playcanvas.pc.Mesh = js.native
}

