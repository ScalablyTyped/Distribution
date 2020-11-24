package typings.opentelemetryApi.samplingResultMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SamplingDecision extends js.Object
@JSImport("@opentelemetry/api/build/src/trace/SamplingResult", "SamplingDecision")
@js.native
object SamplingDecision extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SamplingDecision with Double] = js.native
  
  /**
    * `Span.isRecording() === false`, span will not be recorded and all events
    * and attributes will be dropped.
    */
  @js.native
  sealed trait NOT_RECORD extends SamplingDecision
  /* 0 */ @js.native
  object NOT_RECORD extends TopLevel[NOT_RECORD with Double]
  
  /**
    * `Span.isRecording() === true`, but `Sampled` flag in {@link TraceFlags}
    * MUST NOT be set.
    */
  @js.native
  sealed trait RECORD extends SamplingDecision
  /* 1 */ @js.native
  object RECORD extends TopLevel[RECORD with Double]
  
  /**
    * `Span.isRecording() === true` AND `Sampled` flag in {@link TraceFlags}
    * MUST be set.
    */
  @js.native
  sealed trait RECORD_AND_SAMPLED extends SamplingDecision
  /* 2 */ @js.native
  object RECORD_AND_SAMPLED extends TopLevel[RECORD_AND_SAMPLED with Double]
}
