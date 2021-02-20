package typings.opentelemetryResources

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryResources.configMod.ResourceDetectionConfigWithLogger
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Detector extends StObject {
    
    def detect(config: ResourceDetectionConfigWithLogger): js.Promise[Resource] = js.native
  }
  object Detector {
    
    @scala.inline
    def apply(detect: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Detector = {
      val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect))
      __obj.asInstanceOf[Detector]
    }
    
    @scala.inline
    implicit class DetectorMutableBuilder[Self <: Detector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetect(value: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
    }
  }
  
  type ResourceAttributes = StringDictionary[Double | String | Boolean]
}
