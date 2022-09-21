package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1Binding extends StObject {
  
  /** Name for binding. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Namespace for binding. */
  var ns: js.UndefOr[String] = js.undefined
  
  /** The Role or ClusterRole referenced by the binding. */
  var role: js.UndefOr[Role] = js.undefined
  
  /** Represents the subjects(s) bound to the role. Not always available for PATCH requests. */
  var subjects: js.UndefOr[js.Array[Subject]] = js.undefined
}
object GoogleCloudSecuritycenterV1Binding {
  
  inline def apply(): GoogleCloudSecuritycenterV1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1Binding]
  }
  
  extension [Self <: GoogleCloudSecuritycenterV1Binding](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
