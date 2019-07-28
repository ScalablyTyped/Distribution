package typings.ol.pluggableMapMod

import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
  ] = js.undefined
  var interactions: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
  ] = js.undefined
  var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.undefined
  var layers: js.UndefOr[
    js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] | typings.ol.layerGroupMod.default
  ] = js.undefined
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var maxTilesLoading: js.UndefOr[Double] = js.undefined
  var moveTolerance: js.UndefOr[Double] = js.undefined
  var overlays: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
  ] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var view: js.UndefOr[typings.ol.viewMod.default] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default] = null,
    interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default] = null,
    keyboardEventTarget: HTMLElement | Document | String = null,
    layers: js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] | typings.ol.layerGroupMod.default = null,
    loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    maxTilesLoading: Int | Double = null,
    moveTolerance: Int | Double = null,
    overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default] = null,
    pixelRatio: Int | Double = null,
    target: HTMLElement | String = null,
    view: typings.ol.viewMod.default = null
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

