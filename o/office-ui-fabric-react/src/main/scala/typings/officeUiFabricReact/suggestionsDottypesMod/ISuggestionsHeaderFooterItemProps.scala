package typings.officeUiFabricReact.suggestionsDottypesMod

import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsHeaderFooterItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  var id: String
  var isSelected: Boolean
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderItem(): Element
}

object ISuggestionsHeaderFooterItemProps {
  @scala.inline
  def apply(
    id: String,
    isSelected: Boolean,
    renderItem: () => Element,
    className: String = null,
    componentRef: IRefObject[js.Object] = null,
    onExecute: () => Unit = null
  ): ISuggestionsHeaderFooterItemProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = js.Any.fromFunction0(renderItem))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction0(onExecute))
    __obj.asInstanceOf[ISuggestionsHeaderFooterItemProps]
  }
}

