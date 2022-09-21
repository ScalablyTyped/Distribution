package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceInformation extends StObject {
  
  // Collection of the certification controls associated with certification
  var certificationControls: js.UndefOr[NullableOption[js.Array[CertificationControl]]] = js.undefined
  
  // Compliance certification name (for example, ISO 27018:2014, GDPR, FedRAMP, NIST 800-171)
  var certificationName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ComplianceInformation {
  
  inline def apply(): ComplianceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceInformation]
  }
  
  extension [Self <: ComplianceInformation](x: Self) {
    
    inline def setCertificationControls(value: NullableOption[js.Array[CertificationControl]]): Self = StObject.set(x, "certificationControls", value.asInstanceOf[js.Any])
    
    inline def setCertificationControlsNull: Self = StObject.set(x, "certificationControls", null)
    
    inline def setCertificationControlsUndefined: Self = StObject.set(x, "certificationControls", js.undefined)
    
    inline def setCertificationControlsVarargs(value: CertificationControl*): Self = StObject.set(x, "certificationControls", js.Array(value*))
    
    inline def setCertificationName(value: NullableOption[String]): Self = StObject.set(x, "certificationName", value.asInstanceOf[js.Any])
    
    inline def setCertificationNameNull: Self = StObject.set(x, "certificationName", null)
    
    inline def setCertificationNameUndefined: Self = StObject.set(x, "certificationName", js.undefined)
  }
}
