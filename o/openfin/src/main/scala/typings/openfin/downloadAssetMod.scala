package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadAssetMod {
  
  @js.native
  trait AppAssetInfo extends StObject {
    
    var alias: String = js.native
    
    var args: js.UndefOr[String] = js.native
    
    var mandatory: js.UndefOr[Boolean] = js.native
    
    var src: String = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var version: String = js.native
  }
  object AppAssetInfo {
    
    @scala.inline
    def apply(alias: String, src: String, version: String): AppAssetInfo = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAssetInfo]
    }
    
    @scala.inline
    implicit class AppAssetInfoMutableBuilder[Self <: AppAssetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppAssetRequest extends StObject {
    
    var alias: String = js.native
  }
  object AppAssetRequest {
    
    @scala.inline
    def apply(alias: String): AppAssetRequest = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAssetRequest]
    }
    
    @scala.inline
    implicit class AppAssetRequestMutableBuilder[Self <: AppAssetRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuntimeDownloadOptions extends StObject {
    
    var version: String = js.native
  }
  object RuntimeDownloadOptions {
    
    @scala.inline
    def apply(version: String): RuntimeDownloadOptions = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeDownloadOptions]
    }
    
    @scala.inline
    implicit class RuntimeDownloadOptionsMutableBuilder[Self <: RuntimeDownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuntimeDownloadProgress extends StObject {
    
    var downloadedBytes: Double = js.native
    
    var totalBytes: Double = js.native
  }
  object RuntimeDownloadProgress {
    
    @scala.inline
    def apply(downloadedBytes: Double, totalBytes: Double): RuntimeDownloadProgress = {
      val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeDownloadProgress]
    }
    
    @scala.inline
    implicit class RuntimeDownloadProgressMutableBuilder[Self <: RuntimeDownloadProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadedBytes(value: Double): Self = StObject.set(x, "downloadedBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
