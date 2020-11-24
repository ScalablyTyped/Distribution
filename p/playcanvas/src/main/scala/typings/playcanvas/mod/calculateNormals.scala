package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "calculateNormals")
@js.native
object calculateNormals extends js.Object {
  
  /**
    * Generates normal information from the specified positions and
    * triangle indices. See {@link pc.createMesh}.
    * @example
    * var normals = pc.calculateNormals(positions, indices);
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    * @param positions - An array of 3-dimensional vertex positions.
    * @param indices - An array of triangle indices.
    * @returns An array of 3-dimensional vertex normals.
    */
  def apply(positions: js.Array[Double], indices: js.Array[Double]): js.Array[Double] = js.native
}
