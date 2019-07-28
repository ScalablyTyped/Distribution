package typings.ol.olMod

import typings.ol.mapEventMod.default
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapEvent")
@js.native
class MapEvent protected () extends default {
  def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
  def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
}

