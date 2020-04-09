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
    ascent: Int | Double = null,
    descent: Int | Double = null,
    height: Int | Double = null,
    name: String = null,
    path: String = null,
    svg: String = null,
    transform: String = null,
    width: Int | Double = null
  ): Icon = {
    val __obj = js.Dynamic.literal()
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

