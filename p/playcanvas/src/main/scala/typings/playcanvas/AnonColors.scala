package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: js.UndefOr[js.Array[Number]] = js.undefined
  var indices: js.UndefOr[js.Array[Number]] = js.undefined
  var normals: js.UndefOr[js.Array[Number]] = js.undefined
  var tangents: js.UndefOr[js.Array[Number]] = js.undefined
  var uvs: js.UndefOr[js.Array[Number]] = js.undefined
  var uvs1: js.UndefOr[js.Array[Number]] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(
    colors: js.Array[Number] = null,
    indices: js.Array[Number] = null,
    normals: js.Array[Number] = null,
    tangents: js.Array[Number] = null,
    uvs: js.Array[Number] = null,
    uvs1: js.Array[Number] = null
  ): AnonColors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (normals != null) __obj.updateDynamic("normals")(normals.asInstanceOf[js.Any])
    if (tangents != null) __obj.updateDynamic("tangents")(tangents.asInstanceOf[js.Any])
    if (uvs != null) __obj.updateDynamic("uvs")(uvs.asInstanceOf[js.Any])
    if (uvs1 != null) __obj.updateDynamic("uvs1")(uvs1.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

