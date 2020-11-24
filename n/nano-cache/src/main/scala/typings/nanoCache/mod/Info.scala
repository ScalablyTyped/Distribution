package typings.nanoCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  var accessed: Double = js.native
  
  var bytes: Double = js.native
  
  var compressed: Boolean = js.native
  
  var cost: Double = js.native
  
  var expires: Double = js.native
  
  var hits: Double = js.native
  
  var key: String = js.native
  
  var limit: Double = js.native
  
  var ttl: Double = js.native
  
  var updated: Double = js.native
  
  var value: js.Any = js.native
}
object Info {
  
  @scala.inline
  def apply(
    accessed: Double,
    bytes: Double,
    compressed: Boolean,
    cost: Double,
    expires: Double,
    hits: Double,
    key: String,
    limit: Double,
    ttl: Double,
    updated: Double,
    value: js.Any
  ): Info = {
    val __obj = js.Dynamic.literal(accessed = accessed.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
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
    def setAccessed(value: Double): Self = this.set("accessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
