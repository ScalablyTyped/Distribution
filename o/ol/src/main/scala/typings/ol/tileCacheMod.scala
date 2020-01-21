package typings.ol

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/TileCache", JSImport.Namespace)
@js.native
object tileCacheMod extends js.Object {
  @js.native
  trait TileCache
    extends typings.ol.lrucacheMod.default[js.Any] {
    def expireCache(usedTiles: StringDictionary[typings.ol.tileRangeMod.default]): Unit = js.native
    def pruneExceptNewestZ(): Unit = js.native
  }
  
  @js.native
  class default () extends TileCache {
    def this(opt_highWaterMark: Double) = this()
  }
  
}

