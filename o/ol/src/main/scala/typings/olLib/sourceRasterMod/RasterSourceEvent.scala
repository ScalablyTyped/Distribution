package typings
package olLib.sourceRasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Raster", "RasterSourceEvent")
@js.native
class RasterSourceEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: java.lang.String, frameState: olLib.pluggableMapMod.FrameState, data: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var data: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var extent: olLib.extentMod.Extent = js.native
  var resolution: scala.Double = js.native
}

