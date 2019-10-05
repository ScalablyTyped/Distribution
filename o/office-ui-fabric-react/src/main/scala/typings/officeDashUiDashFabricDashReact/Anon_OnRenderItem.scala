package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITag
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemProps
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRenderItem extends js.Object {
  def onRenderItem(props: ITagItemProps): Element
  def onRenderSuggestionsItem(props: ITag): Element
}

object Anon_OnRenderItem {
  @scala.inline
  def apply(onRenderItem: ITagItemProps => Element, onRenderSuggestionsItem: ITag => Element): Anon_OnRenderItem = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderSuggestionsItem = js.Any.fromFunction1(onRenderSuggestionsItem))
  
    __obj.asInstanceOf[Anon_OnRenderItem]
  }
}

