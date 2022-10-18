package typings.ol

import typings.ol.layerBaseTileMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerTileMod {
  
  @JSImport("ol/layer/Tile", JSImport.Default)
  @js.native
  open class default () extends TileLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait TileLayer
    extends typings.ol.layerBaseTileMod.default
}
