package typings.playcanvas.pc

import typings.playcanvas.AnonColors
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createMesh")
@js.native
object createMesh extends js.Object {
  /**
    * @function
    * @name pc.createMesh
    * @description Creates a new mesh object from the supplied vertex information and topology.
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number[]} [opts.normals] An array of 3-dimensional vertex normals.
    * @param {Number[]} [opts.tangents] An array of 3-dimensional vertex tangents.
    * @param {Number[]} [opts.colors] An array of 4-dimensional vertex colors.
    * @param {Number[]} [opts.uvs] An array of 2-dimensional vertex texture coordinates.
    * @param {Number[]} [opts.uvs1] Same as opts.uvs, but for additional UV set
    * @param {Number[]} [opts.indices] An array of triangle indices.
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
  def apply(device: GraphicsDevice, positions: js.Array[Number]): Mesh = js.native
  def apply(device: GraphicsDevice, positions: js.Array[Number], opts: AnonColors): Mesh = js.native
}

