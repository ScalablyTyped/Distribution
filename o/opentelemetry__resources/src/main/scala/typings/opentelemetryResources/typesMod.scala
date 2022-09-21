package typings.opentelemetryResources

import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import typings.opentelemetryResources.configMod.ResourceDetectionConfig
import typings.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Detector extends StObject {
    
    def detect(): js.Promise[Resource] = js.native
    def detect(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
  }
  
  type ResourceAttributes = SpanAttributes
}
