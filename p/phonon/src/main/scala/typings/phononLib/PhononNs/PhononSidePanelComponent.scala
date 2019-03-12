package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononSidePanelComponent extends js.Object {
  def close(): scala.Unit
  def open(): scala.Unit
}

object PhononSidePanelComponent {
  @scala.inline
  def apply(close: () => scala.Unit, open: () => scala.Unit): PhononSidePanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[PhononSidePanelComponent]
  }
}

