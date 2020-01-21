package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPanelComponent extends js.Object {
  def close(): Unit
  def open(): Unit
}

object PhononPanelComponent {
  @scala.inline
  def apply(close: () => Unit, open: () => Unit): PhononPanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[PhononPanelComponent]
  }
}

