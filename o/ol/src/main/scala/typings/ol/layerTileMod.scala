package typings.ol

import typings.ol.layerBaseTileMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Tile", JSImport.Namespace)
@js.native
object layerTileMod extends js.Object {
  @js.native
  trait TileLayer
    extends typings.ol.layerBaseTileMod.default
  
  @js.native
  class default () extends TileLayer {
    def this(opt_options: Options) = this()
  }
  
}

