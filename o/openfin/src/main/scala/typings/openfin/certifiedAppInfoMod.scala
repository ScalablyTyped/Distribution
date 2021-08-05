package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certifiedAppInfoMod {
  
  trait CertifiedAppInfo extends StObject {
    
    var isCertified: js.UndefOr[Boolean] = js.undefined
    
    var isOptedIntoCertfiedApp: js.UndefOr[Boolean] = js.undefined
    
    var isPresentInAppDirectory: js.UndefOr[Boolean] = js.undefined
    
    var isRunning: Boolean
    
    var isSSLCertified: js.UndefOr[Boolean] = js.undefined
  }
  object CertifiedAppInfo {
    
    inline def apply(isRunning: Boolean): CertifiedAppInfo = {
      val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertifiedAppInfo]
    }
    
    extension [Self <: CertifiedAppInfo](x: Self) {
      
      inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      inline def setIsCertifiedUndefined: Self = StObject.set(x, "isCertified", js.undefined)
      
      inline def setIsOptedIntoCertfiedApp(value: Boolean): Self = StObject.set(x, "isOptedIntoCertfiedApp", value.asInstanceOf[js.Any])
      
      inline def setIsOptedIntoCertfiedAppUndefined: Self = StObject.set(x, "isOptedIntoCertfiedApp", js.undefined)
      
      inline def setIsPresentInAppDirectory(value: Boolean): Self = StObject.set(x, "isPresentInAppDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsPresentInAppDirectoryUndefined: Self = StObject.set(x, "isPresentInAppDirectory", js.undefined)
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setIsSSLCertified(value: Boolean): Self = StObject.set(x, "isSSLCertified", value.asInstanceOf[js.Any])
      
      inline def setIsSSLCertifiedUndefined: Self = StObject.set(x, "isSSLCertified", js.undefined)
    }
  }
}
