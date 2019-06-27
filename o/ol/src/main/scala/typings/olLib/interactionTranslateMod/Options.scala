package typings
package olLib.interactionTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var features: js.UndefOr[olLib.collectionMod.default[olLib.featureMod.default]] = js.undefined
  var hitTolerance: js.UndefOr[scala.Double] = js.undefined
  var layers: js.UndefOr[
    js.Array[olLib.layerLayerMod.default] | (js.Function1[/* p0 */ olLib.layerLayerMod.default, scala.Boolean])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    features: olLib.collectionMod.default[olLib.featureMod.default] = null,
    hitTolerance: scala.Int | scala.Double = null,
    layers: js.Array[olLib.layerLayerMod.default] | (js.Function1[/* p0 */ olLib.layerLayerMod.default, scala.Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

