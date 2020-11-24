package typings.msgpack5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsgPackOptions extends js.Object {
  
  var compatibilityMode: js.UndefOr[Boolean] = js.native
  
  var forceFloat64: js.UndefOr[Boolean] = js.native
}
object MsgPackOptions {
  
  @scala.inline
  def apply(): MsgPackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsgPackOptions]
  }
  
  @scala.inline
  implicit class MsgPackOptionsOps[Self <: MsgPackOptions] (val x: Self) extends AnyVal {
    
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
    def setCompatibilityMode(value: Boolean): Self = this.set("compatibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibilityMode: Self = this.set("compatibilityMode", js.undefined)
    
    @scala.inline
    def setForceFloat64(value: Boolean): Self = this.set("forceFloat64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFloat64: Self = this.set("forceFloat64", js.undefined)
  }
}
