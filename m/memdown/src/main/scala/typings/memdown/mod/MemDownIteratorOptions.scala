package typings.memdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemDownIteratorOptions extends js.Object {
  
  var keyAsBuffer: js.UndefOr[Boolean] = js.native
  
  var valueAsBuffer: js.UndefOr[Boolean] = js.native
}
object MemDownIteratorOptions {
  
  @scala.inline
  def apply(): MemDownIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemDownIteratorOptions]
  }
  
  @scala.inline
  implicit class MemDownIteratorOptionsOps[Self <: MemDownIteratorOptions] (val x: Self) extends AnyVal {
    
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
    def setKeyAsBuffer(value: Boolean): Self = this.set("keyAsBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAsBuffer: Self = this.set("keyAsBuffer", js.undefined)
    
    @scala.inline
    def setValueAsBuffer(value: Boolean): Self = this.set("valueAsBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAsBuffer: Self = this.set("valueAsBuffer", js.undefined)
  }
}
