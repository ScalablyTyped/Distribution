package typings.mem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheStorageContent[ValueType] extends js.Object {
  
  var data: ValueType = js.native
  
  var maxAge: Double = js.native
}
object CacheStorageContent {
  
  @scala.inline
  def apply[ValueType](data: ValueType, maxAge: Double): CacheStorageContent[ValueType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageContent[ValueType]]
  }
  
  @scala.inline
  implicit class CacheStorageContentOps[Self <: CacheStorageContent[_], ValueType] (val x: Self with CacheStorageContent[ValueType]) extends AnyVal {
    
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
    def setData(value: ValueType): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
  }
}
