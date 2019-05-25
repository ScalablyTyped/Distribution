package typings
package olLib.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    olLib.collectionMod.default[olLib.controlControlMod.default] | js.Array[olLib.controlControlMod.default]
  ] = js.undefined
  var interactions: js.UndefOr[
    olLib.collectionMod.default[olLib.interactionInteractionMod.default] | js.Array[olLib.interactionInteractionMod.default]
  ] = js.undefined
  var keyboardEventTarget: js.UndefOr[stdLib.HTMLElement | stdLib.Document | java.lang.String] = js.undefined
  var layers: js.UndefOr[
    js.Array[olLib.layerBaseMod.default] | olLib.collectionMod.default[olLib.layerBaseMod.default] | olLib.layerGroupMod.default
  ] = js.undefined
  var loadTilesWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var loadTilesWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined
  var maxTilesLoading: js.UndefOr[scala.Double] = js.undefined
  var moveTolerance: js.UndefOr[scala.Double] = js.undefined
  var overlays: js.UndefOr[
    olLib.collectionMod.default[olLib.overlayMod.default] | js.Array[olLib.overlayMod.default]
  ] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var view: js.UndefOr[olLib.viewMod.default] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: olLib.collectionMod.default[olLib.controlControlMod.default] | js.Array[olLib.controlControlMod.default] = null,
    interactions: olLib.collectionMod.default[olLib.interactionInteractionMod.default] | js.Array[olLib.interactionInteractionMod.default] = null,
    keyboardEventTarget: stdLib.HTMLElement | stdLib.Document | java.lang.String = null,
    layers: js.Array[olLib.layerBaseMod.default] | olLib.collectionMod.default[olLib.layerBaseMod.default] | olLib.layerGroupMod.default = null,
    loadTilesWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    loadTilesWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined,
    maxTilesLoading: scala.Int | scala.Double = null,
    moveTolerance: scala.Int | scala.Double = null,
    overlays: olLib.collectionMod.default[olLib.overlayMod.default] | js.Array[olLib.overlayMod.default] = null,
    pixelRatio: scala.Int | scala.Double = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    view: olLib.viewMod.default = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileAnimating)) __obj.updateDynamic("loadTilesWhileAnimating")(loadTilesWhileAnimating)
    if (!js.isUndefined(loadTilesWhileInteracting)) __obj.updateDynamic("loadTilesWhileInteracting")(loadTilesWhileInteracting)
    if (maxTilesLoading != null) __obj.updateDynamic("maxTilesLoading")(maxTilesLoading.asInstanceOf[js.Any])
    if (moveTolerance != null) __obj.updateDynamic("moveTolerance")(moveTolerance.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MapOptions]
  }
}

