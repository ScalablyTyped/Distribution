package typings.opentelemetryResources.typesMod

import typings.opentelemetryResources.configMod.ResourceDetectionConfigWithLogger
import typings.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detector extends js.Object {
  
  def detect(config: ResourceDetectionConfigWithLogger): js.Promise[Resource] = js.native
}
object Detector {
  
  @scala.inline
  def apply(detect: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Detector = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect))
    __obj.asInstanceOf[Detector]
  }
  
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
    
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
    def setDetect(value: ResourceDetectionConfigWithLogger => js.Promise[Resource]): Self = this.set("detect", js.Any.fromFunction1(value))
  }
}
