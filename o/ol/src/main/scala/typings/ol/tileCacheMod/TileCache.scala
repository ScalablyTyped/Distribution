package typings.ol.tileCacheMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileCache
  extends typings.ol.structsLRUCacheMod.default[js.Any] {
  def expireCache(usedTiles: StringDictionary[typings.ol.tileRangeMod.default]): Unit = js.native
  def pruneExceptNewestZ(): Unit = js.native
}

