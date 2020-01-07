package typings.ol

import typings.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorLayer", JSImport.Namespace)
@js.native
object rendererCanvasVectorLayerMod extends js.Object {
  @js.native
  trait CanvasVectorLayerRenderer
    extends typings.ol.rendererCanvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    def renderFeature(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typings.ol.layerVectorMod.default) = this()
  }
  
}

