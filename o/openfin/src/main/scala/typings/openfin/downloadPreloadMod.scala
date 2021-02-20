package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadPreloadMod {
  
  @js.native
  trait DownloadPreloadInfo extends StObject {
    
    var error: String = js.native
    
    var success: Boolean = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object DownloadPreloadInfo {
    
    @scala.inline
    def apply(error: String, success: Boolean): DownloadPreloadInfo = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPreloadInfo]
    }
    
    @scala.inline
    implicit class DownloadPreloadInfoMutableBuilder[Self <: DownloadPreloadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait DownloadPreloadOption extends StObject {
    
    var url: String = js.native
  }
  object DownloadPreloadOption {
    
    @scala.inline
    def apply(url: String): DownloadPreloadOption = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPreloadOption]
    }
    
    @scala.inline
    implicit class DownloadPreloadOptionMutableBuilder[Self <: DownloadPreloadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
