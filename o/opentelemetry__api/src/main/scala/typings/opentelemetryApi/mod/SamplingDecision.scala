package typings.opentelemetryApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", "SamplingDecision")
@js.native
object SamplingDecision extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.opentelemetryApi.samplingResultMod.SamplingDecision with Double] = js.native
  
  /* 0 */ val NOT_RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.NOT_RECORD with Double = js.native
  
  /* 1 */ val RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD with Double = js.native
  
  /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD_AND_SAMPLED with Double = js.native
}
