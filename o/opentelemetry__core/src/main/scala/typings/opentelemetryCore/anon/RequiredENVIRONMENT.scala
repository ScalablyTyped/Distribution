package typings.opentelemetryCore.anon

import typings.opentelemetryCore.typesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@opentelemetry/core.@opentelemetry/core/build/src/utils/environment.ENVIRONMENT> */
@js.native
trait RequiredENVIRONMENT extends js.Object {
  
  var OTEL_LOG_LEVEL: LogLevel = js.native
  
  var OTEL_NO_PATCH_MODULES: String = js.native
  
  var OTEL_SAMPLING_PROBABILITY: Double = js.native
}
object RequiredENVIRONMENT {
  
  @scala.inline
  def apply(OTEL_LOG_LEVEL: LogLevel, OTEL_NO_PATCH_MODULES: String, OTEL_SAMPLING_PROBABILITY: Double): RequiredENVIRONMENT = {
    val __obj = js.Dynamic.literal(OTEL_LOG_LEVEL = OTEL_LOG_LEVEL.asInstanceOf[js.Any], OTEL_NO_PATCH_MODULES = OTEL_NO_PATCH_MODULES.asInstanceOf[js.Any], OTEL_SAMPLING_PROBABILITY = OTEL_SAMPLING_PROBABILITY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredENVIRONMENT]
  }
  
  @scala.inline
  implicit class RequiredENVIRONMENTOps[Self <: RequiredENVIRONMENT] (val x: Self) extends AnyVal {
    
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
    def setOTEL_LOG_LEVEL(value: LogLevel): Self = this.set("OTEL_LOG_LEVEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTEL_NO_PATCH_MODULES(value: String): Self = this.set("OTEL_NO_PATCH_MODULES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTEL_SAMPLING_PROBABILITY(value: Double): Self = this.set("OTEL_SAMPLING_PROBABILITY", value.asInstanceOf[js.Any])
  }
}
