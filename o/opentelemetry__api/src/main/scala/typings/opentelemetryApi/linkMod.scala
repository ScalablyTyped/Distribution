package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  trait Link extends StObject {
    
    /** A set of {@link SpanAttributes} on the link. */
    var attributes: js.UndefOr[SpanAttributes] = js.undefined
    
    /** The {@link SpanContext} of a linked span. */
    var context: SpanContext
  }
  object Link {
    
    inline def apply(context: SpanContext): Link = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setContext(value: SpanContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
