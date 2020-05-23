package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var layer: js.UndefOr[typings.playcanvas.pc.Layer] = js.undefined
}

object Layer {
  @scala.inline
  def apply(layer: typings.playcanvas.pc.Layer = null): Layer = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

