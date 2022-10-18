package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITag
import typings.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRenderItem extends StObject {
  
  def onRenderItem(props: ITagItemProps): Element
  
  def onRenderSuggestionsItem(props: ITag): Element
}
object OnRenderItem {
  
  inline def apply(onRenderItem: ITagItemProps => Element, onRenderSuggestionsItem: ITag => Element): OnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
    __obj.asInstanceOf[OnRenderItem]
  }
  
  extension [Self <: OnRenderItem](x: Self) {
    
    inline def setOnRenderItem(value: ITagItemProps => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
    
    inline def setOnRenderSuggestionsItem(value: ITag => Element): Self = StObject.set(x, "onRenderSuggestionsItem", js.Any.fromFunction1(value))
  }
}
