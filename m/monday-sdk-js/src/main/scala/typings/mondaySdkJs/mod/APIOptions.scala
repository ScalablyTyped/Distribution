package typings.mondaySdkJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIOptions extends js.Object {
  
  /**
    * Access token for the API
    * If not set, will use the credentials of the current user (client only)
    */
  var token: js.UndefOr[String] = js.native
  
  /**
    * An object containing GraphQL query variables
    */
  var variables: js.UndefOr[js.Object] = js.native
}
object APIOptions {
  
  @scala.inline
  def apply(): APIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIOptions]
  }
  
  @scala.inline
  implicit class APIOptionsOps[Self <: APIOptions] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
