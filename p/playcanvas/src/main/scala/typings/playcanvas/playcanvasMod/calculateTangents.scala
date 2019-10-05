package typings.playcanvas.playcanvasMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "calculateTangents")
@js.native
object calculateTangents extends js.Object {
  /**
    * @function
    * @name pc.calculateTangents
    * @description Generates tangent information from the specified positions, normals, texture coordinates
    * and triangle indices. See {@link pc.createMesh}.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Number[]} normals An array of 3-dimensional vertex normals.
    * @param {Number[]} uvs An array of 2-dimensional vertex texture coordinates.
    * @param {Number[]} indices An array of triangle indices.
    * @returns {Number[]} An array of 3-dimensional vertex tangents.
    * @example
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    */
  def apply(
    positions: js.Array[Number],
    normals: js.Array[Number],
    uvs: js.Array[Number],
    indices: js.Array[Number]
  ): js.Array[Number] = js.native
}

