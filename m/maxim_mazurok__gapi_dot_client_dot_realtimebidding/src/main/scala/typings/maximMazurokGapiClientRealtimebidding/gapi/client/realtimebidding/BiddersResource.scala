package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiddersResource extends StObject {
  
  var creatives: CreativesResource
  
  var pretargetingConfigs: PretargetingConfigsResource
}
object BiddersResource {
  
  inline def apply(creatives: CreativesResource, pretargetingConfigs: PretargetingConfigsResource): BiddersResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], pretargetingConfigs = pretargetingConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiddersResource]
  }
  
  extension [Self <: BiddersResource](x: Self) {
    
    inline def setCreatives(value: CreativesResource): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    inline def setPretargetingConfigs(value: PretargetingConfigsResource): Self = StObject.set(x, "pretargetingConfigs", value.asInstanceOf[js.Any])
  }
}
