package typings
package olLib.tileCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileCache
  extends olLib.structsLRUCacheMod.default[js.Any] {
  def expireCache(usedTiles: org.scalablytyped.runtime.StringDictionary[olLib.tileRangeMod.default]): scala.Unit = js.native
  def pruneExceptNewestZ(): scala.Unit = js.native
}

