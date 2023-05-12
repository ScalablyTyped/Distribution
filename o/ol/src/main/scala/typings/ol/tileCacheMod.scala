package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileCacheMod {
  
  @JSImport("ol/TileCache", JSImport.Default)
  @js.native
  open class default () extends TileCache {
    def this(highWaterMark: Double) = this()
  }
  
  @js.native
  trait TileCache
    extends typings.ol.structsLrucacheMod.default[Any] {
    
    /**
      * Prune all tiles from the cache that don't have the same z as the newest tile.
      */
    def pruneExceptNewestZ(): Unit = js.native
  }
}
