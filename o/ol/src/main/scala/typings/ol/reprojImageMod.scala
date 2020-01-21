package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Image", JSImport.Namespace)
@js.native
object reprojImageMod extends js.Object {
  @js.native
  trait ReprojImage
    extends typings.ol.imageBaseMod.default {
    def getProjection(): typings.ol.projectionMod.default = js.native
  }
  
  @js.native
  class default protected () extends ReprojImage {
    def this(
      sourceProj: typings.ol.projectionMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType
    ) = this()
  }
  
  type FunctionType = js.Function3[/* p0 */ Extent, /* p1 */ Double, /* p2 */ Double, typings.ol.imageBaseMod.default]
}

