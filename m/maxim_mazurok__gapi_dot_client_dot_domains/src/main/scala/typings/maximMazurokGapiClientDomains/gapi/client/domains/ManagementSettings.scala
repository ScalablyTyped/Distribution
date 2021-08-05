package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagementSettings extends StObject {
  
  /** Output only. The renewal method for this `Registration`. */
  var renewalMethod: js.UndefOr[String] = js.undefined
  
  /** Controls whether the domain can be transferred to another registrar. */
  var transferLockState: js.UndefOr[String] = js.undefined
}
object ManagementSettings {
  
  inline def apply(): ManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementSettings]
  }
  
  extension [Self <: ManagementSettings](x: Self) {
    
    inline def setRenewalMethod(value: String): Self = StObject.set(x, "renewalMethod", value.asInstanceOf[js.Any])
    
    inline def setRenewalMethodUndefined: Self = StObject.set(x, "renewalMethod", js.undefined)
    
    inline def setTransferLockState(value: String): Self = StObject.set(x, "transferLockState", value.asInstanceOf[js.Any])
    
    inline def setTransferLockStateUndefined: Self = StObject.set(x, "transferLockState", js.undefined)
  }
}
