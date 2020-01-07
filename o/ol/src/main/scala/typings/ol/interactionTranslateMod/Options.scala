package typings.ol.interactionTranslateMod

import typings.ol.featureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
  ] = js.undefined
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[
    js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      Boolean
    ])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = null,
    filter: (/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]) => Boolean = null,
    hitTolerance: Int | Double = null,
    layers: js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      Boolean
    ]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

