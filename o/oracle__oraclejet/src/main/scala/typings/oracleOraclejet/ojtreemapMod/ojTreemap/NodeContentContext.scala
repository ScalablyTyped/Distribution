package typings.oracleOraclejet.ojtreemapMod.ojTreemap

import typings.oracleOraclejet.anon.WidthX
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait NodeContentContext[K, D] extends js.Object {
  
  var bounds: WidthX = js.native
  
  var componentElement: Element = js.native
  
  var data: js.Object = js.native
  
  var id: K = js.native
  
  var itemData: D = js.native
}
object NodeContentContext {
  
  @scala.inline
  def apply[K, D](bounds: WidthX, componentElement: Element, data: js.Object, id: K, itemData: D): NodeContentContext[K, D] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContentContext[K, D]]
  }
  
  @scala.inline
  implicit class NodeContentContextOps[Self <: NodeContentContext[_, _], K, D] (val x: Self with (NodeContentContext[K, D])) extends AnyVal {
    
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
    def setBounds(value: WidthX): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D): Self = this.set("itemData", value.asInstanceOf[js.Any])
  }
}
