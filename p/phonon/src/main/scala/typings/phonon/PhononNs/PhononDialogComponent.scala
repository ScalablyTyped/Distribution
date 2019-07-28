package typings.phonon.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDialogComponent extends js.Object {
  def on(event: String, callback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): PhononDialogComponent
}

object PhononDialogComponent {
  @scala.inline
  def apply(on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => PhononDialogComponent): PhononDialogComponent = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[PhononDialogComponent]
  }
}

