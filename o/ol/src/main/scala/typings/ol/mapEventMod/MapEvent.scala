package typings.ol.mapEventMod

import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEvent
  extends typings.ol.eventsEventMod.default {
  var frameState: FrameState = js.native
  var map: typings.ol.pluggableMapMod.default = js.native
}

