package typings.ol.sourceRasterMod

import typings.ol.extentMod.Extent
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Raster", "RasterSourceEvent")
@js.native
class RasterSourceEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(`type`: String, frameState: FrameState, data: js.Any) = this()
  var data: js.Any = js.native
  var extent: Extent = js.native
  var resolution: Double = js.native
}

