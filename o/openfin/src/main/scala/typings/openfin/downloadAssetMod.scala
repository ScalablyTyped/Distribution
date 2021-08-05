package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadAssetMod {
  
  trait AppAssetInfo extends StObject {
    
    var alias: String
    
    var args: js.UndefOr[String] = js.undefined
    
    var mandatory: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var target: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object AppAssetInfo {
    
    inline def apply(alias: String, src: String, version: String): AppAssetInfo = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAssetInfo]
    }
    
    extension [Self <: AppAssetInfo](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppAssetRequest extends StObject {
    
    var alias: String
  }
  object AppAssetRequest {
    
    inline def apply(alias: String): AppAssetRequest = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAssetRequest]
    }
    
    extension [Self <: AppAssetRequest](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeDownloadOptions extends StObject {
    
    var version: String
  }
  object RuntimeDownloadOptions {
    
    inline def apply(version: String): RuntimeDownloadOptions = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeDownloadOptions]
    }
    
    extension [Self <: RuntimeDownloadOptions](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeDownloadProgress extends StObject {
    
    var downloadedBytes: Double
    
    var totalBytes: Double
  }
  object RuntimeDownloadProgress {
    
    inline def apply(downloadedBytes: Double, totalBytes: Double): RuntimeDownloadProgress = {
      val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeDownloadProgress]
    }
    
    extension [Self <: RuntimeDownloadProgress](x: Self) {
      
      inline def setDownloadedBytes(value: Double): Self = StObject.set(x, "downloadedBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
