package typings.opentelemetryResources

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  trait ResourceDetectionConfig extends StObject {
    
    var detectors: js.UndefOr[js.Array[Detector]] = js.undefined
    
    /** Optional Logger. */
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object ResourceDetectionConfig {
    
    inline def apply(): ResourceDetectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceDetectionConfig]
    }
    
    extension [Self <: ResourceDetectionConfig](x: Self) {
      
      inline def setDetectors(value: js.Array[Detector]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      inline def setDetectorsVarargs(value: Detector*): Self = StObject.set(x, "detectors", js.Array(value :_*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait ResourceDetectionConfigWithLogger
    extends StObject
       with ResourceDetectionConfig {
    
    /** Required Logger */
    @JSName("logger")
    var logger_ResourceDetectionConfigWithLogger: Logger
  }
  object ResourceDetectionConfigWithLogger {
    
    inline def apply(logger: Logger): ResourceDetectionConfigWithLogger = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDetectionConfigWithLogger]
    }
    
    extension [Self <: ResourceDetectionConfigWithLogger](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
}
