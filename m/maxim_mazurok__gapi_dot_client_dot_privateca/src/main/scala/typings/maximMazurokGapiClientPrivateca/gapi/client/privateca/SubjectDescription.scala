package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectDescription extends StObject {
  
  /** The "common name" of the distinguished name. */
  var commonName: js.UndefOr[String] = js.native
  
  /** The serial number encoded in lowercase hexadecimal. */
  var hexSerialNumber: js.UndefOr[String] = js.native
  
  /** For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time' - 'not_before_time'. */
  var lifetime: js.UndefOr[String] = js.native
  
  /** The time at which the certificate expires. */
  var notAfterTime: js.UndefOr[String] = js.native
  
  /** The time at which the certificate becomes valid. */
  var notBeforeTime: js.UndefOr[String] = js.native
  
  /** Contains distinguished name fields such as the location and organization. */
  var subject: js.UndefOr[Subject] = js.native
  
  /** The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.native
}
object SubjectDescription {
  
  @scala.inline
  def apply(): SubjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDescription]
  }
  
  @scala.inline
  implicit class SubjectDescriptionMutableBuilder[Self <: SubjectDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    @scala.inline
    def setHexSerialNumber(value: String): Self = StObject.set(x, "hexSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexSerialNumberUndefined: Self = StObject.set(x, "hexSerialNumber", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    @scala.inline
    def setNotAfterTime(value: String): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    @scala.inline
    def setNotBeforeTime(value: String): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAltName(value: SubjectAltNames): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
