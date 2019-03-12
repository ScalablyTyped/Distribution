package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPreloaderComponent extends js.Object {
  def hide(): scala.Unit
  def show(): scala.Unit
}

object PhononPreloaderComponent {
  @scala.inline
  def apply(hide: () => scala.Unit, show: () => scala.Unit): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
}

