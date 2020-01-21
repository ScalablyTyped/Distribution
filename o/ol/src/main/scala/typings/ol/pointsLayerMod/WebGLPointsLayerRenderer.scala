package typings.ol.pointsLayerMod

import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLPointsLayerRenderer
  extends typings.ol.webglLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
  def renderHitDetection(frameState: FrameState): Unit = js.native
}

