package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */
trait ApplicationData extends js.Object {
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(showBorders: js.UndefOr[Boolean] = js.undefined, showToolbars: js.UndefOr[Boolean] = js.undefined): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolbars)) __obj.updateDynamic("showToolbars")(showToolbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationData]
  }
}

