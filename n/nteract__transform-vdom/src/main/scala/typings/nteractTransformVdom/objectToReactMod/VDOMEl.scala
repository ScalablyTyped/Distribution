package typings.nteractTransformVdom.objectToReactMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VDOMEl extends js.Object {
  
  var attributes: Attributes = js.native
  
  var children: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl]) = js.native
  
  var eventHandlers: js.UndefOr[EventHandlers] = js.native
  
  var key: Double | String | Null = js.native
  
  var tagName: String = js.native
}
object VDOMEl {
  
  @scala.inline
  def apply(attributes: Attributes, tagName: String): VDOMEl = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDOMEl]
  }
  
  @scala.inline
  implicit class VDOMElOps[Self <: VDOMEl] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (ReactNode | VDOMEl)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setEventHandlers(value: EventHandlers): Self = this.set("eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventHandlers: Self = this.set("eventHandlers", js.undefined)
    
    @scala.inline
    def setKey(value: Double | String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
}
