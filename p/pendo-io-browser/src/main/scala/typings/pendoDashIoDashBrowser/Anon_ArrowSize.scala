package typings.pendoDashIoDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowSize extends js.Object {
  var arrowSize: js.UndefOr[Double] = js.undefined
}

object Anon_ArrowSize {
  @scala.inline
  def apply(arrowSize: Int | Double = null): Anon_ArrowSize = {
    val __obj = js.Dynamic.literal()
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrowSize]
  }
}

