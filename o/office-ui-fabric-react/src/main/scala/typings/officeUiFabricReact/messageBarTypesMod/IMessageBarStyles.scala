package typings.officeUiFabricReact.messageBarTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBarStyles extends js.Object {
  /**
    * Style set for the optional element containing the action elements.
    */
  var actions: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the element containing the icon, text, and optional dismiss button.
    */
  var content: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the element containing the dismiss button.
    */
  var dismissSingleLine: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the optional dismiss button.
    */
  var dismissal: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the icon used to expand and collapse the MessageBar.
    */
  var expand: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the element containing the expand icon.
    */
  var expandSingleLine: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the icon.
    */
  var icon: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the element containing the icon.
    */
  var iconContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the text.
    */
  var innerText: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the element containing the text.
    */
  var text: js.UndefOr[IStyle] = js.undefined
}

object IMessageBarStyles {
  @scala.inline
  def apply(
    actions: js.UndefOr[Null | IStyle] = js.undefined,
    content: js.UndefOr[Null | IStyle] = js.undefined,
    dismissSingleLine: js.UndefOr[Null | IStyle] = js.undefined,
    dismissal: js.UndefOr[Null | IStyle] = js.undefined,
    expand: js.UndefOr[Null | IStyle] = js.undefined,
    expandSingleLine: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    iconContainer: js.UndefOr[Null | IStyle] = js.undefined,
    innerText: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    text: js.UndefOr[Null | IStyle] = js.undefined
  ): IMessageBarStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissSingleLine)) __obj.updateDynamic("dismissSingleLine")(dismissSingleLine.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissal)) __obj.updateDynamic("dismissal")(dismissal.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(expandSingleLine)) __obj.updateDynamic("expandSingleLine")(expandSingleLine.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconContainer)) __obj.updateDynamic("iconContainer")(iconContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(innerText)) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarStyles]
  }
}

