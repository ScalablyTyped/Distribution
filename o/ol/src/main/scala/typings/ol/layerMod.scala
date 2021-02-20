package typings.ol

import typings.ol.graticuleMod.Options
import typings.ol.graticuleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("ol/layer", "Graticule")
  @js.native
  class Graticule () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/layer", "Group")
  @js.native
  class Group ()
    extends typings.ol.groupMod.default {
    def this(opt_options: typings.ol.groupMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Heatmap")
  @js.native
  class Heatmap ()
    extends typings.ol.heatmapMod.default {
    def this(opt_options: typings.ol.heatmapMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Image")
  @js.native
  class Image ()
    extends typings.ol.imageMod.default {
    def this(opt_options: typings.ol.baseImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Layer")
  @js.native
  class Layer[SourceType /* <: typings.ol.sourceSourceMod.default */] protected ()
    extends typings.ol.layerLayerMod.default[SourceType] {
    def this(options: typings.ol.layerLayerMod.Options) = this()
  }
  
  @JSImport("ol/layer", "MapboxVector")
  @js.native
  class MapboxVector protected ()
    extends typings.ol.mapboxVectorMod.default {
    def this(options: typings.ol.mapboxVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Tile")
  @js.native
  class Tile ()
    extends typings.ol.tileMod.default {
    def this(opt_options: typings.ol.baseTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Vector")
  @js.native
  class Vector ()
    extends typings.ol.vectorMod.default {
    def this(opt_options: typings.ol.baseVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorImage")
  @js.native
  class VectorImage ()
    extends typings.ol.vectorImageMod.default {
    def this(opt_options: typings.ol.vectorImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorTile")
  @js.native
  class VectorTile ()
    extends typings.ol.vectorTileMod.default {
    def this(opt_options: typings.ol.vectorTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "WebGLPoints")
  @js.native
  class WebGLPoints protected ()
    extends typings.ol.webGLPointsMod.default {
    def this(options: typings.ol.webGLPointsMod.Options) = this()
  }
}
