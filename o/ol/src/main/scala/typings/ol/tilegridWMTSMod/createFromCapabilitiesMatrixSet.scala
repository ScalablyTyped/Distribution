package typings.ol.tilegridWMTSMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid/WMTS", "createFromCapabilitiesMatrixSet")
@js.native
object createFromCapabilitiesMatrixSet extends js.Object {
  def apply(matrixSet: js.Any): WMTSTileGrid = js.native
  def apply(matrixSet: js.Any, opt_extent: Extent): WMTSTileGrid = js.native
  def apply(matrixSet: js.Any, opt_extent: Extent, opt_matrixLimits: js.Array[js.Object]): WMTSTileGrid = js.native
}

