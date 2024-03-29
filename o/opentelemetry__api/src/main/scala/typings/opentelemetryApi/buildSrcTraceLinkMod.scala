package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceLinkMod {
  
  trait Link extends StObject {
    
    /** A set of {@link SpanAttributes} on the link. */
    var attributes: js.UndefOr[SpanAttributes] = js.undefined
    
    /** The {@link SpanContext} of a linked span. */
    var context: SpanContext
    
    /** Count of attributes of the link that were dropped due to collection limits */
    var droppedAttributesCount: js.UndefOr[Double] = js.undefined
  }
  object Link {
    
    inline def apply(context: SpanContext): Link = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setContext(value: SpanContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDroppedAttributesCount(value: Double): Self = StObject.set(x, "droppedAttributesCount", value.asInstanceOf[js.Any])
      
      inline def setDroppedAttributesCountUndefined: Self = StObject.set(x, "droppedAttributesCount", js.undefined)
    }
  }
}
