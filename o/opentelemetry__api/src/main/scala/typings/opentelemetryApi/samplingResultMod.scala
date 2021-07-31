package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samplingResultMod {
  
  @js.native
  sealed trait SamplingDecision extends StObject
  @JSImport("@opentelemetry/api/build/src/trace/SamplingResult", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SamplingDecision & Double] = js.native
    
    /**
      * `Span.isRecording() === false`, span will not be recorded and all events
      * and attributes will be dropped.
      */
    @js.native
    sealed trait NOT_RECORD
      extends StObject
         with SamplingDecision
    /* 0 */ val NOT_RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /**
      * `Span.isRecording() === true`, but `Sampled` flag in {@link TraceFlags}
      * MUST NOT be set.
      */
    @js.native
    sealed trait RECORD
      extends StObject
         with SamplingDecision
    /* 1 */ val RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD & Double = js.native
    
    /**
      * `Span.isRecording() === true` AND `Sampled` flag in {@link TraceFlags}
      * MUST be set.
      */
    @js.native
    sealed trait RECORD_AND_SAMPLED
      extends StObject
         with SamplingDecision
    /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  trait SamplingResult extends StObject {
    
    /**
      * The list of attributes returned by SamplingResult MUST be immutable.
      * Caller may call {@link Sampler}.shouldSample any number of times and
      * can safely cache the returned value.
      */
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * A sampling decision, refer to {@link SamplingDecision} for details.
      */
    var decision: SamplingDecision
  }
  object SamplingResult {
    
    @scala.inline
    def apply(decision: SamplingDecision): SamplingResult = {
      val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingResult]
    }
    
    @scala.inline
    implicit class SamplingResultMutableBuilder[Self <: SamplingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDecision(value: SamplingDecision): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    }
  }
}
