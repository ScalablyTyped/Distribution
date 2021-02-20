package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectConfig extends StObject {
  
  /** Optional. The "common name" of the distinguished name. */
  var commonName: js.UndefOr[String] = js.native
  
  /** Required. Contains distinguished name fields such as the location and organization. */
  var subject: js.UndefOr[Subject] = js.native
  
  /** Optional. The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.native
}
object SubjectConfig {
  
  @scala.inline
  def apply(): SubjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectConfig]
  }
  
  @scala.inline
  implicit class SubjectConfigMutableBuilder[Self <: SubjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
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
