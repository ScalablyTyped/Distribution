package typings.opentelemetryTracing.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceParams extends js.Object {
  
  /** numberOfAttributesPerSpan is number of attributes per span */
  var numberOfAttributesPerSpan: js.UndefOr[Double] = js.native
  
  /** numberOfEventsPerSpan is number of message events per span */
  var numberOfEventsPerSpan: js.UndefOr[Double] = js.native
  
  /** numberOfLinksPerSpan is number of links per span */
  var numberOfLinksPerSpan: js.UndefOr[Double] = js.native
}
object TraceParams {
  
  @scala.inline
  def apply(): TraceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceParams]
  }
  
  @scala.inline
  implicit class TraceParamsOps[Self <: TraceParams] (val x: Self) extends AnyVal {
    
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
    def setNumberOfAttributesPerSpan(value: Double): Self = this.set("numberOfAttributesPerSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfAttributesPerSpan: Self = this.set("numberOfAttributesPerSpan", js.undefined)
    
    @scala.inline
    def setNumberOfEventsPerSpan(value: Double): Self = this.set("numberOfEventsPerSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfEventsPerSpan: Self = this.set("numberOfEventsPerSpan", js.undefined)
    
    @scala.inline
    def setNumberOfLinksPerSpan(value: Double): Self = this.set("numberOfLinksPerSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLinksPerSpan: Self = this.set("numberOfLinksPerSpan", js.undefined)
  }
}
