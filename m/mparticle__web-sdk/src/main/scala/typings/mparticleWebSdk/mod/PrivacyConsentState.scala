package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivacyConsentState extends StObject {
  
  var ConsentDocument: String
  
  var Consented: Boolean
  
  var HardwareId: String
  
  var Location: String
  
  var Timestamp: Double
}
object PrivacyConsentState {
  
  inline def apply(
    ConsentDocument: String,
    Consented: Boolean,
    HardwareId: String,
    Location: String,
    Timestamp: Double
  ): PrivacyConsentState = {
    val __obj = js.Dynamic.literal(ConsentDocument = ConsentDocument.asInstanceOf[js.Any], Consented = Consented.asInstanceOf[js.Any], HardwareId = HardwareId.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyConsentState]
  }
  
  extension [Self <: PrivacyConsentState](x: Self) {
    
    inline def setConsentDocument(value: String): Self = StObject.set(x, "ConsentDocument", value.asInstanceOf[js.Any])
    
    inline def setConsented(value: Boolean): Self = StObject.set(x, "Consented", value.asInstanceOf[js.Any])
    
    inline def setHardwareId(value: String): Self = StObject.set(x, "HardwareId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
