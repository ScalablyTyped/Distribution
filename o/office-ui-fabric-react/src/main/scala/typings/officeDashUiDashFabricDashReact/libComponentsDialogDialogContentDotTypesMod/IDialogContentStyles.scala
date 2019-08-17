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
    button: IStyle,
    content: IStyle,
    header: IStyle,
    inner: IStyle,
    innerContent: IStyle,
    subText: IStyle,
    title: IStyle,
    topButton: IStyle
  ): IDialogContentStyles = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], subText = subText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topButton = topButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDialogContentStyles]
  }
}

