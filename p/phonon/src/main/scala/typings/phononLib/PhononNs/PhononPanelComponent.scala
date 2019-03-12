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
  def apply(close: () => scala.Unit, open: () => scala.Unit): PhononPanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[PhononPanelComponent]
  }
}

