package typings.nanoCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends js.Object {
  
  var age: Double = js.native
  
  var bytes: Double = js.native
  
  var count: Double = js.native
  
  var evictions: Double = js.native
  
  var hits: Double = js.native
  
  var misses: Double = js.native
}
object Stats {
  
  @scala.inline
  def apply(age: Double, bytes: Double, count: Double, evictions: Double, hits: Double, misses: Double): Stats = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any])
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
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictions(value: Double): Self = this.set("evictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMisses(value: Double): Self = this.set("misses", value.asInstanceOf[js.Any])
  }
}
