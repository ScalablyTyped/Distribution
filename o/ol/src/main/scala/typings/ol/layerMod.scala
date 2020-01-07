package typings.ol

import typings.ol.layerGroupMod.Options
import typings.ol.layerGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  @js.native
  class Group () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Heatmap ()
    extends typings.ol.layerHeatmapMod.default {
    def this(opt_options: typings.ol.layerHeatmapMod.Options) = this()
  }
  
  @js.native
  class Image ()
    extends typings.ol.layerImageMod.default {
    def this(opt_options: typings.ol.layerBaseImageMod.Options) = this()
  }
  
  @js.native
  class Layer[SourceType /* <: typings.ol.sourceSourceMod.default */] protected ()
    extends typings.ol.layerLayerMod.default[SourceType] {
    def this(options: typings.ol.layerLayerMod.Options) = this()
  }
  
  @js.native
  class Tile ()
    extends typings.ol.layerTileMod.default {
    def this(opt_options: typings.ol.layerBaseTileMod.Options) = this()
  }
  
  @js.native
  class Vector ()
    extends typings.ol.layerVectorMod.default {
    def this(opt_options: typings.ol.layerBaseVectorMod.Options) = this()
  }
  
  @js.native
  class VectorImage ()
    extends typings.ol.layerVectorImageMod.default {
    def this(opt_options: typings.ol.layerVectorImageMod.Options) = this()
  }
  
  @js.native
  class VectorTile ()
    extends typings.ol.layerVectorTileMod.default {
    def this(opt_options: typings.ol.layerVectorTileMod.Options) = this()
  }
  
}

