package typings.playcanvas.pc

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.calculateNormals")
@js.native
object calculateNormals extends js.Object {
  /**
    * @function
    * @name pc.calculateNormals
    * @description Generates normal information from the specified positions and triangle indices. See {@link pc.createMesh}.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Number[]} indices An array of triangle indices.
    * @returns {Number[]} An array of 3-dimensional vertex normals.
    * @example
    * var normals = pc.calculateNormals(positions, indices);
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    */
  def apply(positions: js.Array[Number], indices: js.Array[Number]): js.Array[Number] = js.native
}

