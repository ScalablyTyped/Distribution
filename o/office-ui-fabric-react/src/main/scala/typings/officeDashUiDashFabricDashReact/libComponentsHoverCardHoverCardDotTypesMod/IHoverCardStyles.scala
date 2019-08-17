package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(host: IStyle = null): IHoverCardStyles = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardStyles]
  }
}

