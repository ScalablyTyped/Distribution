package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var ascent: js.UndefOr[Double] = js.undefined
  var descent: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var svg: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Icon {
  @scala.inline
  def apply(
    ascent: js.UndefOr[Double] = js.undefined,
    descent: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    name: String = null,
    path: String = null,
    svg: String = null,
    transform: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Icon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascent)) __obj.updateDynamic("ascent")(ascent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(descent)) __obj.updateDynamic("descent")(descent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

