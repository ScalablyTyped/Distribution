package typings.mendixmodelsdk.configurationMod.configuration

import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.transportationMod.ITransportation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISdkConfig extends js.Object {
  
  var client: js.UndefOr[IModelServerClient] = js.native
  
  var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.native
  
  var endPoint: js.UndefOr[String] = js.native
  
  var transportation: js.UndefOr[ITransportation] = js.native
}
object ISdkConfig {
  
  @scala.inline
  def apply(): ISdkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISdkConfig]
  }
  
  @scala.inline
  implicit class ISdkConfigOps[Self <: ISdkConfig] (val x: Self) extends AnyVal {
    
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
    def setClient(value: IModelServerClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setCredentials(value: IBackendCredentials | ISdkCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setEndPoint(value: String): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPoint: Self = this.set("endPoint", js.undefined)
    
    @scala.inline
    def setTransportation(value: ITransportation): Self = this.set("transportation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportation: Self = this.set("transportation", js.undefined)
  }
}
