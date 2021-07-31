package typings.pollyjsNodeServer

import typings.cors.mod.CorsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@pollyjs/node-server.@pollyjs/node-server.Config> */
  trait PartialConfig extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var recordingSizeLimit: js.UndefOr[String] = js.undefined
    
    var recordingsDir: js.UndefOr[String] = js.undefined
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingSizeLimitUndefined: Self = StObject.set(x, "recordingSizeLimit", js.undefined)
      
      @scala.inline
      def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@pollyjs/node-server.@pollyjs/node-server.ServerConfig> */
  trait PartialServerConfig extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.undefined
    
    var corsOptions: js.UndefOr[CorsOptions] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var recordingSizeLimit: js.UndefOr[String] = js.undefined
    
    var recordingsDir: js.UndefOr[String] = js.undefined
  }
  object PartialServerConfig {
    
    @scala.inline
    def apply(): PartialServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerConfig]
    }
    
    @scala.inline
    implicit class PartialServerConfigMutableBuilder[Self <: PartialServerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      @scala.inline
      def setCorsOptions(value: CorsOptions): Self = StObject.set(x, "corsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsOptionsUndefined: Self = StObject.set(x, "corsOptions", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingSizeLimitUndefined: Self = StObject.set(x, "recordingSizeLimit", js.undefined)
      
      @scala.inline
      def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@pollyjs/node-server.@pollyjs/node-server.Config, 'recordingsDir'> */
  trait PickConfigrecordingsDir extends StObject {
    
    var recordingsDir: String
  }
  object PickConfigrecordingsDir {
    
    @scala.inline
    def apply(recordingsDir: String): PickConfigrecordingsDir = {
      val __obj = js.Dynamic.literal(recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickConfigrecordingsDir]
    }
    
    @scala.inline
    implicit class PickConfigrecordingsDirMutableBuilder[Self <: PickConfigrecordingsDir] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
    }
  }
}
