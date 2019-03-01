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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("ksize")(ksize)
    __obj.updateDynamic("misses")(misses)
    __obj.updateDynamic("vsize")(vsize)
    __obj.asInstanceOf[Stats]
  }
}

