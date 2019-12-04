package typings.ol

import typings.ol.rendererWebglVectorLayerMod.WebGLVectorLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/VectorLayer", JSImport.Namespace)
@js.native
object rendererWebglVectorLayerMod extends js.Object {
  @js.native
  trait WebGLVectorLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default {
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): WebGLVectorLayerRenderer = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
    def renderFeature(
      feature: typings.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      replayGroup: typings.ol.renderWebglReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: typings.ol.styleStyleMod.default,
      replayGroup: typings.ol.renderWebglReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLVectorLayerRenderer {
    def this(
      mapRenderer: typings.ol.rendererWebglMapMod.default,
      vectorLayer: typings.ol.layerVectorMod.default
    ) = this()
  }
  
}

