package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadPreloadMod {
  
  trait DownloadPreloadInfo extends StObject {
    
    var error: String
    
    var success: Boolean
    
    var url: js.UndefOr[String] = js.undefined
  }
  object DownloadPreloadInfo {
    
    inline def apply(error: String, success: Boolean): DownloadPreloadInfo = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPreloadInfo]
    }
    
    extension [Self <: DownloadPreloadInfo](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait DownloadPreloadOption extends StObject {
    
    var url: String
  }
  object DownloadPreloadOption {
    
    inline def apply(url: String): DownloadPreloadOption = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPreloadOption]
    }
    
    extension [Self <: DownloadPreloadOption](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
