package typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogContentStyles extends js.Object {
  var button: IStyle
  /**
    * Style for the content element.
    */
  var content: IStyle
  var header: IStyle
  var inner: IStyle
  var innerContent: IStyle
  var subText: IStyle
  var title: IStyle
  var topButton: IStyle
}

object IDialogContentStyles {
  @scala.inline
  def apply(
    button: IStyle = null,
    content: IStyle = null,
    header: IStyle = null,
    inner: IStyle = null,
    innerContent: IStyle = null,
    subText: IStyle = null,
    title: IStyle = null,
    topButton: IStyle = null
  ): IDialogContentStyles = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (innerContent != null) __obj.updateDynamic("innerContent")(innerContent.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topButton != null) __obj.updateDynamic("topButton")(topButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogContentStyles]
  }
}

