package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[js.Array[Number]] = js.undefined
  var indices: js.UndefOr[js.Array[Number]] = js.undefined
  var normals: js.UndefOr[js.Array[Number]] = js.undefined
  var tangents: js.UndefOr[js.Array[Number]] = js.undefined
  var uvs: js.UndefOr[js.Array[Number]] = js.undefined
  var uvs1: js.UndefOr[js.Array[Number]] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[Number] = null,
    indices: js.Array[Number] = null,
    normals: js.Array[Number] = null,
    tangents: js.Array[Number] = null,
    uvs: js.Array[Number] = null,
    uvs1: js.Array[Number] = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (normals != null) __obj.updateDynamic("normals")(normals)
    if (tangents != null) __obj.updateDynamic("tangents")(tangents)
    if (uvs != null) __obj.updateDynamic("uvs")(uvs)
    if (uvs1 != null) __obj.updateDynamic("uvs1")(uvs1)
    __obj.asInstanceOf[Anon_Colors]
  }
}

