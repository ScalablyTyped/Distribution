package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiddersResource extends js.Object {
  
  var creatives: CreativesResource = js.native
  
  var pretargetingConfigs: PretargetingConfigsResource = js.native
}
object BiddersResource {
  
  @scala.inline
  def apply(creatives: CreativesResource, pretargetingConfigs: PretargetingConfigsResource): BiddersResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], pretargetingConfigs = pretargetingConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiddersResource]
  }
  
  @scala.inline
  implicit class BiddersResourceOps[Self <: BiddersResource] (val x: Self) extends AnyVal {
    
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
    def setCreatives(value: CreativesResource): Self = this.set("creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretargetingConfigs(value: PretargetingConfigsResource): Self = this.set("pretargetingConfigs", value.asInstanceOf[js.Any])
  }
}
