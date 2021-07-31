package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileCacheMod {
  
  @JSImport("ol/TileCache", JSImport.Default)
  @js.native
  class default () extends TileCache
  
  @js.native
  trait TileCache
    extends typings.ol.lrucacheMod.default[js.Any] {
    
    def expireCache(usedTiles: StringDictionary[Boolean]): Unit = js.native
    
    /**
      * Prune all tiles from the cache that don't have the same z as the newest tile.
      */
    def pruneExceptNewestZ(): Unit = js.native
  }
}
