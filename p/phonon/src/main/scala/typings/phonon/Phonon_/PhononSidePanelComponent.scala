package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononSidePanelComponent extends js.Object {
  def close(): Unit
  def open(): Unit
}

object PhononSidePanelComponent {
  @scala.inline
  def apply(close: () => Unit, open: () => Unit): PhononSidePanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[PhononSidePanelComponent]
  }
}

