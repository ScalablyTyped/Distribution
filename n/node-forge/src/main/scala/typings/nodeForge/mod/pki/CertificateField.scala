package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateField extends CertificateFieldOptions {
  
  var extensions: js.UndefOr[js.Array[_]] = js.native
  
  var value: js.UndefOr[js.Array[_] | String] = js.native
  
  var valueConstructed: js.UndefOr[Boolean] = js.native
  
  var valueTagClass: js.UndefOr[Class] = js.native
}
object CertificateField {
  
  @scala.inline
  def apply(): CertificateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateField]
  }
  
  @scala.inline
  implicit class CertificateFieldOps[Self <: CertificateField] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: js.Any*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[_]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_] | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueConstructed(value: Boolean): Self = this.set("valueConstructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueConstructed: Self = this.set("valueConstructed", js.undefined)
    
    @scala.inline
    def setValueTagClass(value: Class): Self = this.set("valueTagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTagClass: Self = this.set("valueTagClass", js.undefined)
  }
}
