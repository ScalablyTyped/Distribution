package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectDescription extends StObject {
  
  /** The "common name" of the distinguished name. */
  var commonName: js.UndefOr[String] = js.undefined
  
  /** The serial number encoded in lowercase hexadecimal. */
  var hexSerialNumber: js.UndefOr[String] = js.undefined
  
  /** For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time' - 'not_before_time'. */
  var lifetime: js.UndefOr[String] = js.undefined
  
  /** The time at which the certificate expires. */
  var notAfterTime: js.UndefOr[String] = js.undefined
  
  /** The time at which the certificate becomes valid. */
  var notBeforeTime: js.UndefOr[String] = js.undefined
  
  /** Contains distinguished name fields such as the location and organization. */
  var subject: js.UndefOr[Subject] = js.undefined
  
  /** The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.undefined
}
object SubjectDescription {
  
  inline def apply(): SubjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDescription]
  }
  
  extension [Self <: SubjectDescription](x: Self) {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    inline def setHexSerialNumber(value: String): Self = StObject.set(x, "hexSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setHexSerialNumberUndefined: Self = StObject.set(x, "hexSerialNumber", js.undefined)
    
    inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setNotAfterTime(value: String): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    inline def setNotBeforeTime(value: String): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltName(value: SubjectAltNames): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
