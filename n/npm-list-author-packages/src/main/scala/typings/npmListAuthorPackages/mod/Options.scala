package typings.npmListAuthorPackages.mod

import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`443`
import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`80`
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.http
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[`443` | `80`] = js.native
  
  /** registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[http | https] = js.native
  
  /** registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[String] = js.native
  
  /** author username (required). */
  var username: String = js.native
}
object Options {
  
  @scala.inline
  def apply(username: String): Options = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: `443` | `80`): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
  }
}
