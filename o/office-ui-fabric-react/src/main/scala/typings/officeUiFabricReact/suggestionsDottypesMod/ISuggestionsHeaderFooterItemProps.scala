package typings.officeUiFabricReact.suggestionsDottypesMod

import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsHeaderFooterItemProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  var id: String = js.native
  var isSelected: Boolean = js.native
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.native
  def renderItem(): Element = js.native
}

object ISuggestionsHeaderFooterItemProps {
  @scala.inline
  def apply(id: String, isSelected: Boolean, renderItem: () => Element): ISuggestionsHeaderFooterItemProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = js.Any.fromFunction0(renderItem))
    __obj.asInstanceOf[ISuggestionsHeaderFooterItemProps]
  }
  @scala.inline
  implicit class ISuggestionsHeaderFooterItemPropsOps[Self <: ISuggestionsHeaderFooterItemProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderItem(value: () => Element): Self = this.set("renderItem", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setOnExecute(value: () => Unit): Self = this.set("onExecute", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExecute: Self = this.set("onExecute", js.undefined)
  }
  
}

