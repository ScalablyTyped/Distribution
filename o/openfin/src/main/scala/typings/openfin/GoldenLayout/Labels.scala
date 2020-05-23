package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  /**
    * The tooltip text that appears when hovering over the close icon.
    * Default: 'close'
    */
  var close: js.UndefOr[String] = js.undefined
  /**
    * The tooltip text that appears when hovering over the maximise icon.
    * Default: 'maximise'
    */
  var maximise: js.UndefOr[String] = js.undefined
  /**
    * The tooltip text that appears when hovering over the minimise icon.
    * Default: 'minimise'
    */
  var minimise: js.UndefOr[String] = js.undefined
  /**
    * The tooltip text that appears when hovering over the popout icon.
    * Default: 'open in new window'
    */
  var popout: js.UndefOr[String] = js.undefined
}

object Labels {
  @scala.inline
  def apply(close: String = null, maximise: String = null, minimise: String = null, popout: String = null): Labels = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (maximise != null) __obj.updateDynamic("maximise")(maximise.asInstanceOf[js.Any])
    if (minimise != null) __obj.updateDynamic("minimise")(minimise.asInstanceOf[js.Any])
    if (popout != null) __obj.updateDynamic("popout")(popout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

