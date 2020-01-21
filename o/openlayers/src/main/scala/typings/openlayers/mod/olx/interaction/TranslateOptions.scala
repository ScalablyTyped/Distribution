package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends js.Object {
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.undefined
}

object TranslateOptions {
  @scala.inline
  def apply(
    features: Collection[Feature] = null,
    layers: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean]) = null
  ): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
}

