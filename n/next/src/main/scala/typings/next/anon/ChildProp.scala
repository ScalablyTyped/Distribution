package typings.next.anon

import typings.next.distClientComponentsErrorBoundaryMod.ErrorComponent
import typings.next.distServerAppRenderMod.FlightSegmentPath
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildProp extends StObject {
  
  var childProp: typings.next.distServerAppRenderMod.ChildProp
  
  var error: ErrorComponent
  
  var hasLoading: Boolean
  
  var loading: js.UndefOr[ReactNode] = js.undefined
  
  var notFound: js.UndefOr[ReactNode] = js.undefined
  
  var parallelRouterKey: String
  
  var rootLayoutIncluded: Boolean
  
  var segmentPath: FlightSegmentPath
  
  var template: ReactNode
}
object ChildProp {
  
  inline def apply(
    childProp: typings.next.distServerAppRenderMod.ChildProp,
    error: ErrorComponent,
    hasLoading: Boolean,
    parallelRouterKey: String,
    rootLayoutIncluded: Boolean,
    segmentPath: FlightSegmentPath
  ): ChildProp = {
    val __obj = js.Dynamic.literal(childProp = childProp.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hasLoading = hasLoading.asInstanceOf[js.Any], parallelRouterKey = parallelRouterKey.asInstanceOf[js.Any], rootLayoutIncluded = rootLayoutIncluded.asInstanceOf[js.Any], segmentPath = segmentPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProp]
  }
  
  extension [Self <: ChildProp](x: Self) {
    
    inline def setChildProp(value: typings.next.distServerAppRenderMod.ChildProp): Self = StObject.set(x, "childProp", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorComponent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHasLoading(value: Boolean): Self = StObject.set(x, "hasLoading", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: ReactNode): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNotFound(value: ReactNode): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    inline def setParallelRouterKey(value: String): Self = StObject.set(x, "parallelRouterKey", value.asInstanceOf[js.Any])
    
    inline def setRootLayoutIncluded(value: Boolean): Self = StObject.set(x, "rootLayoutIncluded", value.asInstanceOf[js.Any])
    
    inline def setSegmentPath(value: FlightSegmentPath): Self = StObject.set(x, "segmentPath", value.asInstanceOf[js.Any])
    
    inline def setSegmentPathVarargs(value: Any*): Self = StObject.set(x, "segmentPath", js.Array(value*))
    
    inline def setTemplate(value: ReactNode): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
