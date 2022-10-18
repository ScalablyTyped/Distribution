package typings.ol

import typings.ol.layerGraticuleMod.Options
import typings.ol.layerGraticuleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("ol/layer", "Graticule")
  @js.native
  open class Graticule () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/layer", "Group")
  @js.native
  open class Group ()
    extends typings.ol.layerGroupMod.default {
    def this(opt_options: typings.ol.layerGroupMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Heatmap")
  @js.native
  open class Heatmap ()
    extends typings.ol.layerHeatmapMod.default {
    def this(opt_options: typings.ol.layerHeatmapMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Image")
  @js.native
  open class Image ()
    extends typings.ol.layerImageMod.default {
    def this(opt_options: typings.ol.layerBaseImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Layer")
  @js.native
  open class Layer[SourceType /* <: typings.ol.sourceSourceMod.default */] protected ()
    extends typings.ol.layerLayerMod.default[SourceType] {
    def this(options: typings.ol.layerLayerMod.Options) = this()
  }
  
  @JSImport("ol/layer", "MapboxVector")
  @js.native
  open class MapboxVector protected ()
    extends typings.ol.layerMapboxVectorMod.default {
    def this(options: typings.ol.layerMapboxVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Tile")
  @js.native
  open class Tile ()
    extends typings.ol.layerTileMod.default {
    def this(opt_options: typings.ol.layerBaseTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Vector")
  @js.native
  open class Vector ()
    extends typings.ol.layerVectorMod.default {
    def this(opt_options: typings.ol.layerBaseVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorImage")
  @js.native
  open class VectorImage ()
    extends typings.ol.layerVectorImageMod.default {
    def this(opt_options: typings.ol.layerVectorImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorTile")
  @js.native
  open class VectorTile ()
    extends typings.ol.layerVectorTileMod.default {
    def this(opt_options: typings.ol.layerVectorTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "WebGLPoints")
  @js.native
  open class WebGLPoints protected ()
    extends typings.ol.layerWebGLPointsMod.default {
    def this(options: typings.ol.layerWebGLPointsMod.Options) = this()
  }
}
