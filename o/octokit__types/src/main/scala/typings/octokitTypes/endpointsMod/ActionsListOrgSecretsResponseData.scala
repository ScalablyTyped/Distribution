package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Createdat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListOrgSecretsResponseData extends js.Object {
  
  var secrets: js.Array[Createdat] = js.native
  
  var total_count: Double = js.native
}
object ActionsListOrgSecretsResponseData {
  
  @scala.inline
  def apply(secrets: js.Array[Createdat], total_count: Double): ActionsListOrgSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListOrgSecretsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListOrgSecretsResponseDataOps[Self <: ActionsListOrgSecretsResponseData] (val x: Self) extends AnyVal {
    
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
    def setSecretsVarargs(value: Createdat*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[Createdat]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
