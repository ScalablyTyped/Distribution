package typings.ol

import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typings.ol.vectorMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorLayerRenderer
    extends typings.ol.canvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
    def renderFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
  }
}
