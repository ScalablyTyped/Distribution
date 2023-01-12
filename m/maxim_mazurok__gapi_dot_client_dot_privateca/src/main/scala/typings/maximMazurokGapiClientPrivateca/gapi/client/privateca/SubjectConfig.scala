package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectConfig extends StObject {
  
  /** Required. Contains distinguished name fields such as the common name, location and organization. */
  var subject: js.UndefOr[Subject] = js.undefined
  
  /** Optional. The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.undefined
}
object SubjectConfig {
  
  inline def apply(): SubjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectConfig] (val x: Self) extends AnyVal {
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltName(value: SubjectAltNames): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
