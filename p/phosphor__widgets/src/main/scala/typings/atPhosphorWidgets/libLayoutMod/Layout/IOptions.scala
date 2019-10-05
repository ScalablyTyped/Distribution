package typings.atPhosphorWidgets.libLayoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a layout.
  */
trait IOptions extends js.Object {
  /**
    * The fit policy for the layout.
    *
    * The default is `'set-min-size'`.
    */
  var fitPolicy: js.UndefOr[FitPolicy] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(fitPolicy: FitPolicy = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (fitPolicy != null) __obj.updateDynamic("fitPolicy")(fitPolicy)
    __obj.asInstanceOf[IOptions]
  }
}

