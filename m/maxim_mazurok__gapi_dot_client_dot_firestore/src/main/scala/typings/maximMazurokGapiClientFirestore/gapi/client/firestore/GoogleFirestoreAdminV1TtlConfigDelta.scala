package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1TtlConfigDelta extends StObject {
  
  /** Specifies how the TTL configuration is changing. */
  var changeType: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1TtlConfigDelta {
  
  inline def apply(): GoogleFirestoreAdminV1TtlConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1TtlConfigDelta]
  }
  
  extension [Self <: GoogleFirestoreAdminV1TtlConfigDelta](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
  }
}
