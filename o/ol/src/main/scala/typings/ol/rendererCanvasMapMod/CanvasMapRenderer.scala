package typings.ol.rendererCanvasMapMod

import typings.ol.pluggableMapMod.FrameState
import typings.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasMapRenderer
  extends typings.ol.rendererMapMod.default {
  /* protected */ def getTransform(frameState: FrameState): Transform = js.native
}

