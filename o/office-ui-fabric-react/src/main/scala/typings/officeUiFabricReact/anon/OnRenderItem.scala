package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRenderItem extends js.Object {
  def onRenderItem(props: ITagItemProps): Element
  def onRenderSuggestionsItem(props: ITag): Element
}

object OnRenderItem {
  @scala.inline
  def apply(onRenderItem: ITagItemProps => Element, onRenderSuggestionsItem: ITag => Element): OnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
    __obj.asInstanceOf[OnRenderItem]
  }
}

