package typings.playcanvas.global.pc

import typings.playcanvas.anon.BlendIndices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("pc.createMesh")
@js.native
object createMesh extends js.Object {
  
  /**
    * Creates a new mesh object from the supplied vertex information and topology.
    * @example
    * // Create a simple, indexed triangle (with texture coordinates and vertex normals)
    * var mesh = pc.createMesh(graphicsDevice, [0, 0, 0, 1, 0, 0, 0, 1, 0], {
    *     normals: [0, 0, 1, 0, 0, 1, 0, 0, 1],
    *     uvs: [0, 0, 1, 0, 0, 1],
    *     indices: [0, 1, 2]
    * });
    * @param device - The graphics device used to manage the mesh.
    * @param positions - An array of 3-dimensional vertex positions.
    * @param [opts] - An object that specifies optional inputs for the function as follows:
    * @param [opts.normals] - An array of 3-dimensional vertex normals.
    * @param [opts.tangents] - An array of 3-dimensional vertex tangents.
    * @param [opts.colors] - An array of 4-dimensional vertex colors where each
    * component is an integer in the range 0 to 255.
    * @param [opts.uvs] - An array of 2-dimensional vertex texture coordinates.
    * @param [opts.uvs1] - Same as opts.uvs, but for additional UV set
    * @param [opts.blendIndices] - An array of 4-dimensional bone indices where each
    * component is an integer in the range 0 to 255.
    * @param [opts.blendWeights] - An array of 4-dimensional bone weights where each
    * component is in the range 0 to 1 and the sum of the weights should equal 1.
    * @param [opts.indices] - An array of triangle indices.
    * @returns A new Mesh constructed from the supplied vertex and triangle data.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double]): typings.playcanvas.pc.Mesh = js.native
  def apply(device: typings.playcanvas.pc.GraphicsDevice, positions: js.Array[Double], opts: BlendIndices): typings.playcanvas.pc.Mesh = js.native
}
