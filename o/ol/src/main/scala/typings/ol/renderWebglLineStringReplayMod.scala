package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/LineStringReplay", JSImport.Namespace)
@js.native
object renderWebglLineStringReplayMod extends js.Object {
  @js.native
  trait WebGLLineStringReplay
    extends typings.ol.renderWebglReplayMod.default {
    def drawPolygonCoordinates(flatCoordinates: js.Array[Double], holeFlatCoordinates: js.Array[js.Array[Double]], stride: Double): Unit = js.native
    def getCurrentIndex(): Double = js.native
    def setPolygonStyle(feature: typings.ol.featureMod.default): Unit = js.native
    def setPolygonStyle(feature: typings.ol.featureMod.default, opt_index: Double): Unit = js.native
    def setPolygonStyle(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    def setPolygonStyle(feature: typings.ol.renderFeatureMod.default, opt_index: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLLineStringReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

