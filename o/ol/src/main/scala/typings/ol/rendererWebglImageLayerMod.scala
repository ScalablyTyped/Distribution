package typings.ol

import typings.ol.rendererWebglImageLayerMod.WebGLImageLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/ImageLayer", JSImport.Namespace)
@js.native
object rendererWebglImageLayerMod extends js.Object {
  @js.native
  trait WebGLImageLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default {
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): WebGLImageLayerRenderer = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLImageLayerRenderer {
    def this(mapRenderer: typings.ol.rendererWebglMapMod.default, imageLayer: typings.ol.layerImageMod.default) = this()
  }
  
}

