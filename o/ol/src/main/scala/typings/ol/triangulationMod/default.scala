package typings.ol.triangulationMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/reproj/Triangulation", JSImport.Default)
@js.native
class default protected () extends Triangulation {
  def this(
    sourceProj: typings.ol.projectionMod.default,
    targetProj: typings.ol.projectionMod.default,
    targetExtent: Extent,
    maxSourceExtent: Extent,
    errorThreshold: Double,
    opt_destinationResolution: Double
  ) = this()
}
