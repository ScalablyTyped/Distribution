package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
trait ApplicationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
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

object ApplicationLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showToolbars: js.UndefOr[Boolean] = js.undefined
  ): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders)
    if (!js.isUndefined(showToolbars)) __obj.updateDynamic("showToolbars")(showToolbars)
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
}

