package typings.oracleOraclejet.ojnboxMod.ojNBox

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K] extends js.Object {
  
  var color: String = js.native
  
  var column: String = js.native
  
  var componentElement: Element = js.native
  
  var id: K = js.native
  
  var indicatorColor: String = js.native
  
  var label: String = js.native
  
  var parentElement: Element = js.native
  
  var row: String = js.native
  
  var secondaryLabel: String = js.native
}
object TooltipContext {
  
  @scala.inline
  def apply[K](
    color: String,
    column: String,
    componentElement: Element,
    id: K,
    indicatorColor: String,
    label: String,
    parentElement: Element,
    row: String,
    secondaryLabel: String
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], secondaryLabel = secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K]]
  }
  
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_], K] (val x: Self with TooltipContext[K]) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorColor(value: String): Self = this.set("indicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLabel(value: String): Self = this.set("secondaryLabel", value.asInstanceOf[js.Any])
  }
}
