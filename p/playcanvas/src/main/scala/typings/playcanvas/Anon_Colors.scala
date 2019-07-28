package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.Array[Double]
  var indices: js.Array[Double]
  var normals: js.Array[Double]
  var tangents: js.Array[Double]
  var uvs: js.Array[Double]
  var uvs1: js.Array[Double]
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[Double],
    indices: js.Array[Double],
    normals: js.Array[Double],
    tangents: js.Array[Double],
    uvs: js.Array[Double],
    uvs1: js.Array[Double]
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, indices = indices, normals = normals, tangents = tangents, uvs = uvs, uvs1 = uvs1)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

