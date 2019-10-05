package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsHeaderFooterProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderItem(): Element
  def shouldShow(): Boolean
}

object ISuggestionsHeaderFooterProps {
  @scala.inline
  def apply(
    renderItem: () => Element,
    shouldShow: () => Boolean,
    ariaLabel: String = null,
    className: String = null,
    onExecute: () => Unit = null
  ): ISuggestionsHeaderFooterProps = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction0(renderItem), shouldShow = js.Any.fromFunction0(shouldShow))
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction0(onExecute))
    __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
  }
}

