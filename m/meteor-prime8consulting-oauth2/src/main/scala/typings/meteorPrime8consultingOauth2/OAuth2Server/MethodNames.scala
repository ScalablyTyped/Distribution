package typings.meteorPrime8consultingOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodNames extends js.Object {
  
  /**
    * Constant string representing th authCodeGran meteor method.
    */
  var authCodeGrant: String = js.native
}
object MethodNames {
  
  @scala.inline
  def apply(authCodeGrant: String): MethodNames = {
    val __obj = js.Dynamic.literal(authCodeGrant = authCodeGrant.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodNames]
  }
  
  @scala.inline
  implicit class MethodNamesOps[Self <: MethodNames] (val x: Self) extends AnyVal {
    
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
    def setAuthCodeGrant(value: String): Self = this.set("authCodeGrant", value.asInstanceOf[js.Any])
  }
}
