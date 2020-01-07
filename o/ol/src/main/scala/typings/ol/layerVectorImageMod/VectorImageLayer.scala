package typings.ol.layerVectorImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageLayer
  extends typings.ol.layerBaseVectorMod.default[
      typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.sourceVectorTileMod.default
    ] {
  def getImageRatio(): Double = js.native
}

