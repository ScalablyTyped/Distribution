package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRenderItem extends StObject {
  
  def onRenderItem(props: ITagItemProps): Element
  
  def onRenderSuggestionsItem(props: ITag): Element
}
object OnRenderItem {
  
  @scala.inline
  def apply(onRenderItem: ITagItemProps => Element, onRenderSuggestionsItem: ITag => Element): OnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
    __obj.asInstanceOf[OnRenderItem]
  }
  
  @scala.inline
  implicit class OnRenderItemMutableBuilder[Self <: OnRenderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRenderItem(value: ITagItemProps => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRenderSuggestionsItem(value: ITag => Element): Self = StObject.set(x, "onRenderSuggestionsItem", js.Any.fromFunction1(value))
  }
}
