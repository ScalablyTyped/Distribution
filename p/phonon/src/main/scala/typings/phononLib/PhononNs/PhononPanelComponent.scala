package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPanelComponent extends js.Object {
  def close(): scala.Unit
  def open(): scala.Unit
}

object PhononPanelComponent {
  @scala.inline
  def apply(close: js.Function0[scala.Unit], open: js.Function0[scala.Unit]): PhononPanelComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[PhononPanelComponent]
  }
}

