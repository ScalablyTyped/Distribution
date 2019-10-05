package typings.ol

import typings.ol.rendererWebglTileLayerMod.WebGLTileLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/TileLayer", JSImport.Namespace)
@js.native
object rendererWebglTileLayerMod extends js.Object {
  @js.native
  trait WebGLTileLayerRenderer
    extends typings.ol.rendererWebglLayerMod.default {
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): WebGLTileLayerRenderer = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLTileLayerRenderer {
    def this(mapRenderer: typings.ol.rendererWebglMapMod.default, tileLayer: typings.ol.layerTileMod.default) = this()
  }
  
}

