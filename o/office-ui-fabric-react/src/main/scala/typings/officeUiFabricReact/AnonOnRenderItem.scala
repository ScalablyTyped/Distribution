package typings.officeUiFabricReact

import typings.officeUiFabricReact.tagPickerTypesMod.ITag
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderItem extends js.Object {
  def onRenderItem(props: ITagItemProps): Element
  def onRenderSuggestionsItem(props: ITag): Element
}

object AnonOnRenderItem {
  @scala.inline
  def apply(onRenderItem: ITagItemProps => Element, onRenderSuggestionsItem: ITag => Element): AnonOnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
  
    __obj.asInstanceOf[AnonOnRenderItem]
  }
}

