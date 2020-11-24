package typings.openfin.anon

import typings.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends js.Object {
  
  var newVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  
  var oldVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
    
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
    def setNewValVarargs(value: CustomRequestHeaders*): Self = this.set("newVal", js.Array(value :_*))
    
    @scala.inline
    def setNewVal(value: js.Array[CustomRequestHeaders]): Self = this.set("newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    
    @scala.inline
    def setOldValVarargs(value: CustomRequestHeaders*): Self = this.set("oldVal", js.Array(value :_*))
    
    @scala.inline
    def setOldVal(value: js.Array[CustomRequestHeaders]): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
}
