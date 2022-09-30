package typings.pkijs.anon

import typings.pkijs.mod.CertIDSchema
import typings.pkijs.mod.ExtensionSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.UndefOr[ExtensionSchema] = js.undefined
  
  var reqCert: js.UndefOr[CertIDSchema] = js.undefined
  
  var singleRequestExtensions: js.UndefOr[String] = js.undefined
}
object Extensions {
  
  inline def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(value: ExtensionSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setReqCert(value: CertIDSchema): Self = StObject.set(x, "reqCert", value.asInstanceOf[js.Any])
    
    inline def setReqCertUndefined: Self = StObject.set(x, "reqCert", js.undefined)
    
    inline def setSingleRequestExtensions(value: String): Self = StObject.set(x, "singleRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensionsUndefined: Self = StObject.set(x, "singleRequestExtensions", js.undefined)
  }
}
