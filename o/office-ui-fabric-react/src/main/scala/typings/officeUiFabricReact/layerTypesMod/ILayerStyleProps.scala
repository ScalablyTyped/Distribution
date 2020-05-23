package typings.officeUiFabricReact.layerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Check if Host
    */
  var isNotHost: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object ILayerStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, isNotHost: js.UndefOr[Boolean] = js.undefined): ILayerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isNotHost)) __obj.updateDynamic("isNotHost")(isNotHost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerStyleProps]
  }
}

