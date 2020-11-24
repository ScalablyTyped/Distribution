package typings.opentelemetryCore.utilsEnvironmentMod

import typings.opentelemetryCore.typesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENVIRONMENT extends js.Object {
  
  var OTEL_LOG_LEVEL: js.UndefOr[LogLevel] = js.native
  
  var OTEL_NO_PATCH_MODULES: js.UndefOr[String] = js.native
  
  var OTEL_SAMPLING_PROBABILITY: js.UndefOr[Double] = js.native
}
object ENVIRONMENT {
  
  @scala.inline
  def apply(): ENVIRONMENT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ENVIRONMENT]
  }
  
  @scala.inline
  implicit class ENVIRONMENTOps[Self <: ENVIRONMENT] (val x: Self) extends AnyVal {
    
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
    def deleteOTEL_LOG_LEVEL: Self = this.set("OTEL_LOG_LEVEL", js.undefined)
    
    @scala.inline
    def setOTEL_NO_PATCH_MODULES(value: String): Self = this.set("OTEL_NO_PATCH_MODULES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTEL_NO_PATCH_MODULES: Self = this.set("OTEL_NO_PATCH_MODULES", js.undefined)
    
    @scala.inline
    def setOTEL_SAMPLING_PROBABILITY(value: Double): Self = this.set("OTEL_SAMPLING_PROBABILITY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTEL_SAMPLING_PROBABILITY: Self = this.set("OTEL_SAMPLING_PROBABILITY", js.undefined)
  }
}
