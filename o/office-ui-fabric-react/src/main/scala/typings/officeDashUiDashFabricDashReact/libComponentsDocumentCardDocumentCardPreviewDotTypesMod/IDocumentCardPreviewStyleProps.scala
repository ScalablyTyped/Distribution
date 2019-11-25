package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardPreviewDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Is it a list of files rather than a preview image?
    */
  var isFileList: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardPreviewStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, isFileList: js.UndefOr[Boolean] = js.undefined): IDocumentCardPreviewStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isFileList)) __obj.updateDynamic("isFileList")(isFileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewStyleProps]
  }
}

