package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import typings.opentelemetryResources.buildSrcTypesMod.DetectorSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcConfigMod {
  
  trait ResourceDetectionConfig extends StObject {
    
    var detectors: js.UndefOr[js.Array[Detector | DetectorSync]] = js.undefined
  }
  object ResourceDetectionConfig {
    
    inline def apply(): ResourceDetectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceDetectionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceDetectionConfig] (val x: Self) extends AnyVal {
      
      inline def setDetectors(value: js.Array[Detector | DetectorSync]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      inline def setDetectorsVarargs(value: (Detector | DetectorSync)*): Self = StObject.set(x, "detectors", js.Array(value*))
    }
  }
}
