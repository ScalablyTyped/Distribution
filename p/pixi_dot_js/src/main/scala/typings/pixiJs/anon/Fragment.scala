package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment extends js.Object {
  var fragment: js.UndefOr[String] = js.undefined
  var geometryClass: js.UndefOr[js.Any] = js.undefined
  var vertex: js.UndefOr[String] = js.undefined
  var vertexSize: js.UndefOr[Double] = js.undefined
}

object Fragment {
  @scala.inline
  def apply(
    fragment: String = null,
    geometryClass: js.Any = null,
    vertex: String = null,
    vertexSize: js.UndefOr[Double] = js.undefined
  ): Fragment = {
    val __obj = js.Dynamic.literal()
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (geometryClass != null) __obj.updateDynamic("geometryClass")(geometryClass.asInstanceOf[js.Any])
    if (vertex != null) __obj.updateDynamic("vertex")(vertex.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexSize)) __obj.updateDynamic("vertexSize")(vertexSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
}

