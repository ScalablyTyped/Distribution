package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicStrategyOptions[req /* <: Boolean */] extends js.Object {
  
  var passReqToCallback: js.UndefOr[req] = js.native
  
  var realm: js.UndefOr[String] = js.native
}
object BasicStrategyOptions {
  
  @scala.inline
  def apply[req /* <: Boolean */](): BasicStrategyOptions[req] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicStrategyOptions[req]]
  }
  
  @scala.inline
  implicit class BasicStrategyOptionsOps[Self <: BasicStrategyOptions[_], req /* <: Boolean */] (val x: Self with BasicStrategyOptions[req]) extends AnyVal {
    
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
    def setPassReqToCallback(value: req): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
  }
}
