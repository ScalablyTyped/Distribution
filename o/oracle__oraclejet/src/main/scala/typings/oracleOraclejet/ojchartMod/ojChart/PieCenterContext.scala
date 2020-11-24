package typings.oracleOraclejet.ojchartMod.ojChart

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait PieCenterContext extends js.Object {
  
  var componentElement: Element = js.native
  
  var innerBounds: js.Object = js.native
  
  var label: String = js.native
  
  var outerBounds: js.Object = js.native
}
object PieCenterContext {
  
  @scala.inline
  def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieCenterContext]
  }
  
  @scala.inline
  implicit class PieCenterContextOps[Self <: PieCenterContext] (val x: Self) extends AnyVal {
    
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
    def setInnerBounds(value: js.Object): Self = this.set("innerBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterBounds(value: js.Object): Self = this.set("outerBounds", value.asInstanceOf[js.Any])
  }
}
