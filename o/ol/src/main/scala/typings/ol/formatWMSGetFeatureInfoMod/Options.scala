package typings.ol.formatWMSGetFeatureInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(layers: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

