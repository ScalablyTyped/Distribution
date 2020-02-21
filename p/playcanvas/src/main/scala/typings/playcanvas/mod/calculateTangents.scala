package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "calculateTangents")
@js.native
object calculateTangents extends js.Object {
  /**
    * @function
    * @name pc.calculateTangents
    * @description Generates tangent information from the specified positions,
    * normals, texture coordinates and triangle indices. See {@link pc.createMesh}.
    * @param {number[]} positions - An array of 3-dimensional vertex positions.
    * @param {number[]} normals - An array of 3-dimensional vertex normals.
    * @param {number[]} uvs - An array of 2-dimensional vertex texture coordinates.
    * @param {number[]} indices - An array of triangle indices.
    * @returns {number[]} An array of 3-dimensional vertex tangents.
    * @example
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    */
  def apply(
    positions: js.Array[Double],
    normals: js.Array[Double],
    uvs: js.Array[Double],
    indices: js.Array[Double]
  ): js.Array[Double] = js.native
}

