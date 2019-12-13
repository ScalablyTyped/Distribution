package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var ascent: js.UndefOr[Double] = js.undefined
  var descent: js.UndefOr[Double] = js.undefined
  var path: String
  var width: Double
}

object Icon {
  @scala.inline
  def apply(path: String, width: Double, ascent: Int | Double = null, descent: Int | Double = null): Icon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

