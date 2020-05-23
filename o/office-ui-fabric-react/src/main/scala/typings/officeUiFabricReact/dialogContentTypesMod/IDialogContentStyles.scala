package typings.officeUiFabricReact.dialogContentTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    button: js.UndefOr[Null | IStyle] = js.undefined,
    content: js.UndefOr[Null | IStyle] = js.undefined,
    header: js.UndefOr[Null | IStyle] = js.undefined,
    inner: js.UndefOr[Null | IStyle] = js.undefined,
    innerContent: js.UndefOr[Null | IStyle] = js.undefined,
    subText: js.UndefOr[Null | IStyle] = js.undefined,
    title: js.UndefOr[Null | IStyle] = js.undefined,
    topButton: js.UndefOr[Null | IStyle] = js.undefined
  ): IDialogContentStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (!js.isUndefined(innerContent)) __obj.updateDynamic("innerContent")(innerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(subText)) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(topButton)) __obj.updateDynamic("topButton")(topButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogContentStyles]
  }
}

