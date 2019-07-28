package typings.ol.reprojImageMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Image", JSImport.Default)
@js.native
class default protected () extends ReprojImage {
  def this(
    sourceProj: typings.ol.projProjectionMod.default,
    targetProj: typings.ol.projProjectionMod.default,
    targetExtent: Extent,
    targetResolution: Double,
    pixelRatio: Double,
    getImageFunction: FunctionType
  ) = this()
}

