package typings.officeUiFabricReact.hoverCardTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoverCardStyles extends js.Object {
  /**
    * Style for the host element in the default enabled, non-toggled state.
    */
  var host: js.UndefOr[IStyle] = js.undefined
}

object IHoverCardStyles {
  @scala.inline
  def apply(host: js.UndefOr[Null | IStyle] = js.undefined): IHoverCardStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardStyles]
  }
}

