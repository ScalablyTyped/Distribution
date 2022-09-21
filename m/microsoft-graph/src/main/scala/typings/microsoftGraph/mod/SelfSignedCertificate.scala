package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfSignedCertificate extends StObject {
  
  var customKeyIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var key: js.UndefOr[NullableOption[String]] = js.undefined
  
  var keyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var thumbprint: js.UndefOr[NullableOption[String]] = js.undefined
  
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  var usage: js.UndefOr[NullableOption[String]] = js.undefined
}
object SelfSignedCertificate {
  
  inline def apply(): SelfSignedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfSignedCertificate]
  }
  
  extension [Self <: SelfSignedCertificate](x: Self) {
    
    inline def setCustomKeyIdentifier(value: NullableOption[String]): Self = StObject.set(x, "customKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyIdentifierNull: Self = StObject.set(x, "customKeyIdentifier", null)
    
    inline def setCustomKeyIdentifierUndefined: Self = StObject.set(x, "customKeyIdentifier", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: NullableOption[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setThumbprint(value: NullableOption[String]): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintNull: Self = StObject.set(x, "thumbprint", null)
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsage(value: NullableOption[String]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageNull: Self = StObject.set(x, "usage", null)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
