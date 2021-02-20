package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeInfoMod {
  
  @js.native
  trait RuntimeInfo extends StObject {
    
    var architecture: String = js.native
    
    var args: js.Object = js.native
    
    var chromeVersion: String = js.native
    
    var fdc3AppUuid: js.UndefOr[String] = js.native
    
    var fdc3ChannelName: js.UndefOr[String] = js.native
    
    var manifestUrl: String = js.native
    
    var port: Double = js.native
    
    var securityRealm: js.UndefOr[String] = js.native
    
    var version: String = js.native
  }
  object RuntimeInfo {
    
    @scala.inline
    def apply(
      architecture: String,
      args: js.Object,
      chromeVersion: String,
      manifestUrl: String,
      port: Double,
      version: String
    ): RuntimeInfo = {
      val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeInfo]
    }
    
    @scala.inline
    implicit class RuntimeInfoMutableBuilder[Self <: RuntimeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeVersion(value: String): Self = StObject.set(x, "chromeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3AppUuid(value: String): Self = StObject.set(x, "fdc3AppUuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3AppUuidUndefined: Self = StObject.set(x, "fdc3AppUuid", js.undefined)
      
      @scala.inline
      def setFdc3ChannelName(value: String): Self = StObject.set(x, "fdc3ChannelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3ChannelNameUndefined: Self = StObject.set(x, "fdc3ChannelName", js.undefined)
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityRealm(value: String): Self = StObject.set(x, "securityRealm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityRealmUndefined: Self = StObject.set(x, "securityRealm", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
