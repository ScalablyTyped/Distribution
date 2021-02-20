package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiddersResource extends StObject {
  
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
  implicit class BiddersResourceMutableBuilder[Self <: BiddersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatives(value: CreativesResource): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretargetingConfigs(value: PretargetingConfigsResource): Self = StObject.set(x, "pretargetingConfigs", value.asInstanceOf[js.Any])
  }
}
