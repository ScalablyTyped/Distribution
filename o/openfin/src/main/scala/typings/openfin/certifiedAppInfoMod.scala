package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certifiedAppInfoMod {
  
  @js.native
  trait CertifiedAppInfo extends StObject {
    
    var isCertified: js.UndefOr[Boolean] = js.native
    
    var isOptedIntoCertfiedApp: js.UndefOr[Boolean] = js.native
    
    var isPresentInAppDirectory: js.UndefOr[Boolean] = js.native
    
    var isRunning: Boolean = js.native
    
    var isSSLCertified: js.UndefOr[Boolean] = js.native
  }
  object CertifiedAppInfo {
    
    @scala.inline
    def apply(isRunning: Boolean): CertifiedAppInfo = {
      val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertifiedAppInfo]
    }
    
    @scala.inline
    implicit class CertifiedAppInfoMutableBuilder[Self <: CertifiedAppInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCertifiedUndefined: Self = StObject.set(x, "isCertified", js.undefined)
      
      @scala.inline
      def setIsOptedIntoCertfiedApp(value: Boolean): Self = StObject.set(x, "isOptedIntoCertfiedApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOptedIntoCertfiedAppUndefined: Self = StObject.set(x, "isOptedIntoCertfiedApp", js.undefined)
      
      @scala.inline
      def setIsPresentInAppDirectory(value: Boolean): Self = StObject.set(x, "isPresentInAppDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPresentInAppDirectoryUndefined: Self = StObject.set(x, "isPresentInAppDirectory", js.undefined)
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSSLCertified(value: Boolean): Self = StObject.set(x, "isSSLCertified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSSLCertifiedUndefined: Self = StObject.set(x, "isSSLCertified", js.undefined)
    }
  }
}
