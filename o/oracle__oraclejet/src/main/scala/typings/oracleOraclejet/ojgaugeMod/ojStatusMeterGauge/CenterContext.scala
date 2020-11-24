package typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CenterContext extends js.Object {
  
  var componentElement: Element = js.native
  
  var innerBounds: Bounds = js.native
  
  var metricLabel: String = js.native
  
  var outerBounds: Bounds = js.native
}
object CenterContext {
  
  @scala.inline
  def apply(componentElement: Element, innerBounds: Bounds, metricLabel: String, outerBounds: Bounds): CenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterContext]
  }
  
  @scala.inline
  implicit class CenterContextOps[Self <: CenterContext] (val x: Self) extends AnyVal {
    
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
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBounds(value: Bounds): Self = this.set("innerBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricLabel(value: String): Self = this.set("metricLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterBounds(value: Bounds): Self = this.set("outerBounds", value.asInstanceOf[js.Any])
  }
}
