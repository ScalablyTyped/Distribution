package typings.nodeDashCache.nodeDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var hits: Double
  var keys: Double
  var ksize: Double
  var misses: Double
  var vsize: Double
}

object Stats {
  @scala.inline
  def apply(hits: Double, keys: Double, ksize: Double, misses: Double, vsize: Double): Stats = {
    val __obj = js.Dynamic.literal(hits = hits, keys = keys, ksize = ksize, misses = misses, vsize = vsize)
  
    __obj.asInstanceOf[Stats]
  }
}

