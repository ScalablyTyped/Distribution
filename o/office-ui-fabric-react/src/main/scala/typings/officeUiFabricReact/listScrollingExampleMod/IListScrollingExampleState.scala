package typings.officeUiFabricReact.listScrollingExampleMod

import typings.officeUiFabricReact.listTypesMod.ScrollToMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListScrollingExampleState extends js.Object {
  var scrollToMode: ScrollToMode
  var selectedIndex: Double
  var showItemIndexInView: Boolean
}

object IListScrollingExampleState {
  @scala.inline
  def apply(scrollToMode: ScrollToMode, selectedIndex: Double, showItemIndexInView: Boolean): IListScrollingExampleState = {
    val __obj = js.Dynamic.literal(scrollToMode = scrollToMode.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], showItemIndexInView = showItemIndexInView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListScrollingExampleState]
  }
}

