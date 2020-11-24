package typings.ol.pointsLayerMod

import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLPointsLayerRenderer
  extends typings.ol.webglLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
  
  /**
    * Render the layer.
    */
  def renderFrame(frameState: FrameState): HTMLElement = js.native
  
  /**
    * Render the hit detection data to the corresponding render target
    */
  def renderHitDetection(frameState: FrameState): Unit = js.native
}
