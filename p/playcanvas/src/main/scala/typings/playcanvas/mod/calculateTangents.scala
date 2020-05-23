package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "calculateTangents")
@js.native
object calculateTangents extends js.Object {
  /**
    * Generates tangent information from the specified positions,
    normals, texture coordinates and triangle indices. See {@link pc.createMesh}.
    * @example
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    * @param positions - An array of 3-dimensional vertex positions.
    * @param normals - An array of 3-dimensional vertex normals.
    * @param uvs - An array of 2-dimensional vertex texture coordinates.
    * @param indices - An array of triangle indices.
    * @returns An array of 3-dimensional vertex tangents.
    */
  def apply(
    positions: js.Array[Double],
    normals: js.Array[Double],
    uvs: js.Array[Double],
    indices: js.Array[Double]
  ): js.Array[Double] = js.native
}

