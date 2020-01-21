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
    actions: IStyle = null,
    content: IStyle = null,
    dismissSingleLine: IStyle = null,
    dismissal: IStyle = null,
    expand: IStyle = null,
    expandSingleLine: IStyle = null,
    icon: IStyle = null,
    iconContainer: IStyle = null,
    innerText: IStyle = null,
    root: IStyle = null,
    text: IStyle = null
  ): IMessageBarStyles = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dismissSingleLine != null) __obj.updateDynamic("dismissSingleLine")(dismissSingleLine.asInstanceOf[js.Any])
    if (dismissal != null) __obj.updateDynamic("dismissal")(dismissal.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (expandSingleLine != null) __obj.updateDynamic("expandSingleLine")(expandSingleLine.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainer != null) __obj.updateDynamic("iconContainer")(iconContainer.asInstanceOf[js.Any])
    if (innerText != null) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarStyles]
  }
}

