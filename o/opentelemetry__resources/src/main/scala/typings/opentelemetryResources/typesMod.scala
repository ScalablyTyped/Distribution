package typings.opentelemetryResources

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryResources.configMod.ResourceDetectionConfigWithLogger
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Detector extends StObject {
    
    def detect(config: ResourceDetectionConfigWithLogger): js.Promise[Resource]
  }
  object Detector {
    
    inline def apply(detect: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Detector = {
      val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect))
      __obj.asInstanceOf[Detector]
    }
    
    extension [Self <: Detector](x: Self) {
      
      inline def setDetect(value: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
    }
  }
  
  type ResourceAttributes = StringDictionary[Double | String | Boolean]
}
