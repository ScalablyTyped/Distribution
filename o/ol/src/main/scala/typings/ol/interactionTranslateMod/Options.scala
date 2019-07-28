package typings.ol.interactionTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var features: js.UndefOr[typings.ol.collectionMod.default[typings.ol.featureMod.default]] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[
    js.Array[typings.ol.layerLayerMod.default] | (js.Function1[/* p0 */ typings.ol.layerLayerMod.default, Boolean])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    features: typings.ol.collectionMod.default[typings.ol.featureMod.default] = null,
    hitTolerance: Int | Double = null,
    layers: js.Array[typings.ol.layerLayerMod.default] | (js.Function1[/* p0 */ typings.ol.layerLayerMod.default, Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

