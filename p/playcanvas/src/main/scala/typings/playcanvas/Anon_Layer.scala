package typings.playcanvas

import typings.playcanvas.pcNs.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layer extends js.Object {
  var layer: js.UndefOr[Layer] = js.undefined
}

object Anon_Layer {
  @scala.inline
  def apply(layer: Layer = null): Anon_Layer = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[Anon_Layer]
  }
}

