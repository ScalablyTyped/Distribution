package typings
package olLib.tilegridWMTSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid/WMTS", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createFromCapabilitiesMatrixSet(matrixSet: org.scalablytyped.runtime.StringDictionary[js.Any]): WMTSTileGrid = js.native
  def createFromCapabilitiesMatrixSet(matrixSet: org.scalablytyped.runtime.StringDictionary[js.Any], opt_extent: olLib.extentMod.Extent): WMTSTileGrid = js.native
  def createFromCapabilitiesMatrixSet(
    matrixSet: org.scalablytyped.runtime.StringDictionary[js.Any],
    opt_extent: olLib.extentMod.Extent,
    opt_matrixLimits: js.Array[org.scalablytyped.runtime.StringDictionary[_]]
  ): WMTSTileGrid = js.native
}

