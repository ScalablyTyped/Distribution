package typings.officeUiFabricReact.dialogContentTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogContentStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The classname for when the header is draggable
    */
  var draggableHeaderClassName: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isClose: js.UndefOr[Boolean] = js.undefined
  var isLargeHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Is inside a multiline wrapper
    */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDialogContentStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    draggableHeaderClassName: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isClose: js.UndefOr[Boolean] = js.undefined,
    isLargeHeader: js.UndefOr[Boolean] = js.undefined,
    isMultiline: js.UndefOr[Boolean] = js.undefined
  ): IDialogContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (draggableHeaderClassName != null) __obj.updateDynamic("draggableHeaderClassName")(draggableHeaderClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isClose)) __obj.updateDynamic("isClose")(isClose.asInstanceOf[js.Any])
    if (!js.isUndefined(isLargeHeader)) __obj.updateDynamic("isLargeHeader")(isLargeHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogContentStyleProps]
  }
}

