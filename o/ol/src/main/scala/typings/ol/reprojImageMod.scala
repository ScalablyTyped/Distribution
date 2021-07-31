package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojImageMod {
  
  @JSImport("ol/reproj/Image", JSImport.Default)
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
    def this(
      sourceProj: typings.ol.projectionMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType,
      opt_contextOptions: js.Any
    ) = this()
  }
  
  type FunctionType = js.Function3[/* p0 */ Extent, /* p1 */ Double, /* p2 */ Double, typings.ol.imageBaseMod.default]
  
  @js.native
  trait ReprojImage
    extends typings.ol.imageBaseMod.default {
    
    def getProjection(): typings.ol.projectionMod.default = js.native
  }
}
