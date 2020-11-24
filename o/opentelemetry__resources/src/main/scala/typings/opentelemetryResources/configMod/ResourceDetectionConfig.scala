package typings.opentelemetryResources.configMod

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryResources.typesMod.Detector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetectionConfig extends js.Object {
  
  var detectors: js.UndefOr[js.Array[Detector]] = js.native
  
  /** Optional Logger. */
  var logger: js.UndefOr[Logger] = js.native
}
object ResourceDetectionConfig {
  
  @scala.inline
  def apply(): ResourceDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetectionConfig]
  }
  
  @scala.inline
  implicit class ResourceDetectionConfigOps[Self <: ResourceDetectionConfig] (val x: Self) extends AnyVal {
    
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
    def setDetectorsVarargs(value: Detector*): Self = this.set("detectors", js.Array(value :_*))
    
    @scala.inline
    def setDetectors(value: js.Array[Detector]): Self = this.set("detectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectors: Self = this.set("detectors", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
}
