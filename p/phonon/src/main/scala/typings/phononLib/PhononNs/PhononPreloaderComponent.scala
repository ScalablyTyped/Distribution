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
  def apply(hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
}

