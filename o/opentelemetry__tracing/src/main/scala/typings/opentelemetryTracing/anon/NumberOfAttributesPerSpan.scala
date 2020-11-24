package typings.opentelemetryTracing.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberOfAttributesPerSpan extends js.Object {
  
  var numberOfAttributesPerSpan: Double = js.native
  
  var numberOfEventsPerSpan: Double = js.native
  
  var numberOfLinksPerSpan: Double = js.native
}
object NumberOfAttributesPerSpan {
  
  @scala.inline
  def apply(numberOfAttributesPerSpan: Double, numberOfEventsPerSpan: Double, numberOfLinksPerSpan: Double): NumberOfAttributesPerSpan = {
    val __obj = js.Dynamic.literal(numberOfAttributesPerSpan = numberOfAttributesPerSpan.asInstanceOf[js.Any], numberOfEventsPerSpan = numberOfEventsPerSpan.asInstanceOf[js.Any], numberOfLinksPerSpan = numberOfLinksPerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfAttributesPerSpan]
  }
  
  @scala.inline
  implicit class NumberOfAttributesPerSpanOps[Self <: NumberOfAttributesPerSpan] (val x: Self) extends AnyVal {
    
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
    def setNumberOfEventsPerSpan(value: Double): Self = this.set("numberOfEventsPerSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinksPerSpan(value: Double): Self = this.set("numberOfLinksPerSpan", value.asInstanceOf[js.Any])
  }
}
