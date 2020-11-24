package typings.ol.mod

import typings.ol.mapEventMod.default
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "MapEvent")
@js.native
class MapEvent protected () extends default {
  def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
  def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
}
