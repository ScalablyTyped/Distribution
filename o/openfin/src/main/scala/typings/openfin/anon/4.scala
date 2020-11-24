package typings.openfin.anon

import typings.openfin.windowOptionMod.ContentRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends js.Object {
  
  var newVal: js.UndefOr[ContentRedirect] = js.native
  
  var oldVal: js.UndefOr[ContentRedirect] = js.native
}
object `4` {
  
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
    
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
    def setNewVal(value: ContentRedirect): Self = this.set("newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: ContentRedirect): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
}
