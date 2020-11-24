package typings.opentelemetryTracing.typesMod

import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.typesMod.ContextManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDKRegistrationConfig extends js.Object {
  
  /** Context manager to register as the global context manager */
  var contextManager: js.UndefOr[ContextManager | Null] = js.native
  
  /** Propagator to register as the global propagator */
  var propagator: js.UndefOr[TextMapPropagator | Null] = js.native
}
object SDKRegistrationConfig {
  
  @scala.inline
  def apply(): SDKRegistrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SDKRegistrationConfig]
  }
  
  @scala.inline
  implicit class SDKRegistrationConfigOps[Self <: SDKRegistrationConfig] (val x: Self) extends AnyVal {
    
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
    def setContextManager(value: ContextManager): Self = this.set("contextManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextManager: Self = this.set("contextManager", js.undefined)
    
    @scala.inline
    def setContextManagerNull: Self = this.set("contextManager", null)
    
    @scala.inline
    def setPropagator(value: TextMapPropagator): Self = this.set("propagator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagator: Self = this.set("propagator", js.undefined)
    
    @scala.inline
    def setPropagatorNull: Self = this.set("propagator", null)
  }
}
