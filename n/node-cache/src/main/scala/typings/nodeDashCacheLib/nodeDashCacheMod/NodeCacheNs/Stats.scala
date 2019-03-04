package typings
package nodeDashCacheLib.nodeDashCacheMod.NodeCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var hits: scala.Double
  var keys: scala.Double
  var ksize: scala.Double
  var misses: scala.Double
  var vsize: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    hits: scala.Double,
    keys: scala.Double,
    ksize: scala.Double,
    misses: scala.Double,
    vsize: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(hits = hits, keys = keys, ksize = ksize, misses = misses, vsize = vsize)
  
    __obj.asInstanceOf[Stats]
  }
}

