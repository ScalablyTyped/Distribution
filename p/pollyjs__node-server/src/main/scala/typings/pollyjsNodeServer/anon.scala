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
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setRecordingSizeLimitUndefined: Self = StObject.set(x, "recordingSizeLimit", js.undefined)
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
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
    
    inline def apply(): PartialServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerConfig]
    }
    
    extension [Self <: PartialServerConfig](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      inline def setCorsOptions(value: CorsOptions): Self = StObject.set(x, "corsOptions", value.asInstanceOf[js.Any])
      
      inline def setCorsOptionsUndefined: Self = StObject.set(x, "corsOptions", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setRecordingSizeLimitUndefined: Self = StObject.set(x, "recordingSizeLimit", js.undefined)
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@pollyjs/node-server.@pollyjs/node-server.Config, 'recordingsDir'> */
  trait PickConfigrecordingsDir extends StObject {
    
    var recordingsDir: String
  }
  object PickConfigrecordingsDir {
    
    inline def apply(recordingsDir: String): PickConfigrecordingsDir = {
      val __obj = js.Dynamic.literal(recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickConfigrecordingsDir]
    }
    
    extension [Self <: PickConfigrecordingsDir](x: Self) {
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
    }
  }
}
