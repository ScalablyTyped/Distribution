package typings.passportAuthToken.mod

import typings.passportAuthToken.passportAuthTokenBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOptions extends js.Object {
  
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  
  var headerFields: js.UndefOr[js.Array[String]] = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var params: js.UndefOr[Boolean] = js.native
  
  var passReqToCallback: js.UndefOr[`false`] = js.native
  
  var session: js.UndefOr[Boolean] = js.native
  
  var tokenFields: js.UndefOr[js.Array[String]] = js.native
}
object StrategyOptions {
  
  @scala.inline
  def apply(): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrategyOptions]
  }
  
  @scala.inline
  implicit class StrategyOptionsOps[Self <: StrategyOptions] (val x: Self) extends AnyVal {
    
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
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
    
    @scala.inline
    def setHeaderFieldsVarargs(value: String*): Self = this.set("headerFields", js.Array(value :_*))
    
    @scala.inline
    def setHeaderFields(value: js.Array[String]): Self = this.set("headerFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFields: Self = this.set("headerFields", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setParams(value: Boolean): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPassReqToCallback(value: `false`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setTokenFieldsVarargs(value: String*): Self = this.set("tokenFields", js.Array(value :_*))
    
    @scala.inline
    def setTokenFields(value: js.Array[String]): Self = this.set("tokenFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenFields: Self = this.set("tokenFields", js.undefined)
  }
}
