package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInstanceRequest extends StObject {
  
  /** Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance. */
  var `type`: js.UndefOr[String] = js.undefined
}
object UpgradeInstanceRequest {
  
  inline def apply(): UpgradeInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceRequest]
  }
  
  extension [Self <: UpgradeInstanceRequest](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
