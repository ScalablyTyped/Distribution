package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1IndexConfigDelta extends StObject {
  
  /** Specifies how the index is changing. */
  var changeType: js.UndefOr[String] = js.undefined
  
  /** The index being changed. */
  var index: js.UndefOr[GoogleFirestoreAdminV1Index] = js.undefined
}
object GoogleFirestoreAdminV1IndexConfigDelta {
  
  inline def apply(): GoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1IndexConfigDelta]
  }
  
  extension [Self <: GoogleFirestoreAdminV1IndexConfigDelta](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setIndex(value: GoogleFirestoreAdminV1Index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
