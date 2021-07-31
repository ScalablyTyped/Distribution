package typings.opentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("opentracing/lib/reference", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Reference {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typings.opentracing.spanContextMod.default) = this()
    def this(`type`: String, referencedContext: typings.opentracing.spanMod.default) = this()
    
    /* CompleteClass */
    var _referencedContext: typings.opentracing.spanContextMod.default = js.native
    
    /* CompleteClass */
    var _type: String = js.native
    
    /**
      * @return {SpanContext} The SpanContext being referred to (e.g., the
      *         parent in a REFERENCE_CHILD_OF Reference).
      */
    /* CompleteClass */
    override def referencedContext(): typings.opentracing.spanContextMod.default = js.native
    
    /**
      * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
      *         REFERENCE_FOLLOWS_FROM).
      */
    /* CompleteClass */
    override def `type`(): String = js.native
  }
  
  trait Reference extends StObject {
    
    var _referencedContext: typings.opentracing.spanContextMod.default
    
    var _type: String
    
    /**
      * @return {SpanContext} The SpanContext being referred to (e.g., the
      *         parent in a REFERENCE_CHILD_OF Reference).
      */
    def referencedContext(): typings.opentracing.spanContextMod.default
    
    /**
      * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
      *         REFERENCE_FOLLOWS_FROM).
      */
    def `type`(): String
  }
  object Reference {
    
    @scala.inline
    def apply(
      _referencedContext: typings.opentracing.spanContextMod.default,
      _type: String,
      referencedContext: () => typings.opentracing.spanContextMod.default,
      `type`: () => String
    ): Reference = {
      val __obj = js.Dynamic.literal(_referencedContext = _referencedContext.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], referencedContext = js.Any.fromFunction0(referencedContext))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferencedContext(value: () => typings.opentracing.spanContextMod.default): Self = StObject.set(x, "referencedContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_referencedContext(value: typings.opentracing.spanContextMod.default): Self = StObject.set(x, "_referencedContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    }
  }
}
