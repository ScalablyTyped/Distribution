package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIOptions extends js.Object {
  
  /**
    * @prop {string} [resource] -  The resource uri or token audience for which the token is needed.
    * For e.g. it can be:
    * - resourcemanagement endpoint "https://management.azure.com"(default) 
    * - management endpoint "https://management.core.windows.net/"
    */
  var resource: js.UndefOr[String] = js.native
}
object MSIOptions {
  
  @scala.inline
  def apply(): MSIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIOptions]
  }
  
  @scala.inline
  implicit class MSIOptionsOps[Self <: MSIOptions] (val x: Self) extends AnyVal {
    
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
