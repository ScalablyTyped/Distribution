package typings.opentelemetryResources

import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typings.opentelemetryResources.buildSrcIresourceMod.IResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  @js.native
  trait Detector extends StObject {
    
    def detect(): js.Promise[IResource] = js.native
    def detect(config: ResourceDetectionConfig): js.Promise[IResource] = js.native
  }
  
  @js.native
  trait DetectorSync extends StObject {
    
    def detect(): IResource = js.native
    def detect(config: ResourceDetectionConfig): IResource = js.native
  }
  
  type ResourceAttributes = SpanAttributes
}
