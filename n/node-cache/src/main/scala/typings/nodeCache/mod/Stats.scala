package typings.nodeCache.mod

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
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], ksize = ksize.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

