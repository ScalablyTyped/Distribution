package typings.officeUiFabricReact.baseCardTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseCardStyleProps extends js.Object {
  /**
    * ClassName to inject into wrapper div of the content.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IBaseCardStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IBaseCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCardStyleProps]
  }
}

