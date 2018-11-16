package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
     * {@link ol.Map#hasFeatureAtPixel} methods.
     */

trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[scala.Double] = js.undefined
  var layerFilter: js.UndefOr[
    js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean]
  ] = js.undefined
}

