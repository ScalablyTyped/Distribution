package typings.playcanvas.global.pc

import typings.playcanvas.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createMesh")
@js.native
object createMesh extends js.Object {
  /**
    * Creates a new mesh object from the supplied vertex information and topology.
    * @example
    * // Create a new mesh supplying optional parameters using object literal notation
    var mesh = pc.createMesh(
    graphicsDevice,
    positions,
    {
    normals: treeNormals,
    uvs: treeUvs,
    indices: treeIndices
    });
    * @param device - The graphics device used to manage the mesh.
    * @param positions - An array of 3-dimensional vertex positions.
    * @param [opts] - An object that specifies optional inputs for the function as follows:
    * @param [opts.normals] - An array of 3-dimensional vertex normals.
    * @param [opts.tangents] - An array of 3-dimensional vertex tangents.
    * @param [opts.colors] - An array of 4-dimensional vertex colors.
    * @param [opts.uvs] - An array of 2-dimensional vertex texture coordinates.
    * @param [opts.uvs1] - Same as opts.uvs, but for additional UV set
    * @param [opts.indices] - An array of triangle indices.
    * @returns A new Geometry constructed from the supplied vertex and triangle data.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double]): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double], opts: Colors): typings.playcanvas.pc.Mesh = js.native
}

