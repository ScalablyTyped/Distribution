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
  
  @scala.inline
  def apply(): ComplianceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceInformation]
  }
  
  @scala.inline
  implicit class ComplianceInformationMutableBuilder[Self <: ComplianceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificationControls(value: NullableOption[js.Array[CertificationControl]]): Self = StObject.set(x, "certificationControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificationControlsNull: Self = StObject.set(x, "certificationControls", null)
    
    @scala.inline
    def setCertificationControlsUndefined: Self = StObject.set(x, "certificationControls", js.undefined)
    
    @scala.inline
    def setCertificationControlsVarargs(value: CertificationControl*): Self = StObject.set(x, "certificationControls", js.Array(value :_*))
    
    @scala.inline
    def setCertificationName(value: NullableOption[String]): Self = StObject.set(x, "certificationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificationNameNull: Self = StObject.set(x, "certificationName", null)
    
    @scala.inline
    def setCertificationNameUndefined: Self = StObject.set(x, "certificationName", js.undefined)
  }
}
