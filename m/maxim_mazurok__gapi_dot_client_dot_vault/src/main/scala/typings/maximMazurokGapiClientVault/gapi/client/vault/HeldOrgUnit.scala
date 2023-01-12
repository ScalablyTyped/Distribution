package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldOrgUnit extends StObject {
  
  /** When the organizational unit was put on hold. This property is immutable. */
  var holdTime: js.UndefOr[String] = js.undefined
  
  /** The organizational unit's immutable ID as provided by the [Admin SDK](https://developers.google.com/admin-sdk/). */
  var orgUnitId: js.UndefOr[String] = js.undefined
}
object HeldOrgUnit {
  
  inline def apply(): HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldOrgUnit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeldOrgUnit] (val x: Self) extends AnyVal {
    
    inline def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    inline def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
