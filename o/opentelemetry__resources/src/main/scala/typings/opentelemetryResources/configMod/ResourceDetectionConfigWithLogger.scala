package typings.opentelemetryResources.configMod

import typings.opentelemetryApi.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetectionConfigWithLogger extends ResourceDetectionConfig {
  
  /** Required Logger */
  @JSName("logger")
  var logger_ResourceDetectionConfigWithLogger: Logger = js.native
}
object ResourceDetectionConfigWithLogger {
  
  @scala.inline
  def apply(logger: Logger): ResourceDetectionConfigWithLogger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetectionConfigWithLogger]
  }
  
  @scala.inline
  implicit class ResourceDetectionConfigWithLoggerOps[Self <: ResourceDetectionConfigWithLogger] (val x: Self) extends AnyVal {
    
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
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
  }
}
