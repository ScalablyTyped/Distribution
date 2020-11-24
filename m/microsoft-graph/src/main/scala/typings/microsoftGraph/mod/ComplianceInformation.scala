package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceInformation extends js.Object {
  
  // Collection of the certification controls associated with certification
  var certificationControls: js.UndefOr[NullableOption[js.Array[CertificationControl]]] = js.native
  
  // Compliance certification name (for example, ISO 27018:2014, GDPR, FedRAMP, NIST 800-171)
  var certificationName: js.UndefOr[NullableOption[String]] = js.native
}
object ComplianceInformation {
  
  @scala.inline
  def apply(): ComplianceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceInformation]
  }
  
  @scala.inline
  implicit class ComplianceInformationOps[Self <: ComplianceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificationControlsVarargs(value: CertificationControl*): Self = this.set("certificationControls", js.Array(value :_*))
    
    @scala.inline
    def setCertificationControls(value: NullableOption[js.Array[CertificationControl]]): Self = this.set("certificationControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificationControls: Self = this.set("certificationControls", js.undefined)
    
    @scala.inline
    def setCertificationControlsNull: Self = this.set("certificationControls", null)
    
    @scala.inline
    def setCertificationName(value: NullableOption[String]): Self = this.set("certificationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificationName: Self = this.set("certificationName", js.undefined)
    
    @scala.inline
    def setCertificationNameNull: Self = this.set("certificationName", null)
  }
}
