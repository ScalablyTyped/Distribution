package typings.ol

import typings.ol.groupMod.Options
import typings.ol.groupMod.default
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
    extends typings.ol.heatmapMod.default {
    def this(opt_options: typings.ol.heatmapMod.Options) = this()
  }
  
  @js.native
  class Image ()
    extends typings.ol.imageMod.default {
    def this(opt_options: typings.ol.baseImageMod.Options) = this()
  }
  
  @js.native
  class Layer[SourceType /* <: typings.ol.sourceSourceMod.default */] protected ()
    extends typings.ol.layerLayerMod.default[SourceType] {
    def this(options: typings.ol.layerLayerMod.Options) = this()
  }
  
  @js.native
  class Tile ()
    extends typings.ol.tileMod.default {
    def this(opt_options: typings.ol.baseTileMod.Options) = this()
  }
  
  @js.native
  class Vector ()
    extends typings.ol.vectorMod.default {
    def this(opt_options: typings.ol.baseVectorMod.Options) = this()
  }
  
  @js.native
  class VectorImage ()
    extends typings.ol.vectorImageMod.default {
    def this(opt_options: typings.ol.vectorImageMod.Options) = this()
  }
  
  @js.native
  class VectorTile ()
    extends typings.ol.vectorTileMod.default {
    def this(opt_options: typings.ol.vectorTileMod.Options) = this()
  }
  
}

