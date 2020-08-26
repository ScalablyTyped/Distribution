package typings.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var hits: Double = js.native
  var keys: Double = js.native
  var ksize: Double = js.native
  var misses: Double = js.native
  var vsize: Double = js.native
}

object Stats {
  @scala.inline
  def apply(hits: Double, keys: Double, ksize: Double, misses: Double, vsize: Double): Stats = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], ksize = ksize.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Double): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setKsize(value: Double): Self = this.set("ksize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisses(value: Double): Self = this.set("misses", value.asInstanceOf[js.Any])
    @scala.inline
    def setVsize(value: Double): Self = this.set("vsize", value.asInstanceOf[js.Any])
  }
  
}

