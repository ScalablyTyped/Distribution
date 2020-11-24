package typings.ol.rasterMod

import typings.ol.extentMod.Extent
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Raster", "RasterSourceEvent")
@js.native
class RasterSourceEvent protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: String, frameState: FrameState, data: js.Any) = this()
  
  /**
    * An object made available to all operations.  This can be used by operations
    * as a storage object (e.g. for calculating statistics).
    */
  var data: js.Any = js.native
  
  /**
    * The raster extent.
    */
  var extent: Extent = js.native
  
  /**
    * The pixel resolution (map units per pixel).
    */
  var resolution: Double = js.native
}
