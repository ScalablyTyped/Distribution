package typings.opentelemetryApi

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanOptionsMod {
  
  trait SpanOptions extends StObject {
    
    /** A span's attributes */
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    /**
      * The SpanKind of a span
      * @default {@link SpanKind.INTERNAL}
      */
    var kind: js.UndefOr[SpanKind] = js.undefined
    
    /** {@link Link}s span to other spans */
    var links: js.UndefOr[js.Array[Link]] = js.undefined
    
    /**
      * This option is NOT RECOMMENDED for normal use and should ONLY be used
      * if your application manages context manually without the global context
      * manager, or you are trying to override the parent extracted from context.
      *
      * A parent `SpanContext` (or `Span`, for convenience) that the newly-started
      * span will be the child of. This overrides the parent span extracted from
      * the currently active context.
      *
      * A null value here should prevent the SDK from extracting a parent from
      * the current context, forcing the new span to be a root span.
      */
    var parent: js.UndefOr[Span | SpanContext | Null] = js.undefined
    
    /** A manually specified start time for the created `Span` object. */
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object SpanOptions {
    
    @scala.inline
    def apply(): SpanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanOptions]
    }
    
    @scala.inline
    implicit class SpanOptionsMutableBuilder[Self <: SpanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setKind(value: SpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: Span | SpanContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}
