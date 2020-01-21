package typings.officeUiFabricReact.messageBarTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBarStyleProps extends js.Object {
  /**
    * Whether the MessageBar contains any action elements.
    */
  var actions: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional CSS class(es).
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether the single line MessageBar is being expanded.
    */
  var expandSingleLine: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the MessageBar is rendered in multi line (as opposed to single line) mode.
    */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of the MessageBar.
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.undefined
  /**
    * Whether the MessageBar contains a dismiss button.
    */
  var onDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme
  /**
    * Whether the text is truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.undefined
}

object IMessageBarStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    actions: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    expandSingleLine: js.UndefOr[Boolean] = js.undefined,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    messageBarType: MessageBarType = null,
    onDismiss: js.UndefOr[Boolean] = js.undefined,
    truncated: js.UndefOr[Boolean] = js.undefined
  ): IMessageBarStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(expandSingleLine)) __obj.updateDynamic("expandSingleLine")(expandSingleLine.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (messageBarType != null) __obj.updateDynamic("messageBarType")(messageBarType.asInstanceOf[js.Any])
    if (!js.isUndefined(onDismiss)) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarStyleProps]
  }
}

