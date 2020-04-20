package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononCustomDialogComponent extends PhononDialogComponent {
  def close(): Unit
  def open(): Unit
}

object PhononCustomDialogComponent {
  @scala.inline
  def apply(
    close: () => Unit,
    on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => PhononDialogComponent,
    open: () => Unit
  ): PhononCustomDialogComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PhononCustomDialogComponent]
  }
}

