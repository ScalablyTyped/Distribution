package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends js.Object {
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var layers: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.layerNs.Layer] | (js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean])
  ] = js.undefined
}

object TranslateOptions {
  @scala.inline
  def apply(
    features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    layers: js.Array[openlayersLib.openlayersMod.layerNs.Layer] | (js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean]) = null
  ): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
}

