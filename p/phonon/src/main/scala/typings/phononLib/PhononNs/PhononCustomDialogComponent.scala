package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononCustomDialogComponent extends PhononDialogComponent {
  def close(): scala.Unit
  def open(): scala.Unit
}

object PhononCustomDialogComponent {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    on: (java.lang.String, js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]) => PhononDialogComponent,
    open: () => scala.Unit
  ): PhononCustomDialogComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[PhononCustomDialogComponent]
  }
}

