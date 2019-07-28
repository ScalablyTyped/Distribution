package typings.ol.mapEventMod

import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapEvent", JSImport.Default)
@js.native
class default protected () extends MapEvent {
  def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
  def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
}

