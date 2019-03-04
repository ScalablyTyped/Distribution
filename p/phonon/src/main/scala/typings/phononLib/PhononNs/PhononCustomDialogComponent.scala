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
    close: js.Function0[scala.Unit],
    on: js.Function2[
      java.lang.String, 
      js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit], 
      PhononDialogComponent
    ],
    open: js.Function0[scala.Unit]
  ): PhononCustomDialogComponent = {
    val __obj = js.Dynamic.literal(close = close, on = on, open = open)
  
    __obj.asInstanceOf[PhononCustomDialogComponent]
  }
}

