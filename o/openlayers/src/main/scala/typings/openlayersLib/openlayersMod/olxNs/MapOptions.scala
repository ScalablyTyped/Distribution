package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map.
  */
trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] | js.Array[openlayersLib.openlayersMod.controlNs.Control]
  ] = js.undefined
  var interactions: js.UndefOr[
    openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.interactionNs.Interaction] | js.Array[openlayersLib.openlayersMod.interactionNs.Interaction]
  ] = js.undefined
  var keyboardEventTarget: js.UndefOr[stdLib.Element | stdLib.Document | java.lang.String] = js.undefined
  var layers: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.layerNs.Base] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.layerNs.Base]
  ] = js.undefined
  var loadTilesWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var loadTilesWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined
  var logo: js.UndefOr[scala.Boolean | java.lang.String | LogoOptions | stdLib.Element] = js.undefined
  var moveTolerance: js.UndefOr[scala.Double] = js.undefined
  var overlays: js.UndefOr[
    openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Overlay] | js.Array[openlayersLib.openlayersMod.Overlay]
  ] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var renderer: js.UndefOr[
    openlayersLib.openlayersMod.RendererType | (js.Array[openlayersLib.openlayersMod.RendererType | java.lang.String]) | java.lang.String
  ] = js.undefined
  var target: js.UndefOr[stdLib.Element | java.lang.String] = js.undefined
  var view: js.UndefOr[openlayersLib.openlayersMod.View] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] | js.Array[openlayersLib.openlayersMod.controlNs.Control] = null,
    interactions: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.interactionNs.Interaction] | js.Array[openlayersLib.openlayersMod.interactionNs.Interaction] = null,
    keyboardEventTarget: stdLib.Element | stdLib.Document | java.lang.String = null,
    layers: js.Array[openlayersLib.openlayersMod.layerNs.Base] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.layerNs.Base] = null,
    loadTilesWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    loadTilesWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined,
    logo: scala.Boolean | java.lang.String | LogoOptions | stdLib.Element = null,
    moveTolerance: scala.Int | scala.Double = null,
    overlays: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Overlay] | js.Array[openlayersLib.openlayersMod.Overlay] = null,
    pixelRatio: scala.Int | scala.Double = null,
    renderer: openlayersLib.openlayersMod.RendererType | (js.Array[openlayersLib.openlayersMod.RendererType | java.lang.String]) | java.lang.String = null,
    target: stdLib.Element | java.lang.String = null,
    view: openlayersLib.openlayersMod.View = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileAnimating)) __obj.updateDynamic("loadTilesWhileAnimating")(loadTilesWhileAnimating)
    if (!js.isUndefined(loadTilesWhileInteracting)) __obj.updateDynamic("loadTilesWhileInteracting")(loadTilesWhileInteracting)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (moveTolerance != null) __obj.updateDynamic("moveTolerance")(moveTolerance.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MapOptions]
  }
}

