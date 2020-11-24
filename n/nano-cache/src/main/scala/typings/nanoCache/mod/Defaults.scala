package typings.nanoCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults extends js.Object {
  
  var bytes: Double = js.native
  
  var compress: Boolean = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var maxEvictBytes: Double = js.native
  
  var minFreeMem: Double = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object Defaults {
  
  @scala.inline
  def apply(bytes: Double, compress: Boolean, maxEvictBytes: Double, minFreeMem: Double): Defaults = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], maxEvictBytes = maxEvictBytes.asInstanceOf[js.Any], minFreeMem = minFreeMem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults]
  }
  
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEvictBytes(value: Double): Self = this.set("maxEvictBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFreeMem(value: Double): Self = this.set("minFreeMem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
