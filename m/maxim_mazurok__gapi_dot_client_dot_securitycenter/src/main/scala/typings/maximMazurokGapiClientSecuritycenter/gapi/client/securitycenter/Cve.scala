package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cve extends StObject {
  
  /** Describe Common Vulnerability Scoring System specified at https://www.first.org/cvss/v3.1/specification-document */
  var cvssv3: js.UndefOr[Cvssv3] = js.undefined
  
  /** The unique identifier for the vulnerability. e.g. CVE-2021-34527 */
  var id: js.UndefOr[String] = js.undefined
  
  /** Additional information about the CVE. e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527 */
  var references: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Whether upstream fix is available for the CVE. */
  var upstreamFixAvailable: js.UndefOr[Boolean] = js.undefined
}
object Cve {
  
  inline def apply(): Cve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cve] (val x: Self) extends AnyVal {
    
    inline def setCvssv3(value: Cvssv3): Self = StObject.set(x, "cvssv3", value.asInstanceOf[js.Any])
    
    inline def setCvssv3Undefined: Self = StObject.set(x, "cvssv3", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReferences(value: js.Array[Reference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: Reference*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setUpstreamFixAvailable(value: Boolean): Self = StObject.set(x, "upstreamFixAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpstreamFixAvailableUndefined: Self = StObject.set(x, "upstreamFixAvailable", js.undefined)
  }
}
