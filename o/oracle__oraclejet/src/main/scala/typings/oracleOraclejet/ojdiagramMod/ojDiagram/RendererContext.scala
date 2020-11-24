package typings.oracleOraclejet.ojdiagramMod.ojDiagram

import typings.oracleOraclejet.anon.ElementHeight
import typings.oracleOraclejet.anon.Expanded
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RendererContext[K1, D1] extends js.Object {
  
  var componentElement: Element = js.native
  
  var content: ElementHeight = js.native
  
  var data: js.Object = js.native
  
  var id: K1 = js.native
  
  var itemData: D1 = js.native
  
  var parentElement: Element = js.native
  
  var previousState: Expanded = js.native
  
  def renderDefaultFocus(): Unit = js.native
  
  def renderDefaultHover(): Unit = js.native
  
  def renderDefaultSelection(): Unit = js.native
  
  var state: Expanded = js.native
  
  var `type`: String = js.native
}
object RendererContext {
  
  @scala.inline
  def apply[K1, D1](
    componentElement: Element,
    content: ElementHeight,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: Element,
    previousState: Expanded,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Expanded,
    `type`: String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
  
  @scala.inline
  implicit class RendererContextOps[Self <: RendererContext[_, _], K1, D1] (val x: Self with (RendererContext[K1, D1])) extends AnyVal {
    
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
    def setContent(value: ElementHeight): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K1): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: D1): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: Expanded): Self = this.set("previousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDefaultFocus(value: () => Unit): Self = this.set("renderDefaultFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderDefaultHover(value: () => Unit): Self = this.set("renderDefaultHover", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderDefaultSelection(value: () => Unit): Self = this.set("renderDefaultSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: Expanded): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
