package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgUnitInfo extends StObject {
  
  /** Org unit to search, as provided by the Admin SDK Directory API. */
  var orgUnitId: js.UndefOr[String] = js.undefined
}
object OrgUnitInfo {
  
  inline def apply(): OrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgUnitInfo]
  }
  
  extension [Self <: OrgUnitInfo](x: Self) {
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
