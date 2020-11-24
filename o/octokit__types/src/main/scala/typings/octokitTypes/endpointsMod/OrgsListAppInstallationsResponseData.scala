package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsListAppInstallationsResponseData extends js.Object {
  
  var installations: js.Array[Permissions] = js.native
  
  var total_count: Double = js.native
}
object OrgsListAppInstallationsResponseData {
  
  @scala.inline
  def apply(installations: js.Array[Permissions], total_count: Double): OrgsListAppInstallationsResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListAppInstallationsResponseData]
  }
  
  @scala.inline
  implicit class OrgsListAppInstallationsResponseDataOps[Self <: OrgsListAppInstallationsResponseData] (val x: Self) extends AnyVal {
    
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
    def setInstallationsVarargs(value: Permissions*): Self = this.set("installations", js.Array(value :_*))
    
    @scala.inline
    def setInstallations(value: js.Array[Permissions]): Self = this.set("installations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
