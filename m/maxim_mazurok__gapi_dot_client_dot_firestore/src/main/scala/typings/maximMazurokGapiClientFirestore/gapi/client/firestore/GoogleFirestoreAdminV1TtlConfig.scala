package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1TtlConfig extends StObject {
  
  /** Output only. The state of the TTL configuration. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1TtlConfig {
  
  inline def apply(): GoogleFirestoreAdminV1TtlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1TtlConfig]
  }
  
  extension [Self <: GoogleFirestoreAdminV1TtlConfig](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
