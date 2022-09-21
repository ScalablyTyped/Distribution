package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateField
  extends StObject
     with CertificateFieldOptions {
  
  var extensions: js.UndefOr[js.Array[Any]] = js.undefined
  
  var value: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  var valueConstructed: js.UndefOr[Boolean] = js.undefined
  
  var valueTagClass: js.UndefOr[Class] = js.undefined
}
object CertificateField {
  
  inline def apply(): CertificateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateField]
  }
  
  extension [Self <: CertificateField](x: Self) {
    
    inline def setExtensions(value: js.Array[Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Any*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setValue(value: js.Array[Any] | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueConstructed(value: Boolean): Self = StObject.set(x, "valueConstructed", value.asInstanceOf[js.Any])
    
    inline def setValueConstructedUndefined: Self = StObject.set(x, "valueConstructed", js.undefined)
    
    inline def setValueTagClass(value: Class): Self = StObject.set(x, "valueTagClass", value.asInstanceOf[js.Any])
    
    inline def setValueTagClassUndefined: Self = StObject.set(x, "valueTagClass", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
