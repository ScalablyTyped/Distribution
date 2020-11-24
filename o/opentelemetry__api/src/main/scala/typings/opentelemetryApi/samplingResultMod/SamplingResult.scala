package typings.opentelemetryApi.samplingResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingResult extends js.Object {
  
  /**
    * The list of attributes returned by SamplingResult MUST be immutable.
    * Caller may call {@link Sampler}.shouldSample any number of times and
    * can safely cache the returned value.
    */
  var attributes: js.UndefOr[js.Object] = js.native
  
  /**
    * A sampling decision, refer to {@link SamplingDecision} for details.
    */
  var decision: SamplingDecision = js.native
}
object SamplingResult {
  
  @scala.inline
  def apply(decision: SamplingDecision): SamplingResult = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingResult]
  }
  
  @scala.inline
  implicit class SamplingResultOps[Self <: SamplingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecision(value: SamplingDecision): Self = this.set("decision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
