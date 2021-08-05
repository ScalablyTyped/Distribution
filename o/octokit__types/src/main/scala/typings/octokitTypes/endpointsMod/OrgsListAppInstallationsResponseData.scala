package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsListAppInstallationsResponseData extends StObject {
  
  var installations: js.Array[Permissions]
  
  var total_count: Double
}
object OrgsListAppInstallationsResponseData {
  
  inline def apply(installations: js.Array[Permissions], total_count: Double): OrgsListAppInstallationsResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListAppInstallationsResponseData]
  }
  
  extension [Self <: OrgsListAppInstallationsResponseData](x: Self) {
    
    inline def setInstallations(value: js.Array[Permissions]): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    inline def setInstallationsVarargs(value: Permissions*): Self = StObject.set(x, "installations", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
