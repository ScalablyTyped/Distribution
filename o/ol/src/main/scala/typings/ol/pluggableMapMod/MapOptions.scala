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
    js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default
  ] = js.undefined
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
    layers: js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default = null,
    maxTilesLoading: js.UndefOr[Double] = js.undefined,
    moveTolerance: js.UndefOr[Double] = js.undefined,
    overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default] = null,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    target: HTMLElement | String = null,
    view: typings.ol.viewMod.default = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTilesLoading)) __obj.updateDynamic("maxTilesLoading")(maxTilesLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveTolerance)) __obj.updateDynamic("moveTolerance")(moveTolerance.get.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

