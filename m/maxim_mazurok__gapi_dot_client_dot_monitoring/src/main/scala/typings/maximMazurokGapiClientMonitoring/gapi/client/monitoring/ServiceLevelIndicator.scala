package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelIndicator extends js.Object {
  
  /** Basic SLI on a well-known service type. */
  var basicSli: js.UndefOr[BasicSli] = js.native
  
  /** Request-based SLIs */
  var requestBased: js.UndefOr[RequestBasedSli] = js.native
  
  /** Windows-based SLIs */
  var windowsBased: js.UndefOr[WindowsBasedSli] = js.native
}
object ServiceLevelIndicator {
  
  @scala.inline
  def apply(): ServiceLevelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLevelIndicator]
  }
  
  @scala.inline
  implicit class ServiceLevelIndicatorOps[Self <: ServiceLevelIndicator] (val x: Self) extends AnyVal {
    
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
    def setBasicSli(value: BasicSli): Self = this.set("basicSli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicSli: Self = this.set("basicSli", js.undefined)
    
    @scala.inline
    def setRequestBased(value: RequestBasedSli): Self = this.set("requestBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBased: Self = this.set("requestBased", js.undefined)
    
    @scala.inline
    def setWindowsBased(value: WindowsBasedSli): Self = this.set("windowsBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsBased: Self = this.set("windowsBased", js.undefined)
  }
}
