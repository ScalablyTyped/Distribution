package typings.oracleOraclejet.ojthematicmapMod.ojThematicMap

import typings.oracleOraclejet.anon.Focused
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  
  var color: String = js.native
  
  var componentElement: Element = js.native
  
  var data: js.Object = js.native
  
  var id: K1 | K2 | K3 = js.native
  
  var itemData: D1 | D2 | D3 = js.native
  
  var label: String = js.native
  
  var location: String | Null = js.native
  
  var parentElement: Element = js.native
  
  var previousState: Focused = js.native
  
  def renderDefaultFocus(): Unit = js.native
  
  def renderDefaultHover(): Unit = js.native
  
  def renderDefaultSelection(): Unit = js.native
  
  var root: Element | Null = js.native
  
  var state: Focused = js.native
  
  var x: Double | Null = js.native
  
  var y: Double | Null = js.native
}
object RendererContext {
  
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    color: String,
    componentElement: Element,
    data: js.Object,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    label: String,
    parentElement: Element,
    previousState: Focused,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Focused
  ): RendererContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
  }
  
  @scala.inline
  implicit class RendererContextOps[Self <: RendererContext[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (RendererContext[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    
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
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K1 | K2 | K3): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D1 | D2 | D3): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: Focused): Self = this.set("previousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDefaultFocus(value: () => Unit): Self = this.set("renderDefaultFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderDefaultHover(value: () => Unit): Self = this.set("renderDefaultHover", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderDefaultSelection(value: () => Unit): Self = this.set("renderDefaultSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: Focused): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = this.set("x", null)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = this.set("y", null)
  }
}
