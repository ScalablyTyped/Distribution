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

