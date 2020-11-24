package typings.opentelemetryCore.propagationTypesMod

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositePropagatorConfig extends js.Object {
  
  /** Instance of logger */
  var logger: js.UndefOr[Logger] = js.native
  
  /**
    * List of propagators to run. Propagators run in the
    * list order. If a propagator later in the list writes the same context
    * key as a propagator earlier in the list, the later on will "win".
    */
  var propagators: js.UndefOr[js.Array[TextMapPropagator]] = js.native
}
object CompositePropagatorConfig {
  
  @scala.inline
  def apply(): CompositePropagatorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositePropagatorConfig]
  }
  
  @scala.inline
  implicit class CompositePropagatorConfigOps[Self <: CompositePropagatorConfig] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPropagatorsVarargs(value: TextMapPropagator*): Self = this.set("propagators", js.Array(value :_*))
    
    @scala.inline
    def setPropagators(value: js.Array[TextMapPropagator]): Self = this.set("propagators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagators: Self = this.set("propagators", js.undefined)
  }
}
