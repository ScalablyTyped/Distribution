package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateField
  extends StObject
     with CertificateFieldOptions {
  
  var extensions: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var value: js.UndefOr[js.Array[js.Any] | String] = js.undefined
  
  var valueConstructed: js.UndefOr[Boolean] = js.undefined
  
  var valueTagClass: js.UndefOr[Class] = js.undefined
}
object CertificateField {
  
  @scala.inline
  def apply(): CertificateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateField]
  }
  
  @scala.inline
  implicit class CertificateFieldMutableBuilder[Self <: CertificateField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: js.Array[js.Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: js.Any*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[js.Any] | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueConstructed(value: Boolean): Self = StObject.set(x, "valueConstructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueConstructedUndefined: Self = StObject.set(x, "valueConstructed", js.undefined)
    
    @scala.inline
    def setValueTagClass(value: Class): Self = StObject.set(x, "valueTagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTagClassUndefined: Self = StObject.set(x, "valueTagClass", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
