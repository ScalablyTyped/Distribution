package typings.pkijs.certificatePoliciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatePolicies extends js.Object {
  
  var certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object CertificatePolicies {
  
  @scala.inline
  def apply(
    certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertificatePolicies = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[CertificatePolicies]
  }
  
  @scala.inline
  implicit class CertificatePoliciesOps[Self <: CertificatePolicies] (val x: Self) extends AnyVal {
    
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
    def setCertificatePoliciesVarargs(value: typings.pkijs.policyInformationMod.default*): Self = this.set("certificatePolicies", js.Array(value :_*))
    
    @scala.inline
    def setCertificatePolicies(value: js.Array[typings.pkijs.policyInformationMod.default]): Self = this.set("certificatePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
